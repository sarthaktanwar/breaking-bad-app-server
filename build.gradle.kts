

plugins {
    application
    kotlin("jvm") version "1.7.10"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.7.10"
}

group = "com.example"
version = "0.0.1"
application {
    mainClass.set("io.ktor.server.netty.EngineMain")

    val isDevelopment: Boolean = project.ext.has("development")
    applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
    mavenCentral()
}

dependencies {

    implementation("io.ktor:ktor-server-core:2.0.1")
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.0.1")
    implementation("io.ktor:ktor-server-netty:2.0.1")
    implementation("ch.qos.logback:logback-classic:1.2.11")
    implementation("io.ktor:ktor-server-call-logging:2.0.1")
    implementation("io.ktor:ktor-server-status-pages:2.0.1")
    implementation("io.ktor:ktor-server-content-negotiation:2.0.1")
    implementation("io.ktor:ktor-server-default-headers:2.0.1")

    testImplementation("io.ktor:ktor-server-tests:2.0.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.7.10")

    implementation("io.insert-koin:koin-ktor:3.2.2")
    implementation("io.insert-koin:koin-logger-slf4j:3.2.2")



}