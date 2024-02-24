package com.example.test
import com.example.test.myapp.Aquariums
import com.example.test.myapp.TowerTank
import com.example.test.myapp.Shark
import com.example.test.myapp.Plecostomus

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main () {
    makeFish()
}
