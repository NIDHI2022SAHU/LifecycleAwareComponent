@file:Suppress("DEPRECATION")

package com.example.lifecycleawarecomponent
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer(private val context: Context) : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        Log.i("MAIN","OBSERVER - ON CREATE")
        Toast.makeText(context,"LifeCycleObserver",Toast.LENGTH_SHORT).show()
    }
}
