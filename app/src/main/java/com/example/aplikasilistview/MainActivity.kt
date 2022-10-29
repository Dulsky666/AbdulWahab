package com.example.aplikasilistview

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        val list = mutableListOf<Hewan>()

        list.add(Hewan("HARIMAU", "Harimau (Panthera tigris) adalah spesies kucing terbesar yang masih hidup dari genus Panthera."
            , R.drawable.harimau))
        list.add(Hewan("KATAK", " Katak adalah hewan amfibi pemakan serangga yang dapat hidup didarat dan didaratan, dengan kulit licin," +
                " warna hijau atau merah kecokelat-cokelatan, dengan kaki belakang lebih panjang, serta pandai melompat dan berenang."
            , R.drawable.katak))
        list.add(Hewan("KUCING", "kucing adalah hewan sejenis mamalia karnivora dari keluarga Felidae."
            , R.drawable.kucing))
        list.add(Hewan("ULAR", "Ular adalah kelompok reptilia tidak berkaki dan bertubuh panjang yang tersebar luas di dunia."
            , R.drawable.ular))
        list.add(Hewan("PANDA","Panda (Ailuropoda Melanoleuca) adalah spesies beruang yang ditemukan di pegunungan China tengah dan barat."
            , R.drawable.panda))

        listView.adapter = JenisHewan( this, R.layout.listhewan, list)

        listView.setOnItemClickListener { adapterView, view, i, l ->
            when(i){
                0 -> Toast.makeText(this, "Kamu Memilih Hewan Harimau", Toast.LENGTH_SHORT).show()
                1 -> Toast.makeText(this, "Kamu Memilih Hewan Katak", Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(this, "Kamu Memilih Hewan Kucing", Toast.LENGTH_SHORT).show()
                3 -> Toast.makeText(this, "Kamu Memilih Hewan Ular", Toast.LENGTH_SHORT).show()
                4 -> Toast.makeText(this, "Kamu Memilih Hewan Panda", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onBackPressed() {
        AlertDialog.Builder(this)
            .setMessage("Yakin ingin keluar?")
            .setPositiveButton("Yes",
                DialogInterface.OnClickListener { dialog, which -> finish() })
            .setNegativeButton("No",
                DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })
            .show()
    }
}