package com.example.ecommerceapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerceapp.adapter.ProductsAdapter
import com.example.ecommerceapp.model.Products
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {
    lateinit var recyclerView: RecyclerView

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        val view=inflater.inflate(R.layout.fragment_first, container, false)
        recyclerView=view.findViewById(R.id.recycler_view)

        val products= arrayListOf<Products>()
        for(i in 0..100){
            products.add(Products("Apple","https://tarehyar.ir/wp-content/uploads/2019/08/%D8%B3%DB%8C%D8%A8-%D8%A7%DB%8C%D8%B1%D8%A7%D9%86%DB%8C.jpg",84.2))
        }
        recyclerView.apply {
            layoutManager=GridLayoutManager(context,2)
            adapter=ProductsAdapter(products)

        }

//        initRecyclerView()


        return view.rootView
    }

    private fun initRecyclerView() {

    }

}