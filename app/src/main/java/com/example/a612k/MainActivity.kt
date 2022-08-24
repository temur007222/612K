package com.example.a612k

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber
import java.lang.String.format

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    @SuppressLint("TimberArgCount")
    private fun initViews(){

        Timber.w(String.format("%s", getString()))
        Timber.w(format("%s", getString()))

        val foo = "foo"
        val bar = "bar"
        Timber.d("foo" + "bar")
        Timber.d("foo$bar")
        Timber.d("${foo}bar")
        Timber.d("$foo$bar")

        Timber.d("%s %s", "arg0")
        Timber.d("%s", "arg0", "arg1")
        Timber.tag("tag").d("%s %s", "arg0")
        Timber.tag("tag").d("%s", "arg0", "arg1")
    }

    private fun getString() = "foo"
}