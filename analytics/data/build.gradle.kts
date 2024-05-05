plugins {
    alias(libs.plugins.runique.android.library)
}

android {
    namespace = "codes.saurabh.analytics.data"
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.bundles.koin)

    implementation(projects.core.database)
    implementation(projects.core.domain)
    implementation(projects.analytics.domain)
}