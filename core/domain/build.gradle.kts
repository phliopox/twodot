plugins {
    alias(libs.plugins.twodot.hilt)
    alias(libs.plugins.twodot.jvm.library)
    id("com.google.devtools.ksp")
}


dependencies {
    implementation(projects.core.common)

    implementation(libs.kotlinx.coroutines.core)
    testImplementation(libs.kotlinx.coroutines.test)
}