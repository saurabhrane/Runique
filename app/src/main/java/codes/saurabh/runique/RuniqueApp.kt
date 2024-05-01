package codes.saurabh.runique

import android.app.Application
import android.os.Build
import codes.saurabh.auth.data.di.authDataModule
import codes.saurabh.auth.presentation.di.authViewModelModule
import codes.saurabh.runique.di.appModule
import codes.saurabh.core.data.di.coreDataModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class RuniqueApp: Application() {

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
                appModule
            )
        }
    }
}