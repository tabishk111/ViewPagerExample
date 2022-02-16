package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.viewpager.adapter.PageAdapter
import com.example.viewpager.models.Component
import com.example.viewpager.repository.ComponentRepository

class MainActivity : AppCompatActivity() {


    val componentRepository = ComponentRepository()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        setContentView(R.layout.activity_main)

        Toast.makeText(this,"Message",Toast.LENGTH_LONG).show()
        //Log.e("message",viewModel.newDetails.toString())


                val viewPager = findViewById<ViewPager>(R.id.viewPager)
                viewPager.adapter = PageAdapter(supportFragmentManager)
                viewPager.clipToPadding = false
                viewPager.setPadding(40,0,40,0)
                viewPager.pageMargin = 10


    }

//    fun pushPath(id:String) {
//        runBlocking {
//            val response = componentRepository.getDetails(id)
//            newDetails = response.body()!!
//            Log.e("message", newDetails.toString())
//        }
//    }
}