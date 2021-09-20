package com.example.horceracingrecorderandroid.fragment.raceadd.betting_ticket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.horceracingrecorderandroid.databinding.FragmentAddBettingTicketWinBinding

class AddBettingTicketWinFragment : Fragment() {

    private lateinit var binding: FragmentAddBettingTicketWinBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddBettingTicketWinBinding.inflate(inflater, container, false)
        return binding.root
    }
}
