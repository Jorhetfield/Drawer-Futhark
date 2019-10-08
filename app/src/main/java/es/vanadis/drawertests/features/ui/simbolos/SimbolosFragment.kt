package es.vanadis.drawertests.features.ui.simbolos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.google.gson.Gson
import es.vanadis.drawertests.BaseFragment
import es.vanadis.drawertests.R
import es.vanadis.testingrunes.features.runes.model.Symbol
import kotlinx.android.synthetic.main.fragment_rune_list.*

class SimbolosFragment : BaseFragment() {
    private lateinit var symbolAdapter: SymbolAdapter
    private var runes: MutableList<Symbol> = mutableListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_rune_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val gridLayoutManager = GridLayoutManager(context, 2)
        recyclerRunes.layoutManager = gridLayoutManager
        symbolAdapter = SymbolAdapter(
            runes
        ) {
        }
        recyclerRunes.adapter = symbolAdapter
        getSymbols()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun getSymbols() {
        val runesRaw = resources.openRawResource(R.raw.symbols)
            .bufferedReader().use { it.readText() }
        val runesJson = Gson().fromJson(runesRaw, Array<Symbol>::class.java).toList()
        runes.clear()
        runes.addAll(runesJson)
        symbolAdapter.notifyDataSetChanged()

    }
}