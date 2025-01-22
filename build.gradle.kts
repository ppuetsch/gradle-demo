val ktlintVersion = "1.3.1"
val jvmVersion = JavaVersion.VERSION_21

allprojects {
    repositories {
        mavenCentral()
        maven { url = uri("https://repo.gradle.org/gradle/libs-releases") }    }
}

subprojects {
    apply(plugin = "io.spring.dependency-management")
//    apply(plugin = "org.jlleitschuh.gradle.ktlint")
//    apply(plugin = "com.github.ben-manes.versions")
//    apply(plugin = "com.github.jk1.dependency-license-report")
    apply(plugin = "org.jetbrains.kotlin.jvm")


    group = "com.ppuetsch"
    version = "0.0.1-SNAPSHOT"
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict", "-opt-in=kotlin.RequiresOptIn")
            jvmTarget = jvmVersion.majorVersion
        }
    }
//    sonar {
//        isSkipProject = true
//    }
//    ktlint {
//        version.set(ktlintVersion)
//    }
    kotlin {
        jvmToolchain(jvmVersion.majorVersion.toInt())
    }
    java {
        toolchain {
            languageVersion = JavaLanguageVersion.of(jvmVersion.majorVersion.toInt())
        }
    }
}

//sonar {
//    properties {
//        property("sonar.projectKey", "ppuetsch_gradle-demo")
//        property("sonar.organization", "ppuetsch")
//        property("sonar.host.url", "https://sonarcloud.io")
//    }
//}

//dependencies {
//    detekt("io.gitlab.arturbosch.detekt:detekt-cli:1.23.7")
//}

plugins {
//    id("org.sonarqube") version "6.0.1.5171"
//    id("com.github.jk1.dependency-license-report") version "2.8"
//    id("io.gitlab.arturbosch.detekt") version "1.23.7"
    id("org.springframework.boot") version "3.4.1" apply false
    id("io.spring.dependency-management") version "1.1.7"
//    id("org.jlleitschuh.gradle.ktlint") version "12.1.1"
    kotlin("jvm") version "1.9.25"
    kotlin("plugin.spring") version "1.9.25" apply false
//    id("org.springdoc.openapi-gradle-plugin") version "1.9.0" apply false
//    id("org.openapi.generator") version "7.10.0" apply false
//    id("com.github.ben-manes.versions") version "0.51.0"
}

//detekt {
//    buildUponDefaultConfig = true
//    allRules = false
//    config.setFrom("$projectDir/config/detekt.yml")
//    baseline = file("$projectDir/config/baseline.xml")
//    val detektFileTree = fileTree("$projectDir")
//    detektFileTree.exclude("**/build/**").exclude(".gradle")
//    detektFileTree.exclude("**/ReferencedReportsListValidator.kt")
//    source.setFrom(detektFileTree)
//}
//
//tasks.withType<io.gitlab.arturbosch.detekt.Detekt>().configureEach {
//    reports {
//        html.required.set(true)
//        xml.required.set(true)
//        txt.required.set(true)
//        sarif.required.set(true)
//    }
//}
//
//ktlint {
//    version.set(ktlintVersion)
//}
