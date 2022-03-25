package Inheritence
//Percobaan mendelegasikan semua secondary constructor yang di inisialisasi kelas indukke konstruktor yang lain
//dipanggil dengan keyword super secara langsung
class LaptopB : Computer{
    val batteryLife: Double

    constructor(name: String, brand: String, batteryLife: Double): super(name, brand) {
        this.batteryLife = batteryLife
    }

    constructor(name: String, brand: String): this(name, brand, 0.0) {
    }
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}
fun main(){
    val myLaptop = LaptopB("Asus in search of incredible", "Asus")
    println(myLaptop.info())
}