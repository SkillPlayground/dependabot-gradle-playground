@file:Suppress("PropertyName", "VariableNaming")

// catalog start

// [versions]
val kotlin3 = "1.5.10"

// [libraries]
val jetbrains_kotlin_plugin3 = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin3"
val jetbrains_kotlin_serialization3 = "org.jetbrains.kotlin:kotlin-serialization:$kotlin3"

// [bundles]
val plugins_kotlin3 = jetbrains_kotlin_plugin3 + jetbrains_kotlin_serialization3

// catalog end
