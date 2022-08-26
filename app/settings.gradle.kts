rootProject.name = "app"

includeBuild("../lib1")
includeBuild("../lib2")

apply(from = "../common-settings.gradle.kts")
