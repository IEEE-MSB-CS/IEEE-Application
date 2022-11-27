package com.ieee.events.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.Insets.add
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.ieee.events.R
import com.ieee.events.ui.BookEvent.BookEventFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


}