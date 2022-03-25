package Constructor
//pengunaan inisialisasi property hanya didalam parameter konstruktor utama
class PersonC (var firstName: String, var lastName: String, var age: Int) {}
fun main(){
    val faisal = PersonC("Faisal", "Yanto", 20)
    println("Name : ${faisal.firstName} ${faisal.lastName}")
    println("Age : ${faisal.age}")
}