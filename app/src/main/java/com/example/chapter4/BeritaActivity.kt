package com.example.chapter4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapter4.RecyclerViewModel.ListMhs
import com.example.chapter4.RecyclerViewModel.MhsAdapter
import com.example.chapter4.RecyclerViewModel.MhsViewModel
import kotlinx.android.synthetic.main.activity_berita.*
import kotlinx.android.synthetic.main.activity_main.*

class BeritaActivity : AppCompatActivity() {
    lateinit var adapterBerita:BeritaAdapter
    lateinit var vmBerita : BeritaViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)

        dataBerita()

        vmBerita = ViewModelProvider(this).get(BeritaViewModel::class.java)

        vmBerita.getBerita()
        vmBerita.beritaList.observe(this, {
            adapterBerita.setDataBerita(it as ArrayList<ListBerita>)
        })

        adapterBerita = BeritaAdapter(ArrayList())
        rvBerita.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvBerita.adapter = adapterBerita

        adapterBerita.onClick = {
            var pindah = Intent(this, IsiBeritaActivity::class.java)
            pindah.putExtra("berita", it)
            startActivity(pindah)
        }

    }

    fun dataBerita(){
    }
}