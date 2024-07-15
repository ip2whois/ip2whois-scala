ThisBuild / version := "1.0.0"

ThisBuild / scalaVersion := "3.3.3"

lazy val root = (project in file("."))
  .settings(
    name := "ip2whois-scala"
  )
