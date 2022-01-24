import org.jetbrains.SetupMaven
import org.jetbrains.dependsOnMavenLocalPublication

evaluationDependsOn(":runners:maven-plugin")

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("test-junit"))
}

