plugins {
    alias(libs.plugins.chatplus.android.library)
    alias(libs.plugins.chatplus.android.library.compose)
}

android {
    namespace = "com.mg.chat.plus.core.designsystem"
}

dependencies {
    api(libs.androidx.compose.material3)
    api(libs.androidx.compose.ui)
}