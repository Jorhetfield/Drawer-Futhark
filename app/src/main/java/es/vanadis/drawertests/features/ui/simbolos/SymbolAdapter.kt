package es.vanadis.drawertests.features.ui.simbolos

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.vanadis.drawertests.R
import es.vanadis.drawertests.setup.inflate
import es.vanadis.testingrunes.features.runes.model.Symbol

class SymbolAdapter(
    private val items: MutableList<Symbol>,
    private val listener: (Symbol) -> Unit
) : RecyclerView.Adapter<SymbolHolder>() {
    override fun onBindViewHolder(
        symbolHolder: SymbolHolder,
        position: Int
    ) {
        items[position].apply {
            symbolHolder.bind(this) { listener(it) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SymbolHolder {
        parent.inflate(R.layout.symbol_list_row, false).apply { return SymbolHolder(this) }
    }

    override fun getItemCount(): Int = items.size
}