package com.example.horceracingrecorderandroid.fragment.raceadd

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.horceracingrecorderandroid.databinding.ViewRaceAddRaceInfoBinding
import com.example.horceracingrecorderandroid.enum.GradeType

class RaceAddRaceInfoView(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {

    private var binding: ViewRaceAddRaceInfoBinding =
        ViewRaceAddRaceInfoBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        val gradeNames = GradeType.values().map {
            it.gradeName()
        }
        val gradeAdapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, gradeNames)
        binding.raceNameGradeSpinner.adapter = gradeAdapter
    }


}
