package com.tocaboca.tocalifeworldu.afrgtgttgtg


import com.tocaboca.tocalifeworldu.gthyhyjhy.hy2h62hyhyju
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.tocaboca.tocalifeworldu.ghyujju.NJfrfjfrjrfif.hjki
import com.tocaboca.tocalifeworldu.ghyujju.NJfrfjfrjrfif.b2hy2ujikik
import com.tocaboca.tocalifeworldu.ghyujju.NJfrfjfrjrfif.hyhy5hy5hy
import com.tocaboca.tocalifeworldu.ghyujju.NJfrfjfrjrfif.vfbrfgfrgrfgrfgyrfgy
import com.tocaboca.tocalifeworldu.gthyhyjhy.hyhy59yh
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class APapapapapapClassaa:Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        gtjogtjogtjgtjiogt()

        val gtnjngtjjkgt = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val hyyh5hy9 = getSharedPreferences("PREFS_NAME", 0)

        val hy59hh5yhy = MyTracker.getTrackerParams()
        val hyj6ujki5ik5ik = MyTracker.getTrackerConfig()
        val hyj59uj5 = MyTracker.getInstanceId(this)
        hyj6ujki5ik5ik.isTrackingLaunchEnabled = true
        val juki59ik59ik = UUID.randomUUID().toString()

        if (hyyh5hy9.getBoolean("my_first_time", true)) {
            hy59hh5yhy.setCustomUserId(juki59ik59ik)
            gtnjngtjjkgt.edit().putString(hyhy5hy5hy, juki59ik59ik).apply()
            gtnjngtjjkgt.edit().putString(b2hy2ujikik, hyj59uj5).apply()
            hyyh5hy9.edit().putBoolean("my_first_time", false).apply()
        } else {
            val hy2ju9ki5ki5ik = gtnjngtjjkgt.getString(hyhy5hy5hy, juki59ik59ik)
            hy59hh5yhy.setCustomUserId(hy2ju9ki5ki5ik)
        }
        MyTracker.initTracker(hjki, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@APapapapapapClassaa)
            modules(
                listOf(
                    hyhy59yh, hy2h62hyhyju
                )
            )
        }
    }

    private fun gtjogtjogtjgtjiogt() {
        OneSignal.setAppId(vfbrfgfrgrfgrfgyrfgy)
    }
}