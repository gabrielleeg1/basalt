dependencies {
  implementation("org.jetbrains.kotlin:kotlin-scripting-common")
  implementation("org.jetbrains.kotlin:kotlin-scripting-jvm")
  implementation("org.jetbrains.kotlin:kotlin-scripting-dependencies")
  implementation("org.jetbrains.kotlin:kotlin-scripting-dependencies-maven")
  // coroutines dependency is required for this particular definition
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

  implementation(project(":extension"))
  implementation(project(":server"))
}
