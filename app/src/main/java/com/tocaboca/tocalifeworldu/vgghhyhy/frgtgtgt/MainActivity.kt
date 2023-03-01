package com.tocaboca.tocalifeworldu.vgghhyhy.frgtgtgt

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.tocaboca.tocalifeworldu.R
import com.tocaboca.tocalifeworldu.gtjgtjgtjiogt.NJnfdrfrfrf
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val gt5gt5gt5gt by viewModel <NJnfdrfrfrf>(named("MainModel"))


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("lolo", "from MainActivimy ${gt5gt5gt5gt}")

        gt5gt5gt5gt.gttghyhyhy(this@MainActivity)
    }
}