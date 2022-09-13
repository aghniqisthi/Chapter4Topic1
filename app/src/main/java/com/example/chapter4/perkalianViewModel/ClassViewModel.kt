package com.example.chapter4.perkalianViewModel

import androidx.lifecycle.ViewModel

//utk olah data inputan panjnag lebar tinggi
class ClassViewModel : ViewModel() {
    var hasil = 0
    fun HitungData(panjang:Int, lebar:Int, tinggi:Int){
        hasil = panjang * lebar * tinggi
    }
}