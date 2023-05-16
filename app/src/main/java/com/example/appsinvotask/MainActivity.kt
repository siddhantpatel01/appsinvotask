package com.example.appsinvotask

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.appsinvotask.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationBarView


class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val toolbar = binding.toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        binding.navigation.setOnItemSelectedListener(this)
        val imageList = ArrayList<SlideModel>()


        imageList.add(SlideModel(R.drawable.offer, "Offer"))
        imageList.add(SlideModel(R.drawable.offer, "Offer"))
        imageList.add(SlideModel(R.drawable.offer, "Offer"))
        imageList.add(SlideModel(R.drawable.offer, "Offer"))
        binding.imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.scanqr -> {
                startActivity(Intent(this, BarCodeScannerActivity::class.java))
            }
        }
        return super.onOptionsItemSelected(item)
    }


}
