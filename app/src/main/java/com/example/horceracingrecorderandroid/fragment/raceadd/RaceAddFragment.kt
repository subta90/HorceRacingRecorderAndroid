package com.example.horceracingrecorderandroid.fragment.raceadd

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.horceracingrecorderandroid.R
import com.example.horceracingrecorderandroid.databinding.FragmentRaceAddBinding
import com.example.horceracingrecorderandroid.enum.BettingSelectionType

class RaceAddFragment : Fragment() {

    private lateinit var binding: FragmentRaceAddBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRaceAddBinding.inflate(inflater, container, false)
        setupButtons()
        return binding.root
    }

    private fun setupButtons() {
        binding.addRaceButton.setOnClickListener {
            showBettingSelectionAlert()
        }
    }

    private fun showBettingSelectionAlert() {
        val builder = AlertDialog.Builder(activity)
        builder.apply {
            setTitle(getString(R.string.betting_selection_title))

            val adapter = BettingSelectionArrayAdapter(
                requireContext(),
                android.R.layout.simple_list_item_single_choice,
                BettingSelectionType.list
            )

            setSingleChoiceItems(adapter, 0, DialogInterface.OnClickListener { dialog, position ->
                dialog as AlertDialog
                // TODO: 次の画面に渡せるように式別を保持
            })

            setPositiveButton(getString(R.string.betting_selection_next),
                DialogInterface.OnClickListener { _, _ ->
                    // TODO: 式別に応じた画面に遷移
                    val action = RaceAddFragmentDirections.actionRaceAddFragmentToAddBettingTicketWinFragment()
                    view?.findNavController()?.navigate(action)
                })

            setNegativeButton("キャンセル",
                DialogInterface.OnClickListener { dialog, id ->

                })
        }
        builder.create().show()
    }

}
