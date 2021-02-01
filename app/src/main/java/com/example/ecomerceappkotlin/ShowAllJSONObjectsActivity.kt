package com.example.ecomerceappkotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_show_all_j_s_o_n_objects.*
import kotlinx.android.synthetic.main.activity_show_json_object.*

class ShowAllJSONObjectsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_all_j_s_o_n_objects)

        txtAllProducts.setBackgroundColor(Color.BLUE)
        txtAllProducts.setTextColor(Color.WHITE)


        txtAllProducts.setOnClickListener {




            val allProductUrl = "https://reggaerencontre.com/present_json_array.php"
            var allProductsString = ""

            val requestQ: RequestQueue = Volley.newRequestQueue(this)
            val jsonAR = JsonArrayRequest(Request.Method.GET , allProductUrl ,null,
                Response.Listener { response ->

                    for(productIndex in 0.until(response.length())){


                    //allProductsString +=
                    // allProductsString = allProductsString + response.getJSONObject(productIndex).getString("name")+
                    // "-" + response.getJSONObject(productIndex).getInt("price")

                    var pn = response.getJSONObject(productIndex).getString("name")
                    var pp = response.getJSONObject(productIndex).getInt("price")

                    allProductsString = allProductsString + pn + "-" + pp + "\n"




                }
                txtAllProducts.text = allProductsString

        },
        Response.ErrorListener { error->
            txtAllProducts.text = error.message })





          requestQ.add(jsonAR)


    }

    }
}