package codes.saurabh.runique

import android.app.Application
import android.content.Context
import codes.saurabh.auth.data.di.authDataModule
import codes.saurabh.auth.presentation.di.authViewModelModule
import codes.saurabh.core.data.di.coreDataModule
import codes.saurabh.core.database.di.databaseModule
import codes.saurabh.run.data.di.runDataModule
import codes.saurabh.run.location.di.locationModule
import codes.saurabh.run.network.di.networkModule
import codes.saurabh.run.presentation.di.runPresentationModule
import codes.saurabh.runique.di.appModule
import com.google.android.play.core.splitcompat.SplitCompat
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.workmanager.koin.workManagerFactory
import org.koin.core.context.startKoin
import timber.log.Timber

class RuniqueApp : Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            androidLogger()
            androidContext(this@RuniqueApp)
            workManagerFactory()
            modules(
                authDataModule,
                authViewModelModule,
                appModule,
                coreDataModule,
                runPresentationModule,
                locationModule,
                databaseModule,
                networkModule,
                runDataModule,
            )
        }
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        SplitCompat.install(this)
    }
}