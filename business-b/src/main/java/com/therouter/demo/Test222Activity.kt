package com.therouter.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.therouter.router.Route


@Route(path = "http://kymjs.mjl/therouter/mjlActivity")
class Test222Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}