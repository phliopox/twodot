plugins {
    alias(libs.plugins.twodot.jvm.library)
    alias(libs.plugins.twodot.hilt)
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.turbine)
}