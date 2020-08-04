package com.example.ecommerceapp

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_product_details.*

class ProductDetailsFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view=inflater.inflate(R.layout.fragment_product_details, container, false)
        val productName=view.findViewById<TextView>(R.id.product_name)
        val btnAvailable:Button=view.findViewById(R.id.btn_available)

        val title=ProductDetailsFragmentArgs.fromBundle(requireArguments()).productName
        productName.text=title

        btnAvailable.setOnClickListener {
            AlertDialog.Builder(this.context).apply {
                setMessage("is it $title avalible?")
                setPositiveButton("OK"){p0,p1->
                }.create().show()
            }
        }
        return view.rootView
    }
}
