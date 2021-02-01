package com.example.ecomerceappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_show_json_object.*

class ShowJsonObjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_json_object)



        btnSubmit.setOnClickListener {

            val productUrl = "https://reggaerencontre.com/present_json.php?id=" +
                    edtProductID.text.toString()
            var requestQ: RequestQueue = Volley.newRequestQueue(this)
            val jsonOR = JsonObjectRequest(Request.Method.GET , productUrl ,null,
                    Response.Listener { response ->

                        txtProductName.text = response.getString("name")
                        txtProductPrice.text = response.getInt("price").toString()
                    }, Response.ErrorListener { error->
                txtProductName.text = error.message
            })

            requestQ.add(jsonOR)


            

        }
    }
}