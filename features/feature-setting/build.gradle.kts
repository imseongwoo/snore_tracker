plugins {
    id("com.android.library")
}
apply(from = file("../../base-build.gradle"))


android {
    namespace = "com.ownsnoretracker.feature_setting"
}

dependencies {
    implementation(project(":core"))
}