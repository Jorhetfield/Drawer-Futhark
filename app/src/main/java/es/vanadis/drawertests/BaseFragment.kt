package es.vanadis.drawertests

import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

@Suppress("DEPRECATION")
abstract class BaseFragment : Fragment() {

    fun toast(message: String){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }
    fun snackbar(message: String, view: View){
        val snackbar = Snackbar.make(view, message, Snackbar.LENGTH_SHORT)
        val snackbarView: View = snackbar.view
        snackbarView.setBackgroundColor(resources.getColor(R.color.colorAccent))
        val tv = snackbarView.findViewById(R.id.snackbar_text) as TextView
        tv.setTextColor(resources.getColor(R.color.colorPrimary))
        snackbar.show()
    }
    fun logd(text: String){
        Log.d("CustomLogD", text)

    }



}