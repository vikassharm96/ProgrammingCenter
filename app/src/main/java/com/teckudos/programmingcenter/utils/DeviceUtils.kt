package com.teckudos.programmingcenter.utils

import android.content.Context
import android.content.pm.PackageManager
import android.net.ConnectivityManager

fun Context.isOnline(): Boolean {
    val cm = this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val activeNetwork = cm.activeNetworkInfo
    return activeNetwork != null && activeNetwork.isConnectedOrConnecting
}

fun Context.isPackageAvailable(targetPackage: String): Boolean {
    return try {
        packageManager.getPackageInfo(targetPackage, PackageManager.GET_META_DATA)
        true
    } catch (e: PackageManager.NameNotFoundException) {
        false
    }
}