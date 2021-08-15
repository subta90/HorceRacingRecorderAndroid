package com.example.horceracingrecorderandroid.fragment.racerecordlist.raceadd

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ArrayAdapter
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.horceracingrecorderandroid.databinding.ViewRaceAddRaceInfoBinding
import com.example.horceracingrecorderandroid.enum.GradeType

class RaceAddRaceInfoView(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {

    private var binding: ViewRaceAddRaceInfoBinding =
        ViewRaceAddRaceInfoBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        val gradeAdapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, GradeType.values())
        binding.raceNameGradeSpinner.adapter = gradeAdapter
    }


}
