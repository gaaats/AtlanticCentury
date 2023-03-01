package com.tocaboca.tocalifeworldu.gthyhyjhy


import com.tocaboca.tocalifeworldu.bhyhyujjuju.HUufhhrfhhfr
import com.tocaboca.tocalifeworldu.ghyhy.JIfrjijjrfjif
import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.tocaboca.tocalifeworldu.bbhyhyhyju.YGfyrgfrgrfrf
import com.tocaboca.tocalifeworldu.bggftghyhyhy.NJfrhfruirfhufr
import com.tocaboca.tocalifeworldu.bgnk.FOIJjij
import com.tocaboca.tocalifeworldu.gtjgtjgtjiogt.NJnfdrfrfrf
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun hyhy5hy59hy5(): Gson {
    return GsonBuilder().create()
}

val hyhy59yh = module {
    viewModel (named("MainModel")){
        NJnfdrfrfrf((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        JIfrjijjrfjif(get())
    }
}

val hy2h62hyhyju = module {

    single  <NJfrhfruirfhufr> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(NJfrhfruirfhufr::class.java)
    }

    single <YGfyrgfrgrfrf> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(YGfyrgfrgrfrf::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://atlanticcentury.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        HUufhhrfhhfr(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        FOIJjij(get(named("HostInter")))
    }
    single{
        hyhy5hy59hy5()
    }
    single (named("SharedPreferences")) {
        h26hyhyhy6(androidApplication())
    }
}

fun h26hyhyhy6(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}


