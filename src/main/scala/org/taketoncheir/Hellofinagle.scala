package org.taketoncheir

import com.twitter.finagle.{Http, Service}
import com.twitter.util.{Await, Future}
import java.net.InetSocketAddress
import org.jboss.netty.handler.codec.http._

object Hellofinagle extends App {
  println("Hello, hello-finagle")

  val server = Http.serve(":8080", client)
  // without lazy, if causes NullPointerException in server!!
  lazy val client : Service[HttpRequest, HttpResponse] = Http.newService("www.google.com:80")

  Await.ready(server)
}
