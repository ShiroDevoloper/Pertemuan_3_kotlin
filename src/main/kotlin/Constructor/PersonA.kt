package Constructor
//Contoh kode program untuk menginisialisasi property yang dideklarasikan dalam tubuh kelas
class PersonA (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String
    var lastName:String
    var age: Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}
fun main(){
    val faisal = PersonA("Faisal", "Yanto", 20)
    println("Nama : ${faisal.firstName} ${faisal.lastName}")
    println("Kelas : ${faisal.age}")
}