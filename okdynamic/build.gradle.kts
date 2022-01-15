plugins {
    id("com.android.library")
    id("kotlin-android")
    id("maven-publish")
}

version = "0.1.0"
group = "com.github.jimlyas"

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("OkDynamic") {
                from(components["debug"])
                groupId = project.group.toString()
                artifactId = project.name
                version = project.version.toString()
            }
        }
        repositories {
            maven {
                setUrl("https://maven.pkg.github.com/jimlyas/okdynamic")
                credentials {
                    username = properties["username_github"].toString()
                    password = properties["key_github"].toString()
                }
            }
        }
    }
}

android {
    compileSdk = 31

    defaultConfig {
        minSdk = 21
        targetSdk = 31

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        getByName("release") {
            isMinifyEnabled = true
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
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("com.squareup.okhttp3:okhttp:5.0.0-alpha.3")
    testImplementation("junit:junit:5.0.0")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}