package com.elkhamitech.rickandmortycharacters.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import com.elkhamitech.rickandmortycharacters.R
import kotlinx.coroutines.Dispatchers

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var livedata =  liveData(Dispatchers.IO) {
        }

    }
}