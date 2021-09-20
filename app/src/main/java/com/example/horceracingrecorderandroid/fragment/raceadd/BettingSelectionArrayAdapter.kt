package com.example.horceracingrecorderandroid.fragment.raceadd

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.example.horceracingrecorderandroid.R
import com.example.horceracingrecorderandroid.databinding.ViewBettingTypeSelectionBinding
import com.example.horceracingrecorderandroid.enum.BettingSelectionType

class BettingSelectionArrayAdapter(
    context: Context,
    resource: Int,
    objects: Array<out BettingSelectionType>
) : ArrayAdapter<BettingSelectionType>(context, resource, objects) {

    private var selectedIndex: Int = 0

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val item = getItem(position)

        val inflater = LayoutInflater.from(context)
        val binding: ViewBettingTypeSelectionBinding =
            DataBindingUtil.inflate(inflater, R.layout.view_betting_type_selection, parent, false)

        item?.let {
            binding.setBettingTypeName(item.bettingSelectionName())
            binding.bettingTypeSelectButton.isChecked = (position == selectedIndex)
            binding.bettingTypeSelectButton.setOnClickListener {
                setSelectedIndex(position)
            }
            binding.executePendingBindings()
        }

        return binding.root
    }

    private fun setSelectedIndex(index: Int) {
        selectedIndex = index
        notifyDataSetChanged()
    }
}
