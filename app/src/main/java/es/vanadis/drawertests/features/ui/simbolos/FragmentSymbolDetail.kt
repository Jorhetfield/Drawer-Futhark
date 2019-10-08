package es.vanadis.drawertests.features.ui.simbolos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.squareup.picasso.Picasso
import es.vanadis.drawertests.BaseFragment
import es.vanadis.drawertests.R
import es.vanadis.testingrunes.setup.Prefs
import es.vanadis.testingrunes.setup.lazyUnsychronized
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.fragment_rune_detail.*
import kotlinx.android.synthetic.main.fragment_rune_detail.view.*
import kotlinx.android.synthetic.main.fragment_rune_list.*
import kotlinx.android.synthetic.main.rune_list_row.view.*
import org.koin.android.ext.android.inject

class FragmentSymbolDetail : BaseFragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.title = ""
        return inflater.inflate(R.layout.fragment_symbol_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        imageView.setOnClickListener {
            toast(arguments?.getString("name").toString())
        }
        textView.text = arguments?.getString("description")
        Picasso.get()
            .load(arguments?.getString("logo"))
            .into(view.imageView)

        super.onViewCreated(view, savedInstanceState)
    }
}