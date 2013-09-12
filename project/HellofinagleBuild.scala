import sbt._
import sbt.Keys._

object HellofinagleBuild extends Build {

  lazy val hellofinagle = Project(
    id = "hello-finagle",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "hello-finagle",
      organization := "org.taketoncheir",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.2",
      // add other settings here
      resolvers ++= Seq(
        "Twitter Repository" at "http://maven.twttr.com/",
        "Sonatype Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
        "Sonatype Releases" at "http://oss.sonatype.org/content/repositories/releases"
      ),
      libraryDependencies ++= Seq(
        "com.twitter" %% "finagle-http" % "6.5.2",
        "org.scalacheck" %% "scalacheck" % "1.10.1"
      )
    )
  )
}
