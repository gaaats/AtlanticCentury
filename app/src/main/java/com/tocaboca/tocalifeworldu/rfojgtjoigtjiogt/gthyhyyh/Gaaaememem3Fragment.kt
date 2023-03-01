package com.tocaboca.tocalifeworldu.rfojgtjoigtjiogt.gthyhyyh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tocaboca.tocalifeworldu.R
import com.tocaboca.tocalifeworldu.databinding.FragmentGaaaememem3Binding
import kotlinx.coroutines.delay


class Gaaaememem3Fragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            lifecycleScope.launchWhenCreated {
                delay(2500)
                findNavController().navigate(R.id.action_gaaaememem3Fragment_to_oneeeeeeeeeeFragment)
            }



        } catch (e: Exception) {
            vfvvf()
        }

        super.onViewCreated(view, savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaaememem3Binding =
            FragmentGaaaememem3Binding.inflate(inflater, container, false)
        return binding.root
    }


    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fragmentGaaaememem3Binding: FragmentGaaaememem3Binding? = null
    private val binding
        get() = fragmentGaaaememem3Binding
            ?: throw RuntimeException("FragmentGaaaememem3Binding = null")


    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentGaaaememem3Binding = null
        super.onDestroy()
    }
}