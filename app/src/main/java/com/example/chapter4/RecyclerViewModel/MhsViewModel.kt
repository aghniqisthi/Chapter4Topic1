package com.example.chapter4.RecyclerViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.chapter4.R

class MhsViewModel : ViewModel() {

    val list = arrayListOf(
        ListMhs("Cheol", "001", R.drawable.ic_launcher_foreground) ,
        ListMhs("Soo", "003", R.drawable.ic_launcher_foreground),
        ListMhs("Han", "002", R.drawable.ic_launcher_foreground),
        ListMhs("Uji", "007", R.drawable.ic_launcher_foreground),
        ListMhs("Gyu", "009", R.drawable.ic_launcher_foreground)
    )

    val mhsList :MutableLiveData<List<ListMhs>> = MutableLiveData()

    fun getMhs(){
        val mhs = list
        mhsList.value = mhs
    }
}