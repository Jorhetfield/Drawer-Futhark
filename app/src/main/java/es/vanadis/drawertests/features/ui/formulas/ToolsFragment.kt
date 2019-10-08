package es.vanadis.drawertests.features.ui.formulas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import es.vanadis.drawertests.BaseFragment
import es.vanadis.drawertests.R

class ToolsFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_rune_list, container, false)
    }
}