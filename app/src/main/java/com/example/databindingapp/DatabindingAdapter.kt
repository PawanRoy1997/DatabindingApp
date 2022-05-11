package com.example.databindingapp

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("app:updateTextOnChange")
fun onTextChange(view: TextView, data: String) {
    view.text = data
}
