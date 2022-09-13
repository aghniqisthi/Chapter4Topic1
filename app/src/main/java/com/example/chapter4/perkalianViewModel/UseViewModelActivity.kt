package com.example.chapter4.perkalianViewModel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.chapter4.R
import kotlinx.android.synthetic.main.activity_use_view_model.*

class UseViewModelActivity : AppCompatActivity() {
    lateinit var viewModel : ClassViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_use_view_model)

        viewModel = ViewModelProvider(this).get(ClassViewModel::class.java)
        txtHasil.text = viewModel.hasil.toString()

        btnHitung.setOnClickListener {
            var pjg = editPanjang.text.toString().toInt()
            var lbr = editLebar.text.toString().toInt()
            var tgg = editTinggi.text.toString().toInt()
            viewModel.HitungData(pjg, lbr, tgg)
            txtHasil.text = viewModel.hasil.toString()
        }
    }
}