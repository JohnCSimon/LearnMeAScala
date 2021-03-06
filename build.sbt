name := """adRotator"""
organization := "horse.endless"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.3"

/*
libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.0" % Test
*/

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.1" % Test,
  "org.mongodb" %% "casbah" % "3.1.1",
  specs2 % Test,
  "org.reactivemongo" %% "play2-reactivemongo" % "0.12.6-play26"

// , "org.slf4j" % "slf4j-simple" % "1.6.4"
)
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "horse.endless.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "horse.endless.binders._"
