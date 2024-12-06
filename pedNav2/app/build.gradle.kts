plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.pednav"
    compileSdk = 34

    buildFeatures {
        dataBinding = true
    }
    defaultConfig {
        applicationId = "com.example.pednav"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

val composeVersion = "1.3.1"
val composeUiVersion = "1.3.3"

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // TMapUISDK
    implementation("com.tmapmobility.tmap:tmap-ui-sdk:1.0.0.0078")

    // for vsm sdk
    implementation("com.google.flatbuffers:flatbuffers-java:1.11.0")

    // Dependency for Navi SDK
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:adapter-rxjava2:2.9.0")
    implementation("com.google.android.exoplayer:exoplayer:2.17.1")
    implementation("com.google.android.exoplayer:exoplayer-core:2.17.1")
    implementation("com.google.android.exoplayer:exoplayer-ui:2.17.1")

    // Dependency for UI SDK
    implementation("androidx.appcompat:appcompat:1.5.1")
    implementation("androidx.compose.ui:ui:$composeUiVersion")
    implementation("androidx.compose.foundation:foundation:$composeVersion")
    implementation("androidx.compose.material:material:$composeVersion")
    implementation("androidx.compose.material:material-icons-core:$composeVersion")
    implementation("androidx.compose.material:material-icons-extended:$composeVersion")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.1")
    implementation("com.github.bumptech.glide:glide:4.13.2")
    implementation("com.google.android.gms:play-services-location:17.0.0")
    implementation("com.airbnb.android:lottie:3.0.7")
}