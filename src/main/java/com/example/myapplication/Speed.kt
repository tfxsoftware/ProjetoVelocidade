package com.example.myapplication

class Speed (pInicial:Double, pFinal:Double, tInicial:Double, tFinal:Double) {
    var pI: Double = pInicial
    var pF: Double = pFinal
    var tI: Double = tInicial
    var tF: Double = tFinal



    fun calculaVelocidade():String{
        return ((pF - pI)/(tF - tI)).toString()
    }

}