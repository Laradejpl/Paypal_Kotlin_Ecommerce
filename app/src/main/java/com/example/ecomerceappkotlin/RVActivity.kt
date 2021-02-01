package com.example.ecomerceappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_r_v.*


class RVActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_r_v)





      var myProductsList = ArrayList<EProduct>()

        myProductsList.add(EProduct(i =   0, n = "iphone", p =  1000, pp =  R.drawable.iphone ))

        myProductsList.add(EProduct( i =  1, n =  "macbook", p =  1600, pp = R.drawable.macbook ))

        myProductsList.add(EProduct(i =  2, n =  "ipodnano", p =  1600, pp = R.drawable.ipodnano ))

        myProductsList.add(EProduct( i =  3, n = "ipodshuffle", p =  1300, pp = R.drawable.ipodshuffle))


        myProductsList.add(EProduct( i =  4, n =  "ipodnano", p =  500, pp = R.drawable.ipodtouch))

        myProductsList.add(EProduct( i =  5, n =  "ipad", p =  500, pp = R.drawable.ipad))


        var rvAdapter = RVAdapter(this@RVActivity,myProductsList)




        vuerecycler.layoutManager =
            LinearLayoutManager(this@RVActivity)

        vuerecycler.adapter = rvAdapter










    }


    }



