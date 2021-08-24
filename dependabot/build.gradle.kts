@file:Suppress("PropertyName", "VariableNaming")

// catalog start

// [versions]
val kotlin = "1.5.30"

// [libraries]
val jetbrains_kotlin_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin"
val jetbrains_kotlin_serialization = "org.jetbrains.kotlin:kotlin-serialization:$kotlin"

// [bundles]
val plugins_kotlin = jetbrains_kotlin_plugin + jetbrains_kotlin_serialization

// catalog end
