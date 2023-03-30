package com.example.listcountryadapter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.listcountryadapter.R
import com.example.listcountryadapter.model.CountryModel

class CountryAdapter(var context: Context, var countries: ArrayList<CountryModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return countries.size
    }

    override fun getItem(position: Int): CountryModel {
        return countries[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val inflater: LayoutInflater
                = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rowView = inflater.inflate(R.layout.list_item, parent, false)

        val imageView = rowView.findViewById<ImageView>(R.id.imageView)
        val textView1 = rowView.findViewById<TextView>(R.id.tvItem1)
        val textView2 = rowView.findViewById<TextView>(R.id.tvItem2)

        val country = getItem(position)

        imageView.setImageResource(country.image)
        textView1.text = country.title
        textView2.text = country.description

        return rowView
    }
}