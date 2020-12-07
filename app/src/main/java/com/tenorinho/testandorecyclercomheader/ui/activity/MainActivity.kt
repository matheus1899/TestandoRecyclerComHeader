package com.tenorinho.testandorecyclercomheader.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tenorinho.testandorecyclercomheader.R
import com.tenorinho.testandorecyclercomheader.ui.adapter.TimeAdapter
import com.tenorinho.testandorecyclercomheader.model.getTime

class MainActivity : AppCompatActivity() {
    var lista: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lista = findViewById(R.id.lista)
        lista?.layoutManager = LinearLayoutManager(this)
        lista?.setHasFixedSize(true)
        lista?.adapter = TimeAdapter(getTime())
    }
}