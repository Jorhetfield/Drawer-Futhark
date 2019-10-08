package es.vanadis.drawertests.features.ui.runario

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import es.vanadis.drawertests.R
import es.vanadis.drawertests.setup.inflate
import es.vanadis.testingrunes.features.runes.model.Rune
import es.vanadis.testingrunes.features.runes.model.Symbol

class RunesAdapter(
    private val items: MutableList<Rune>,
    private val listener: (Rune) -> Unit
) : RecyclerView.Adapter<RunesHolder>() {
    override fun onBindViewHolder(
        brandsHolder: RunesHolder,
        position: Int
    ) {
        items[position].apply {
            brandsHolder.bind(this) { listener(it) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RunesHolder {
        parent.inflate(R.layout.rune_list_row, false).apply { return RunesHolder(this) }
    }

    override fun getItemCount(): Int = items.size
}