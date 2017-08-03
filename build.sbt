name := """Test_My"""
organization := "charith.tutorial.framework.play"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies += javaJdbc
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"
libraryDependencies += guice
libraryDependencies += "org.webjars" % "bootstrap" % "3.3.4"

lazy val myProject = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean)