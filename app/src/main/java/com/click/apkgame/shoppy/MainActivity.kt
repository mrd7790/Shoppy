package com.click.apkgame.shoppy

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.view.MenuItem
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.click.apkgame.shoppy.adapter.FragmentAdapter
import com.click.apkgame.shoppy.ui.home.HomeFragment
import com.click.apkgame.shoppy.ui.collections.CollectionsFragment
import com.click.apkgame.shoppy.ui.collections.SearchFragment
import com.click.apkgame.shoppy.ui.dashboard.DashboardFragment
import com.click.apkgame.shoppy.ui.notifications.NotificationsFragment


class MainActivity : AppCompatActivity() {

    lateinit var viewPager : ViewPager
    lateinit var navigation : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        navigation = findViewById(R.id.nav_view)
        viewPager = findViewById(R.id.viewpager)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        setupFragment(supportFragmentManager , viewPager)
        viewPager.setCurrentItem(0)
        viewPager.addOnPageChangeListener(PageChange())
        viewPager.offscreenPageLimit = 5
    }

    val mOnNavigationItemSelectedListener =
        object : BottomNavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(item: MenuItem): Boolean {
                when (item.getItemId()) {
                    R.id.navigation_home -> {
                        viewPager.setCurrentItem(0)
                        return true
                    }
                    R.id.navigation_search ->{
                        viewPager.setCurrentItem(1)
                        return true
                    }
                    R.id.navigation_dashboard -> {
                        viewPager.setCurrentItem(2)
                        return true
                    }
                    R.id.navigation_notifications -> {
                        viewPager.setCurrentItem(3)
                        return true
                    }
                    R.id.navigation_collections ->{
                        viewPager.setCurrentItem(4)
                        return true
                    }
                }
                return false
            }
        }

    fun setupFragment ( fragmentManager: FragmentManager , viewPager: ViewPager ){

        val fragmentAdapter = FragmentAdapter(fragmentManager)

        fragmentAdapter.add(HomeFragment(), R.string.title_home.toString())
        fragmentAdapter.add(SearchFragment(), R.string.title_search.toString())
        fragmentAdapter.add(DashboardFragment(), R.string.title_dashboard.toString())
        fragmentAdapter.add(NotificationsFragment(), R.string.title_notifications.toString())
        fragmentAdapter.add(CollectionsFragment(), R.string.title_collections.toString())

        viewPager.adapter = fragmentAdapter
    }


    inner class PageChange : ViewPager.OnPageChangeListener{
        override fun onPageScrollStateChanged(state: Int) {
        }

        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) {
        }

        override fun onPageSelected(position: Int) {
            when (position) {
                0 -> navigation.selectedItemId = R.id.navigation_home
                1 -> navigation.selectedItemId = R.id.navigation_search
                2 -> navigation.selectedItemId = R.id.navigation_dashboard
                3 -> navigation.selectedItemId = R.id.navigation_notifications
                4 -> navigation.selectedItemId = R.id.navigation_collections
            }

        }

    }
}
