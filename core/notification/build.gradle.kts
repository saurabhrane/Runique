plugins {
    alias(libs.plugins.runique.android.library)
}

android {
    namespace = "codes.saurabh.core.notification"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.bundles.koin)

    implementation(projects.core.domain)
    implementation(projects.core.presentation.ui)
    implementation(projects.core.presentation.designsystem)
}