package com.click.apkgame.shoppy.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.click.apkgame.shoppy.R
import com.click.apkgame.shoppy.adapter.DCRececlerAdapter
import com.click.apkgame.shoppy.model.Collection
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    val default = arrayListOf<Collection>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerView: RecyclerView = root.findViewById(R.id.defult_collection)

        fakedata()


        recyclerView.layoutManager = GridLayoutManager(root.context , 4)
        recyclerView.adapter = DCRececlerAdapter(default)



        return root
    }
    fun fakedata (){
        default.add(Collection("رستوران", R.drawable.ic_restaurant_black_24dp))
        default.add(Collection("رستوران", R.drawable.ic_restaurant_black_24dp))
        default.add(Collection("رستوران", R.drawable.ic_restaurant_black_24dp))
        default.add(Collection("رستوران", R.drawable.ic_restaurant_black_24dp))
        default.add(Collection("رستوران", R.drawable.ic_restaurant_black_24dp))
        default.add(Collection("رستوران", R.drawable.ic_restaurant_black_24dp))
        default.add(Collection("رستوران", R.drawable.ic_restaurant_black_24dp))
        default.add(Collection("رستوران", R.drawable.ic_restaurant_black_24dp))
    }
}