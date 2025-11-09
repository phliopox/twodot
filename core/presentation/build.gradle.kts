plugins {
    alias(libs.plugins.twodot.android.library)
    alias(libs.plugins.twodot.hilt)
    alias(libs.plugins.twodot.android.library.compose)
}

android {
    namespace = "info..towdak.core.presentation"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.common)

    implementation(libs.androidx.viewmodel)

    androidTestImplementation(libs.androidx.runner)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

}