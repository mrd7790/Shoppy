package com.click.apkgame.shoppy.ui.collections

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.click.apkgame.shoppy.R

class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_collections, container, false)
        val textView: TextView = root.findViewById(R.id.text_collections)
        textView.setText(R.string.title_search)

        return root
    }

}