package Constructor
//Menggabungkan proses deklarasi dan menginisialisasi sebuah variabel
class PersonB (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String = _firstName
    var lastName:String = _lastName
    var age: Int = _age
}
fun main(){
    val faisal = PersonB("Faisal", "Yanto", 20)
    println("Name : ${faisal.firstName} ${faisal.lastName}")
    println("Age : ${faisal.age}")
}