package codes.saurabh.wear.app.presentation

import android.app.Application
import codes.saurabh.core.connectivity.data.di.coreConnectivityDataModule
import codes.saurabh.wear.app.presentation.di.appModule
import codes.saurabh.wear.run.data.di.wearRunDataModule
import codes.saurabh.wear.run.presentation.di.wearRunPresentationModule
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class RuniqueApp: Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@RuniqueApp)
            modules(
                appModule,
                wearRunPresentationModule,
                wearRunDataModule,
                coreConnectivityDataModule
            )
        }
    }
}