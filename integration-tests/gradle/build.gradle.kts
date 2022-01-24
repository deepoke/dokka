import org.jetbrains.dependsOnMavenLocalPublication

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("test-junit"))
    implementation(gradleTestKit())

    val jsoup_version: String by project
    implementation("org.jsoup:jsoup:$jsoup_version")
}



tasks.clean {
    delete(File(buildDir, "gradle-test-kit"))
}
