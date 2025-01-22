plugins {
	kotlin("plugin.spring")
	id("org.springframework.boot")
}

dependencies {
	implementation(project(":double-library"))
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.register("do_something_in_spring_demo") {
	group="Custom"
	description = "Prepares something"
	doLast {
		println("Ich bin aus spring-demo")
	}
}