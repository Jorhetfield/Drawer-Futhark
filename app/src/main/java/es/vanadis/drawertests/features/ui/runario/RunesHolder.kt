package es.vanadis.drawertests.features.ui.runario

import android.view.View
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import es.vanadis.drawertests.R
import es.vanadis.testingrunes.features.runes.model.Rune
import es.vanadis.testingrunes.features.runes.model.Symbol
import es.vanadis.testingrunes.setup.logd
import kotlinx.android.synthetic.main.rune_list_row.view.*

class RunesHolder(v: View) : RecyclerView.ViewHolder(v) {
    private var view: View = v
    private var item: Rune? = null
    private lateinit var listener: (Rune) -> Unit


    init {
        v.setOnClickListener {
            item?.let {
                val bundle = bundleOf(
                    "id" to it.id,
                    "name" to it.name,
                    "logo" to it.logo,
                    "description" to it.description
                )
                logd("Product Clicked: ${it.name}")
                view.findNavController()
                    .navigate(R.id.action_nav_runes_to_fragmentRuneDetail, bundle)
                Toast.makeText(view.context, "${it.name}",Toast.LENGTH_SHORT).show()
                listener(it)
            }
        }
    }

    fun bind(item: Rune, listener: (Rune) -> Unit) {
        this.item = item
        this.listener = listener

        Picasso.get()
            .load(item.logo)
            .into(view.imageView3)

        view.textView2.text = item.name


    }
}