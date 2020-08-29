package com.test.myrecyclerviewsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        view.button.setOnClickListener {
            findNavController().navigate(R.id.action_first_to_second)
        }

        val listData = arrayListOf<ListItemData>()

        (0..20).forEach {
            listData.add(ListItemData("hoge $it"))
        }



        val recyclerView = view.findViewById<RecyclerView>(R.id.simpleRecyclerView)

        val layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager

        recyclerView.adapter = MyRecyclerViewAdapter(listData)

        return view
    }
}