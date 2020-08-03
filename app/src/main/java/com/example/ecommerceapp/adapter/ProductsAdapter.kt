package com.example.ecommerceapp.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ecommerceapp.ProductFragmentDirections
import com.example.ecommerceapp.R
import com.example.ecommerceapp.model.Products

class ProductsAdapter(private val products:ArrayList<Products>):RecyclerView.Adapter<ProductsAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsAdapter.ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.layout_product_view,parent,false)
        val holder=ViewHolder(view)

        view.setOnClickListener {
            val action=
                ProductFragmentDirections.actionProductFragmentToProductDetailsFragment(products[holder.adapterPosition].title)
            Navigation.findNavController(parent).navigate(action)
        }


        return holder
    }

    override fun getItemCount()=products.size

    override fun onBindViewHolder(holder: ProductsAdapter.ViewHolder, position: Int) {
        holder.apply {
            title.setText(products[position].title)
            Glide.with(holder.itemView.context).load(products[position].image).into(imageView)
            price.setText(products[position].price.toString())
        }
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val title:TextView=itemView.findViewById(R.id.tv_product_name)
        val imageView:ImageView=itemView.findViewById(R.id.img_product)
        val price:TextView=itemView.findViewById(R.id.tv_price)

    }

}

