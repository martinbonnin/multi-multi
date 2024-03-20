plugins {
    id("org.jetbrains.kotlin.jvm")
    id("com.apollographql.apollo3")
}

dependencies {
    implementation("com.apollographql.apollo3:apollo-runtime")
}

apollo {
    service("queries") {
        srcDir("src/main/graphql/queries")
        packageName.set("com.example")
        generateApolloMetadata.set(true)
        alwaysGenerateTypesMatching.set(listOf(".*"))
    }
    service("subscriptions") {
        srcDir("src/main/graphql/subscriptions")
        packageName.set("com.example")
        generateApolloMetadata.set(true)
        alwaysGenerateTypesMatching.set(listOf(".*"))
    }
}