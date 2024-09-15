package com.example.herosapp_examenparcial.models

data class Publisher(val id : Int, val name:String, val image :String){
    companion object{
        val categories = mutableListOf<Publisher>(
            Publisher(1,"DC","https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/DC_Comics_logo.svg/800px-DC_Comics_logo.svg.png"),
            Publisher(2,"MARVEL","https://1000marcas.net/wp-content/uploads/2021/07/Marvel-Comics-logo.png")
        )
    }
}
