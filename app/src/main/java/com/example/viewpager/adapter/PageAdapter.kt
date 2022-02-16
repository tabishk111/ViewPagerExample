package com.example.viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.viewpager.models.Component
import com.example.viewpager.ui.*

class PageAdapter(fm: FragmentManager, private val component: Component?) : FragmentStatePagerAdapter(fm) {
    override fun getCount(): Int {
        return 5
    }

    override fun getItem(position: Int): Fragment {

        when(position) {

            0 -> {
                return Fragment1()
            }
            1 -> {
                return Fragment2()
            }
            2 -> {
                return Fragment3()
            }
            3 -> {
                return Fragment4()
            }
            4 -> {
                return Fragment5()
            }
            else -> {
                return Fragment1()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "Tab 1"
            }
            1 -> {
                return "Tab 2"
            }
            2 -> {
                return "Tab 3"
            }
        }
        return super.getPageTitle(position)
    }

}