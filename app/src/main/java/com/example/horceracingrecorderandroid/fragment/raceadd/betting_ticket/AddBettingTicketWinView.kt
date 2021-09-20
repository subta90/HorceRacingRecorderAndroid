package com.example.horceracingrecorderandroid.fragment.raceadd.betting_ticket

import android.R
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.horceracingrecorderandroid.databinding.ViewAddBettingTicketWinBinding

class AddBettingTicketWinView(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {

    companion object {
        private const val frameMaxCount = 8
        private const val horseNumberMaxCount = 18
    }

    private val binding: ViewAddBettingTicketWinBinding = ViewAddBettingTicketWinBinding.inflate(
        LayoutInflater.from(context), this, true)

    init {
        setupSpinner()
    }

    private fun setupSpinner() {
        val frameTypes = Array(frameMaxCount) { it + 1 }
        val horseNumberTypes = Array(horseNumberMaxCount) { it + 1}

        val frameAdapter = ArrayAdapter(context, R.layout.simple_spinner_item, frameTypes)
        val horseNumberAdapter = ArrayAdapter(context, R.layout.simple_spinner_item, horseNumberTypes)
        binding.addBettingFrameNumberSpinner.adapter = frameAdapter
        binding.addBettingHorseNumberSpinner.adapter = horseNumberAdapter
    }


}
