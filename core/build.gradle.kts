plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

kotlin {
    js().browser()
    android {
        publishAllLibraryVariants()
    }
    ios()

    sourceSets {
        val commonMain by getting {
            dependencies {
                api("com.benasher44:uuid:0.2.2")
            }
        }
    }
}

android {
    compileSdkVersion(30)

    defaultConfig {
        minSdkVersion(21)
    }

    sourceSets {
        val main by getting {
            manifest.apply {
                srcFile("src/androidMain/AndroidManifest.xml")
            }
        }
    }
}
