import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "io.mandrake"
version = "1.0-SNAPSHOT"

buildscript {
//    var kotlinVersion: String by extra
//    var kotlinTestVersion: String by extra
//
//    kotlinVersion = "1.3.10"
//    kotlinTestVersion = "3.1.10"
}

val kotlinVersion: String by extra { "1.3.10" }
val junitVersion: String by extra { "5.3.2" }

repositories {
    jcenter()
//    mavenCentral()
}

plugins {
    kotlin("jvm") version "1.3.10"
    application
    java
}

application {
    mainClassName = "io.mandrake.effective.Main"
}

dependencies {
//    compile(kotlin(module = "stdlib-jre8", version = kotlinVersion))
    compile(kotlin(module = "stdlib", version = kotlinVersion))

    testCompile("io.kotlintest:kotlintest-runner-junit5:3.1.10")

    testCompile("org.junit.jupiter:junit-jupiter-api:$junitVersion")
    testCompile("org.junit.jupiter:junit-jupiter-params:$junitVersion")
    testCompile("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
    testCompile("org.assertj:assertj-core:3.11.1")
}

val test by tasks.getting(Test::class) {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

tasks.withType<Wrapper> {
    gradleVersion = "4.10"
}

val compileKotlin by tasks.getting(KotlinCompile::class) {
    // Customise the “compileKotlin” task.
    kotlinOptions.jvmTarget = "1.8"
    doLast { println("Finished compiling Kotlin source code") }
}
val compileTestKotlin by tasks.getting(KotlinCompile::class) {
    // Customise the “compileTestKotlin” task.
    kotlinOptions.jvmTarget = "1.8"
    doLast { println("Finished compiling Kotlin source code for testing") }
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
