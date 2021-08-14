package com.example.horceracingrecorderandroid.fragment.raceanalysis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.horceracingrecorderandroid.databinding.FragmentRaceAnalysisBinding

class RaceAnalysisFragment: Fragment() {

    private lateinit var binding: FragmentRaceAnalysisBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRaceAnalysisBinding.inflate(inflater, container, false)
        return binding.root
    }

}
