package com.example.myapplication.fragment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast
import com.example.myapplication.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val mark = resources.getStringArray(R.array.mark)
        val listViewItem = resources.getStringArray(R.array.mark)

        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item, mark
            )
            spinner.adapter = adapter


            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View, position: Int, id: Long
                ) {
                    Toast.makeText(
                        this@SecondActivity,
                        getString(R.string.select_spinner) + " " +
                                "" + mark[position], Toast.LENGTH_SHORT
                    ).show()
                }


                override fun onNothingSelected(parent: AdapterView<*>) {
                }
            }
        }

        val listView = findViewById<ListView>(R.id.listViewItem)
        val adapter = ArrayAdapter<String>(
            this,android.R.layout.simple_list_item_1, mark
        )
        listView.adapter = adapter;
        listView.onItemClickListener = AdapterView
            .OnItemClickListener { parent, view, position, id ->
            }

        var btnListView: Button = findViewById(R.id.btnListView)
        btnListView.setOnClickListener {
            val m_intent = Intent(this@SecondActivity, RecyclerView::class.java)
            startActivity(m_intent)
            onStop()
        }

    }
}