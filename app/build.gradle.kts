plugins {
    id("com.android.application")
}

apply(from = file("../base-build.gradle"))

android {
    namespace = "com.ownsnoretracker.app"
}

dependencies {
    implementation(project(":core"))
    implementation(project(":features:feature-main"))
    implementation(project(":features:feature-navigation"))
}