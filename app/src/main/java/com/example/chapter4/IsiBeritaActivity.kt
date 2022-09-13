package com.example.chapter4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_isi_berita.*
import kotlinx.android.synthetic.main.item_berita.*

class IsiBeritaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_isi_berita)

        var getData = intent.getSerializableExtra("berita") as ListBerita
        judulIsi.text = getData.judul
        tanggalIsi.text = getData.tanggal
        jurnalis.text = getData.jurnalis
        gambarIsi.setImageResource(getData.gambar)
        isiBerita.text = getData.isi
    }
}