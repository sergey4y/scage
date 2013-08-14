name := "scage"

version := "0.9.3-SNAPSHOT"

scalaVersion := "2.10.1"

resolvers ++= Seq(
	"dunnololda's maven repo" at "https://raw.github.com/dunnololda/mvn-repo/master",
	"Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
	"Scala-Tools Maven2 Repository" at "https://oss.sonatype.org/content/groups/scala-tools/"
)

libraryDependencies ++= Seq(
	"com.github.dunnololda" % "cli_2.10.1" % "1.2",
	"org.slf4j" % "slf4j-api" % "1.6.1" % "compile",
	"com.novocode" % "junit-interface" % "0.10" % "test->default",
	"org.scala-lang" % "scala-swing" % "2.10.1"
)

seq(slickSettings: _*)

slick.version := "274"

//@see https://github.com/philcali/sbt-lwjgl-plugin/issues/25
seq(oldLwjglSettings: _*)