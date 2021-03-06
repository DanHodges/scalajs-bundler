enablePlugins(ScalaJSBundlerPlugin)
scalaVersion := "2.12.3"
scalaJSUseMainModuleInitializer := true
npmDependencies in Compile += "left-pad" -> "1.1.3"
libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.3" % Test

ivyLoggingLevel in ThisBuild := UpdateLogging.Quiet
