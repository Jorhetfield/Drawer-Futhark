package es.vanadis.testingrunes.setup

import android.content.Context
import android.content.SharedPreferences
import org.koin.android.BuildConfig


class Prefs(context: Context) {
    private val FILENAME = "${BuildConfig.APPLICATION_ID}.prefs"
    private val TOKEN = "TOKEN"
    private val USER = "USER"
    private val NOTIFICATIONS_GENERAL_ENABLED = "NOTIFICATIONS_GENERAL_ENABLED"
    private val NOTIF_BOOLEAN = "NOTIF_BOOLEAN"
    private val NEWSLETTER_ENABLED = "NEWSLETTER_ENABLED"
    private val NEWSLETTER_BOOLEAN = "NEWSLETTER_BOOLEAN"
    private val PRODUCTS = "PRODUCTS"
    private var GENDER = "GENDER"
    private var INCONTINECE = "INCONTINECE"
    private var TYPE = "TYPE"
    private var BRANDS = "BRANDS"
    private var COMPETITIVEBRANDS = "COMPETITIVEBRANDS"
    private var COMPETITIVEPRODUCTS = "COMPETITIVEPRODUCTS"
    private var CURRENTLANGUAGE = "CURRENT_LANGUAGE"
    private var CURRENTCOUNTRY = "CURRENT_COUNTRY"
    private var CURRENTUSER = "CURRENT_USER"


    private val prefs: SharedPreferences =
        context.getSharedPreferences(FILENAME, Context.MODE_PRIVATE)

    var country: String?
        get() = prefs.getString(CURRENTCOUNTRY, "")
        set(value) = prefs.edit().putString(CURRENTCOUNTRY, value).apply()

    var userType: String?
        get() = prefs.getString(CURRENTUSER, "")
        set(value) = prefs.edit().putString(CURRENTUSER, value).apply()

    var token: String?
        get() = prefs.getString(TOKEN, "")
        set(value) = prefs.edit().putString(TOKEN, value).apply()

    var language: String?
        get() = prefs.getString(CURRENTLANGUAGE, "")
        set(value) = prefs.edit().putString(CURRENTLANGUAGE, value).apply()

    var brands: String?
        get() = prefs.getString(BRANDS, "")
        set(value) = prefs.edit().putString(BRANDS, value).apply()

    var competitiveBrands: String?
        get() = prefs.getString(COMPETITIVEBRANDS, "")
        set(value) = prefs.edit().putString(COMPETITIVEBRANDS, value).apply()

    var competitiveProducts: String?
        get() = prefs.getString(COMPETITIVEPRODUCTS, "")
        set(value) = prefs.edit().putString(COMPETITIVEPRODUCTS, value).apply()

    var products: String?
        get() = prefs.getString(PRODUCTS, "")
        set(value1) = prefs.edit().putString(PRODUCTS, value1).apply()

    var filterGender: String?
        get() = prefs.getString(GENDER, "")
        set(value) = prefs.edit().putString(GENDER, value).apply()

    var filterIncontinence: String?
        get() = prefs.getString(INCONTINECE, "")
        set(value) = prefs.edit().putString(INCONTINECE, value).apply()

    var filterType: String?
        get() = prefs.getString(TYPE, "")
        set(value) = prefs.edit().putString(TYPE, value).apply()

    var user: String?
        get() = prefs.getString(USER, "")
        set(value) = prefs.edit().putString(USER, value).apply()

    var notificationsEnabled: Int
        get() = prefs.getInt(NOTIFICATIONS_GENERAL_ENABLED, 1)
        set(value) = prefs.edit().putInt(NOTIFICATIONS_GENERAL_ENABLED, value).apply()

    var notificationsBool: Boolean
        get() = prefs.getBoolean(NOTIF_BOOLEAN, true)
        set(value) = prefs.edit().putBoolean(NOTIF_BOOLEAN, value).apply()

    var newsletterBool: Boolean
        get() = prefs.getBoolean(NEWSLETTER_BOOLEAN, true)
        set(value) = prefs.edit().putBoolean(NEWSLETTER_BOOLEAN, value).apply()

    var newsletterEnabled: Int
        get() = prefs.getInt(NEWSLETTER_ENABLED, 1)
        set(value) = prefs.edit().putInt(NEWSLETTER_ENABLED, value).apply()

    fun clear(): Boolean {
        return prefs.edit().clear().commit()
    }

    private fun remove(key: String) {
        prefs.edit().remove(key).apply()
    }

    fun clearLogin() {
        remove(TOKEN)
        remove(USER)
    }
}