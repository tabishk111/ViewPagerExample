package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.viewpager.adapter.PageAdapter
import com.example.viewpager.repository.ComponentRepository

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val componentRepository = ComponentRepository()
        val viewModelProviderFactory = MainViewModelProviderFactory(application, componentRepository)
        viewModel = ViewModelProvider(this,viewModelProviderFactory).get(MainViewModel::class.java)

        val id = "ID805182680000000090"
        viewModel.pushPath(id)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        viewPager.adapter = PageAdapter(supportFragmentManager,viewModel.newDetails.value?.body())
        viewPager.clipToPadding = false
        viewPager.setPadding(40,0,40,0)
        viewPager.pageMargin = 10
    }
}