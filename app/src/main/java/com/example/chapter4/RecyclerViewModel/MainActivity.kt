package com.example.chapter4.RecyclerViewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chapter4.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapterMhs : MhsAdapter
    lateinit var mhsVM : MhsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataMhs()

        mhsVM = ViewModelProvider(this).get(MhsViewModel::class.java)

        mhsVM.getMhs()
        mhsVM.mhsList.observe(this, {
            adapterMhs.setDataMhs(it as ArrayList<ListMhs>)
        })
    }

    fun dataMhs(){
        adapterMhs = MhsAdapter(ArrayList())

        rvMhs.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvMhs.adapter = adapterMhs
    }
}