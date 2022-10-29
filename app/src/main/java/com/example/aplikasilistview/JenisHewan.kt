package com.example.aplikasilistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class JenisHewan(var mContext: Context, var resources: Int, var items:List<Hewan>): ArrayAdapter<Hewan>(mContext, resources, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater=LayoutInflater.from(mContext)
        val view:View = layoutInflater.inflate(resources, null)

        val imageView:ImageView = view.findViewById(R.id.fotohewan)
        val JenisHewan:TextView = view.findViewById(R.id.tvHewan)
        val Deskripsi:TextView = view.findViewById(R.id.tvDeskripsi)

        var mItem:Hewan = items[position]
        imageView.setImageDrawable(mContext.resources.getDrawable(mItem.photo))
        JenisHewan.text = mItem.Hewan
        Deskripsi.text = mItem.deskripsi
        return view
    }
}