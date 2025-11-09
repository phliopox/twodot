plugins {
    alias(libs.plugins.twodot.android.library)
    alias(libs.plugins.twodot.hilt)
}

android {
    namespace = "info.towdak.core.datastore"

    defaultConfig {
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }
}

dependencies {
    implementation(projects.core.data)
    implementation(projects.core.datastoreProto)
    implementation(projects.core.common)

    api(libs.androidx.dataStore)

    testImplementation(libs.kotlinx.coroutines.test)
}