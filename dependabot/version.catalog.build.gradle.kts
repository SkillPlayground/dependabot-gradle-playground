@file:Suppress("PropertyName", "VariableNaming")

// catalog start

// [versions]
val kotlin2 = "1.5.10"

// [libraries]
val jetbrains_kotlin_plugin2 = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin2"
val jetbrains_kotlin_serialization2 = "org.jetbrains.kotlin:kotlin-serialization:$kotlin2"

// [bundles]
val plugins_kotlin2 = jetbrains_kotlin_plugin2 + jetbrains_kotlin_serialization2

// catalog end
