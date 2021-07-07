package com.example.motionlayoutrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rv=findViewById<RecyclerView>(R.id.rv)
        val arrayList=ArrayList<String>()
        arrayList.add("a")
        arrayList.add("a")
        arrayList.add("a")
        arrayList.add("a")
        arrayList.add("a")
        arrayList.add("a")
        arrayList.add("a")
        arrayList.add("a")
        arrayList.add("a")
        arrayList.add("a")
        arrayList.add("a")
        rv.adapter=Adapter(arrayList)
        rv.layoutManager=LinearLayoutManager(this)

    }
}