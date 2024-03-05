package com.example.lifecycleawarecomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val observer = Observer(this)
        lifecycle.addObserver(observer)
        Log.i("MAIN","ACTIVITY - ON CREATE")
        Toast.makeText(this,"Acitvity - oncreate",Toast.LENGTH_SHORT).show()
    }
}