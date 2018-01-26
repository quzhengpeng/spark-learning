lazy val root = (project in file("."))
  .settings(
    name := "spark-learning",
    scalaVersion := "2.11.12",
    version := "0.1"
  )

libraryDependencies ++= Seq(
  //  "com.hadoop.gplcompression" % "hadoop-lzo" % "0.4.20",
  "com.sun.mail" % "javax.mail" % "1.6.0",
  "com.typesafe.akka" % "akka-actor_2.11" % "2.5.6",
  "joda-time" % "joda-time" % "2.9.9",
  "org.apache.hadoop" % "hadoop-common" % "2.9.0",
  "org.apache.hive" % "hive-exec" % "2.3.2",
  "org.apache.spark" % "spark-core_2.11" % "2.2.0",
  "org.apache.spark" % "spark-mllib_2.11" % "2.2.0",
  "org.apache.spark" % "spark-sql_2.11" % "2.2.0",
  "org.scala-lang" % "scala-actors" % "2.11.12",
  "org.scala-lang" % "scala-compiler" % "2.11.12",
  "org.scala-lang" % "scala-library" % "2.11.12",
  "org.scala-lang" % "scala-reflect" % "2.11.12",
  "org.specs2" % "specs2-core_2.11" % "4.0.1" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")
assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)