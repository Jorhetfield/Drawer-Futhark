package es.vanadis.testingrunes.features.runes.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Rune(
    val id: String?,
    val name: String?,
    val subtitle: String?,
    val description: String?,
    val logo: String?
//    val images: ArrayList<Logo>?
) : Parcelable
