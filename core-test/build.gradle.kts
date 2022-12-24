plugins {
    id("com.android.library")
    kotlin("kapt")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.tumusx.core_test"
    compileSdk = 33

    defaultConfig {
        minSdk = 23
        targetSdk = 33

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    testImplementation(libs.junit)
    testImplementation(libs.coroutineTest)
    testImplementation(libs.hamcrest.test)
    androidTestImplementation(libs.junit.android)
    testImplementation(libs.junit.android.core)
}