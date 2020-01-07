package com.click.apkgame.shoppy.adapter

import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragmentAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

    val Fragments = arrayListOf<Fragment>()
    val NamePage = arrayListOf<String>()

    fun add (fragment: Fragment , title: String) {
        Fragments.add(fragment)
        NamePage.add(title)
    }

    override fun getItem(position: Int): Fragment {
        return Fragments.get(position)
    }

    override fun getCount(): Int {
        return Fragments.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return NamePage.get(position )
    }

}