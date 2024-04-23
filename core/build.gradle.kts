plugins {
    id("com.android.library")
}
apply(from = file("../base-build.gradle"))

android {
    namespace = "com.ownsnoretracker.core"
}

dependencies {
    api(project(":ui-components"))
}
