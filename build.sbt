val sharedSettings = Seq[Setting[_]](
  organization := "l2linkage.myutils",
          name := s"myutils-${thisProject.value.id}",
       version := "1.0",

  scalaVersion := "2.11.6"
)

lazy val root = (project in file(".")
  settings (sharedSettings: _*)
  aggregate (lib1, lib2, core)
)

lazy val lib1 = (project
  settings (sharedSettings: _*)
  dependsOn core
)

lazy val lib2 = (project
  settings (sharedSettings: _*)
  dependsOn core
)

lazy val core = (project
  settings (sharedSettings: _*)
)
