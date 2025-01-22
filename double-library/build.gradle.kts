import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    dependsOn("do_something_in_double_library")
}

tasks.register("do_something_in_double_library") {
    group="Custom"
    description = "Prepares the build"
    doLast {
        println("Ich bin aus double-library")
    }
    dependsOn(":spring-demo:do_something_in_spring_demo")
}