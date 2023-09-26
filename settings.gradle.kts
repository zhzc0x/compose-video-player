pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }

    plugins {
        kotlin("jvm") version extra["kotlin.version"] as String
        id("org.jetbrains.compose") version extra["compose.version"] as String
        id("org.openjfx.javafxplugin") version extra["javafxplugin.version"] as String
    }
}


rootProject.name = "compose-video-player"
include(":library")
