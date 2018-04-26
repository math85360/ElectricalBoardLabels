enablePlugins(ScalaJSPlugin)

name := "ElectricalBoardLabels"

scalaVersion := "2.12.3"

scalaJSUseMainModuleInitializer := true

val circeVersion = "0.9.3"

libraryDependencies ++= Seq(
  "io.circe" %%% "circe-core",
  "io.circe" %%% "circe-generic",
  "io.circe" %%% "circe-parser"
).map(_ % circeVersion)

libraryDependencies ++= Seq(
    "com.github.japgolly.scalajs-react" %%% "ext-monocle" % "1.2.0",
    "com.github.julien-truffaut" %%%  "monocle-core"  % "1.5.0",
    "com.github.julien-truffaut" %%%  "monocle-macro" % "1.5.0"
)

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.1" cross CrossVersion.full)

libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "1.2.0"

libraryDependencies += "com.github.japgolly.scalajs-react" %%% "extra" % "1.2.0"

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.5"

libraryDependencies += "com.github.japgolly.scalacss" %%% "core" % "0.5.3"

libraryDependencies += "com.github.japgolly.scalacss" %%% "ext-react" % "0.5.3"

libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.6.7"

jsDependencies ++= Seq(

  "org.webjars.npm" % "react" % "16.2.0"
    /        "umd/react.development.js"
    minified "umd/react.production.min.js"
    commonJSName "React",

  "org.webjars.npm" % "react-dom" % "16.2.0"
    /         "umd/react-dom.development.js"
    minified  "umd/react-dom.production.min.js"
    dependsOn "umd/react.development.js"
    commonJSName "ReactDOM",

  "org.webjars.npm" % "react-dom" % "16.2.0"
    /         "umd/react-dom-server.browser.development.js"
    minified  "umd/react-dom-server.browser.production.min.js"
    dependsOn "umd/react-dom.development.js"
    commonJSName "ReactDOMServer")