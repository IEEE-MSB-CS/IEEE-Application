package com.ieee.events.utils

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.annotation.RequiresApi


object BindingAdapter {


    @JvmStatic
    @androidx.databinding.BindingAdapter("changeTextColor")
    fun changeTextColor(textView: TextView, text : String){
        var selectedText = "Terms of Use"
        val spannable = SpannableString(text)
        spannable.setSpan(  ForegroundColorSpan(Color.BLUE), text.indexOf(selectedText) , text.indexOf(selectedText) + selectedText.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        selectedText = "Privacy Policy"
        spannable.setSpan(
            ForegroundColorSpan(Color.BLUE),
        text.indexOf(selectedText) , text.indexOf(selectedText) + selectedText.length, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.setText(spannable, TextView.BufferType.SPANNABLE);
    }
}