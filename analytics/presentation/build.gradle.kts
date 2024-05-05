plugins {
    alias(libs.plugins.runique.android.feature.ui)
}

android {
    namespace = "codes.saurabh.analytics.presentation"
}

dependencies {
    implementation(projects.analytics.domain)
}