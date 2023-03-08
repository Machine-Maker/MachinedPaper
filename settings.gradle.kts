pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "MachinedPaper"

include("machinedpaper-api", "machinedpaper-server")
