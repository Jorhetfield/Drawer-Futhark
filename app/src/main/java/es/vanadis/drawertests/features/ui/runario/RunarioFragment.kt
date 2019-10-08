package es.vanadis.drawertests.features.ui.runario

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.google.gson.Gson
import es.vanadis.drawertests.BaseFragment
import es.vanadis.drawertests.R
import es.vanadis.testingrunes.features.runes.model.Rune
import es.vanadis.testingrunes.features.runes.model.Symbol
import kotlinx.android.synthetic.main.fragment_rune_list.*

class RunarioFragment : BaseFragment() {


    private lateinit var runesAdapter: RunesAdapter
    private var runes: MutableList<Rune> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_rune_list, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val gridLayoutManager = GridLayoutManager(context, 3)
        recyclerRunes.layoutManager = gridLayoutManager
        runesAdapter = RunesAdapter(
            runes
        ) {
        }
        recyclerRunes.adapter = runesAdapter
        getRunes()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun getRunes() {
        val runesRaw = resources.openRawResource(R.raw.runes)
            .bufferedReader().use { it.readText() }
        val runesJson = Gson().fromJson(runesRaw, Array<Rune>::class.java).toList()
        runes.clear()
        runes.addAll(runesJson)
        runesAdapter.notifyDataSetChanged()

    }
}