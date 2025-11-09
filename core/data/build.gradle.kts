plugins {
    alias(libs.plugins.twodot.hilt)
    alias(libs.plugins.twodot.jvm.library)
    id("com.google.devtools.ksp")
}

dependencies{
    implementation(projects.core.domain)
    implementation(projects.core.common)

    implementation(libs.snadwich.retrofit)

    implementation(libs.kotlinx.coroutines.core)
    testImplementation(libs.kotlinx.coroutines.test)
    implementation(libs.gson)

}