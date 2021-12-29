package com.example.viewpagerform.PageAdapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagerform.Fragments.Fragment1
import com.example.viewpagerform.Fragments.Fragment2
import com.example.viewpagerform.Fragments.Fragment3

class Adapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = 3


    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> Fragment1()
            1 -> Fragment2()
            2 -> Fragment3()
            else -> Fragment1()
        }
    }


}