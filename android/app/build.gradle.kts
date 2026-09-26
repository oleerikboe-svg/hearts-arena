plugins { id("com.android.application") }

android {
    namespace = "com.heartsarena.game"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.heartsarena.game"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.webkit:webkit:1.12.1")
}
