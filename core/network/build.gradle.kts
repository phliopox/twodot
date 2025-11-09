import info.towdak.convention.DevConfig
import info.towdak.convention.ProductConfig
import info.towdak.convention.configureFlavorSettings
import info.towdak.convention.TwoDotsFlavor

plugins {
    alias(libs.plugins.twodot.android.library)
    alias(libs.plugins.twodot.hilt)
    id("kotlinx-serialization")
}

android {
    namespace = "info.towdak.core.network"

    buildFeatures {
        buildConfig = true
    }
    testOptions {
        unitTests {
            isIncludeAndroidResources = true
        }
    }

    buildTypes {
        debug {
            isMinifyEnabled = false
        }
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                file("${rootProject.rootDir.absolutePath}/proguard-rules.pro")
            )
        }
    }

    configureFlavorSettings(this) { flavor ->
        when (flavor) {
            TwoDotsFlavor.dev -> {
                /*buildConfigField(
                    "String",
                    "API_SERVER",
                    "\"${DevConfig.API_SERVER}\""
                )*/
            }

            TwoDotsFlavor.product -> {
               /* buildConfigField(
                    "String",
                    "API_SERVER",
                    "\"${ProductConfig.API_SERVER}\""
                )*/
            }
        }
    }
}

dependencies {
    implementation(projects.core.data)
    implementation(projects.core.common)

    implementation(libs.snadwich.retrofit)

    implementation(libs.kotlinx.serialization.json)
    implementation(libs.okhttp.logging)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.kotlin.serialization)

    testImplementation(libs.kotlinx.coroutines.test)

}