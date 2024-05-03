package codes.saurabh.runique

import android.app.Application
import codes.saurabh.auth.data.di.authDataModule
import codes.saurabh.auth.presentation.di.authViewModelModule
import codes.saurabh.runique.di.appModule
import codes.saurabh.core.data.di.coreDataModule
import codes.saurabh.run.location.di.locationModule
import codes.saurabh.run.presentation.di.runPresentationModule
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class RuniqueApp: Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RuniqueApp)
            modules(
                authDataModule,
                authViewModelModule,
                appModule,
                coreDataModule,
                runPresentationModule,
                locationModule
            )
        }
    }
}