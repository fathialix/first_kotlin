package oop

import java.awt.Color

class Vehicle(owner:String, color:String, wheels:Int, model:String) {

    init {
        println("Owned by $owner")
        println("Color is $color")
        println("Number of wheels are $wheels")
        println("The model of the car is $model")
    }
}

fun main(args: Array<String>) {
    var owner_one = Vehicle("Sharon","Red",4,"Toyota")
    var owner_two = Vehicle("Jay","White",4,"Jeep")
    var owner_three = Vehicle("Fourth","Blue",4,"AUDI A3")
}