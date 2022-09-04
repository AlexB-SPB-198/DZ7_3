package com.example.dz7_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dz7_3.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Click()
    }

    private fun Click() {

        val name=arguments?.getString(MainFragment.KFN)
        val text=arguments?.getString(MainFragment.KFL)
        val img = arguments?.getString(MainFragment.KFP)
        binding.tvName.text=name
        binding.tvText.text=text
        img.let {
            it?.let { it1 -> binding.ivImage.loadGlide(it1) }
        }
    }

}
