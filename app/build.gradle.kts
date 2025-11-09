import info.towdak.convention.ApplicationId
import info.towdak.convention.DevConfig
import info.towdak.convention.ImdangFlavor
import info.towdak.convention.ProductConfig
import info.towdak.convention.Release
import info.towdak.convention.configureFlavorSettings


plugins {
    alias(libs.plugins.twodot.android.application)
    alias(libs.plugins.twodot.android.application.compose)
    alias(libs.plugins.twodot.android.application.flavors)
    alias(libs.plugins.twodot.hilt)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.twodot.android.firebase)
    alias(libs.plugins.google.services)
}

android {
    namespace = "info.towdak.towdot"

    defaultConfig {
        applicationId = ApplicationId.id
        versionCode = Release.versionCoded
        versionName = Release.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
        buildConfig = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation(libs.androidx.compose.material3.adaptive)
    implementation(libs.androidx.compose.material3.adaptive.layout)
    implementation(libs.androidx.compose.material3.adaptive.navigation)
    implementation(libs.androidx.compose.material3.windowSizeClass)
    implementation(libs.androidx.hilt.navigation.compose)
    implementation(libs.androidx.lifecycle.runtimeCompose)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.window.core)
    implementation(libs.kotlinx.serialization.json)

    ksp(libs.hilt.compiler)

    implementation(libs.kakao.login)
    implementation(libs.kakao.share)

}