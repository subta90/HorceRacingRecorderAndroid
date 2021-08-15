package com.example.horceracingrecorderandroid.fragment.racerecordlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.horceracingrecorderandroid.databinding.FragmentRaceAddBinding

class RaceAddFragment: Fragment() {

    private lateinit var binding: FragmentRaceAddBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRaceAddBinding.inflate(inflater, container, false)
        return binding.root
    }

}
