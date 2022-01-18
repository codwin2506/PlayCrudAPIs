name := """play-rest-api-crud"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.8"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
libraryDependencies ++= Seq(
  "org.postgresql" % "postgresql" % "42.3.1",
  "com.typesafe.play" %% "play-slick" % "5.0.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "5.0.0",
  "org.scalikejdbc" %% "scalikejdbc" % "3.4.1",
  "com.typesafe.slick" %% "slick" % "3.3.3"
)
libraryDependencies += specs2 % Test
libraryDependencies += jdbc % Test
libraryDependencies += "org.mockito" % "mockito-all" % "1.10.19"
libraryDependencies +=  "org.mockito" % "mockito-core" % "1.9.5" % "test"
libraryDependencies += "javax.inject" % "javax.inject" % "1"
libraryDependencies += evolutions