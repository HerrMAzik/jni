plugins {
    java
    kotlin("jvm") version "1.3.72"
}

group = "com.man"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("net.java.dev.jna:jna:5.5.0")
    implementation("org.bytedeco:javacpp:1.5.3")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_14
}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "13"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "13"
    }
}
