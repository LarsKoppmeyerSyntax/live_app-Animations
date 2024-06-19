package com.example.animationplayground.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import androidx.navigation.fragment.findNavController
import com.example.animationplayground.R
import com.example.animationplayground.databinding.FragmentSecondBinding
import com.example.animationplayground.databinding.FragmentThirdBinding
import com.example.animationplayground.fragments.adapter.ItemAdapter


class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       binding.thirdRV.adapter = ItemAdapter()

    }

}