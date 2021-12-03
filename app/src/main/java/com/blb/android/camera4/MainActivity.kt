package com.blb.android.camera4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickContentView(view: View) {
        when(view.id){
            R.id.snapshot_settings -> {

            }

            R.id.record_settings -> {

            }

            R.id.snap -> {

            }
            R.id.record -> {

            }
            R.id.api2_1 -> {

            }

            R.id.input_format -> {

            }

            else -> {

            }
        }
    }
}