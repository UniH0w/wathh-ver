package com.example.watch_eresdfd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.widget.ViewPager2
import com.example.watch_eresdfd.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabLayout =findViewById<TabLayout>(R.id.main_tab_layout)
        val viewPager2=findViewById<ViewPager2>(R.id.main_pager)
        val adapter=ViewPagerAdapter(supportFragmentManager, lifecycle)
viewPager2.adapter= adapter
        TabLayoutMediator(tabLayout,viewPager2){tab,position->
            when(position){
                0->{
                    tab.text="Time"
                }
                1->{
                    tab.text="StopWatch"
                }
                2->{
                    tab.text="Timer"
                }

            }
        }.attach()

    }

}