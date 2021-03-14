pluginManagement {
    plugins {
        id("org.jmailen.kotlinter") version "3.3.0"
    }
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }

}
rootProject.name = "MyApplication"


include(":androidApp")
include(":shared")

