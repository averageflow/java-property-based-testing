plugins {
    id("java")
}

group = "nl.averageflow"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    testImplementation("net.jqwik:jqwik:1.6.5")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform() {
        includeEngines ("jqwik", "junit-jupiter")
    }
}