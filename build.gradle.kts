buildscript {
    val compose_ui_version: String by extra("1.5.4")
    val kotlin_version: String by extra("1.9.0")
    val hilt_version: String by extra("2.48")
    val lifecycle_version: String by extra("2.6.1")
    val activity_compose_version: String by extra("1.8.2")
    val compose_material_version: String by extra("1.5.4")
    val hilt_navigation_version: String by extra("1.1.0")
    val retrofit_version: String by extra("2.9.0")

    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:${hilt_version}")
        classpath("com.google.gms:google-services:4.4.1")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.3" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
}