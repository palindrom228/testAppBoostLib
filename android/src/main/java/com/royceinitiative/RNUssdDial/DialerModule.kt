package com.royceinitiative.RNUssdDial

import android.content.Intent
import android.net.Uri
import android.os.Build
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod


class DialerModule(private val reactContext: ReactApplicationContext) :
    ReactContextBaseJavaModule(reactContext) {
    override fun getName(): String = "Device"

    @ReactMethod
    fun getDeviceName(cb: Promise) {
        try {
            cb.resolve(Build.MODEL)
        } catch (e: Exception) {
            cb.reject("Error", e.toString())
        }
    }

    @ReactMethod
    fun dialNumber(number: String) {
        var number = number
        number = Uri.encode(number)
        val url = "tel:$number"
        val intent = Intent(Intent.ACTION_CALL, Uri.parse(url))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        reactContext.startActivity(intent)
    }
}