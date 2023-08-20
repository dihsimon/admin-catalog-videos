plugins {
    id("java")
}

group = "com.carmona.catalog.application"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(project(":domain"))
}

tasks.test {
    useJUnitPlatform()
}