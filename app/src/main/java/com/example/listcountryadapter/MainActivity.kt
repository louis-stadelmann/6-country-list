package com.example.listcountryadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.listcountryadapter.adapter.CountryAdapter
import com.example.listcountryadapter.model.CountryModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.lvMain)
        val adapter = CountryAdapter(this, generateCountries())
        listView.adapter = adapter
    }

    fun generateCountries(): ArrayList<CountryModel> {
        return arrayListOf(
            CountryModel(
                R.drawable.brazil,
                "Brazil",
                "Description Brazil"
            ),
            CountryModel(
                R.drawable.france,
                "France",
                "Description France"
            ),
            CountryModel(
                R.drawable.germany,
                "Germany",
                "Description Germany"
            ),
            CountryModel(
                R.drawable.saudiarabia,
                "Saudi Arabia",
                "Description Saudi arabia"
            ),
            CountryModel(
                R.drawable.spain,
                "Spain",
                "Description Spain"
            ),
            CountryModel(
                R.drawable.unitedkingdom,
                "United kingdom",
                "Description United kingdom"
            ),
            CountryModel(
                R.drawable.unitedstates,
                "USA",
                "Description USA"
            ),
        )
    }
}