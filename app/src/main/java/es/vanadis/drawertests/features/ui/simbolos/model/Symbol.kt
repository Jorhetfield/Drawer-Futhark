package es.vanadis.testingrunes.features.runes.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Symbol(
    val id: String?,
    val name: String?,
    val description: String?,
    val logo: String?
) : Parcelable
