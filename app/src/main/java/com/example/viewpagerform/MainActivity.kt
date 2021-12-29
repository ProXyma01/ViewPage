package com.example.viewpagerform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerform.PageAdapters.Adapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var viewpager : ViewPager2
    private lateinit var tab : TabLayout
    private lateinit var page_adapter : Adapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager =findViewById(R.id.ViewPager)
        tab = findViewById(R.id.Tab)
        page_adapter = Adapter(this)


        TabLayoutMediator(tab, viewpager) {tab, position ->
            tab.text= "Tab ${position+1}"
        }.attach()


    }
}