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


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imageView.setOnClickListener {

            binding.imageView.animate()
                .setDuration(500)
                .translationY(-binding.secondCL.height.toFloat() - 200 )
                .setInterpolator(AccelerateInterpolator())
                .withEndAction {
                    //Code wird ausgeführt wenn Animation abgeschlossen ist
                    findNavController().navigate(R.id.thirdFragment)


//                    binding.imageView.translationY = 200f
//
//                    binding.imageView.animate()
//                        .setDuration(500)
//                        .translationY(0f)
//                        .start()
                }
                .start()


        }

    }

}