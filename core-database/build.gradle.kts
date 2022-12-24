plugins {
    id("java-library")
    id("kotlin-kapt")
    id("org.jetbrains.kotlin.jvm")
}



java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    annotationProcessor(libs.androidx.room.compiler)
    annotationProcessor(libs.androidx.room.runtime)
    annotationProcessor(libs.androidx.room.ktx)
}