package com.example.chapter4

import java.io.Serializable

data class ListBerita (var judul : String, var tanggal:String, var gambar:Int, var jurnalis:String, var isi:String) : Serializable