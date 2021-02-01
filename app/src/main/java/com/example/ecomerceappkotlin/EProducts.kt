package com.example.ecomerceappkotlin

class EProduct {


     var id: Int

     var name: String
     var  price: Int

     var productPicature: Int

    constructor(i: Int, n: String, p: Int, pp: Int){


        this.id = i
        this.name = n
        this.price = p
        this.productPicature = pp
    }

}