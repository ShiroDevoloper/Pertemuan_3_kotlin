package Inheritence
//Percobaan inheriten kelas parent dan child dengan menggunakan primary constructor
open class Computer(val name: String, val brand: String) {
}

class Laptop(name: String, brand: String, val batteryLife: Double) : Computer(name, brand) {
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}
fun main(){
    val myLaptop = Laptop("Asus X441U", "Asus", 2.5)
    println(myLaptop.info())
}