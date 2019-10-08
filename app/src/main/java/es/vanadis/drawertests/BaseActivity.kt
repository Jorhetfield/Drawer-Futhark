package es.vanadis.drawertests

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

@Suppress("DEPRECATION")
abstract class BaseActivity : AppCompatActivity() {

    fun toast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    fun snackbar(message: String, view: View) {
        val snackbar = Snackbar.make(view, message, Snackbar.LENGTH_SHORT)
        val snackbarView: View = snackbar.view
        snackbarView.setBackgroundColor(resources.getColor(R.color.colorAccent))
        val tv = snackbarView.findViewById(R.id.snackbar_text) as TextView
        tv.setTextColor(resources.getColor(R.color.colorPrimary))
        snackbar.show()
    }

    fun hideKeyboard() {
        with(getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager) {
            this.hideSoftInputFromWindow(
                currentFocus?.windowToken,
                InputMethodManager.SHOW_FORCED
            )
        }
    }


}