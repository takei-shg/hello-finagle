package org.taketoncheir

import com.twitter.finagle.{Http, Service}
import com.twitter.util.{Await, Future}
import java.net.InetSocketAddress
import org.jboss.netty.handler.codec.http.{HttpResponseStatus, DefaultHttpResponse, HttpResponse, HttpRequest}

object Hellofinagle extends App {
  println("Hello, hello-finagle")

  val service = new Service[HttpRequest, HttpResponse] {

    def apply(req: HttpRequest): Future[HttpResponse] =
      Future.value(new DefaultHttpResponse(req.getProtocolVersion, HttpResponseStatus.OK))
  }

  val server = Http.serve(":8080", service)
  Await.ready(server)
}
