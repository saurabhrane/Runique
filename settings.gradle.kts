pluginManagement {
    includeBuild("build-logic")
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

gradle.startParameter.excludedTaskNames.addAll(listOf(":build-logic:convention:testClasses"))

rootProject.name = "Runique"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
include(":app")
include(":auth:data")
include(":auth:presentation")
include(":auth:domain")
include(":core:data")
include(":core:database")
include(":core:domain")
include(":core:presentation:ui")
include(":core:presentation:designsystem")
include(":run:presentation")
include(":run:domain")
include(":run:data")
include(":run:location")
include(":run:network")
include(":analytics:data")
include(":analytics:presentation")
include(":analytics:domain")
include(":analytics:analytics-feature")
include(":wear:app")
include(":wear:run:data")
include(":wear:run:domain")
include(":wear:run:presentation")
include(":core:presentation:designsystem_wear")
include(":core:connectivity:domain")
include(":core:connectivity:data")
include(":core:notification")
