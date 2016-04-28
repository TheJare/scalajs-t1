enablePlugins(ScalaJSPlugin)
name := "Scala.js T1"
scalaVersion := "2.11.8"

persistLauncher in Compile := true
persistLauncher in Test := false

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.0"

skip in packageJSDependencies := false
jsDependencies +=
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"
libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.9.0"
