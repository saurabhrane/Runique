package codes.saurabh.wear.app.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.wear.compose.material3.Button
import androidx.wear.compose.material3.Text
import codes.saurabh.core.notification.ActiveRunService
import codes.saurabh.core.presentation.designsystem_wear.RuniqueTheme
import codes.saurabh.wear.run.presentation.TrackerScreenRoot

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        super.onCreate(savedInstanceState)

        setContent {
            RuniqueTheme {
                TrackerScreenRoot(
                    onServiceToggle = { shouldStartRunning ->
                        if(shouldStartRunning) {
                            startService(
                                ActiveRunService.createStartIntent(
                                    applicationContext, this::class.java
                                )
                            )
                        } else {
                            startService(
                                ActiveRunService.createStopIntent(applicationContext)
                            )
                        }
                    }
                )
            }
        }
    }
}