plugins {
    kotlin("jvm") version "1.9.20-Beta"
    kotlin("kapt") version "1.9.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    compileOnly("com.google.auto.value:auto-value:1.2")
    kapt("com.google.auto.value:auto-value:1.2")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}