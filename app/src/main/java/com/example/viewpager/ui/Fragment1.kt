package com.example.viewpager.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.viewpager.MainViewModel

import com.example.viewpager.R
import com.example.viewpager.models.Component
import com.example.viewpager.repository.ComponentRepository
import kotlinx.android.synthetic.main.fragment_1.*
import kotlinx.coroutines.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment1() : Fragment() {


    // TODO: Rename and change types of parameters
    private var param1: String? = null
    var param2: String? = null

    val componentRepository = ComponentRepository()

    lateinit var newDetails: Component

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false)



        val id = "ID805182680000000090"
        pushPath(id)


    }

    fun pushPath(id:String) {
        runBlocking {
                val response = componentRepository.getDetails(id)
                newDetails = response.body()!!
                Log.e("message", newDetails.toString())
                title1.text = newDetails.message?.trendingTechnology?.get(0)?.title

        }
    }


}