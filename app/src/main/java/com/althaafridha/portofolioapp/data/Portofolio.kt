package com.althaafridha.portofolioapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Portofolio(
    var id : Int = 0,
    var title : String = "",
    var detail : String = "",
    var link : String = "",
    var image : Int = 0
):Parcelable
