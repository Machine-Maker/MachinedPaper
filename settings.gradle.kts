pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "MachinedPaper"

for (name in listOf("MachinedPaper-API", "MachinedPaper-Server")) {
    val projName = name.toLowerCase(java.util.Locale.ENGLISH)
    include(projName)
    findProject(":$projName")!!.projectDir = file(name)
}
