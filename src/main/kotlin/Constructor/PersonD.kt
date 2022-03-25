package Constructor
//contoh konstruktor tambahan tapi tidak memiliki konstruktor utama
class PersonD {
    var firstName: String
    var lastName: String
    var age: Int
    constructor(_firstName: String, _lastName: String, _age: Int){
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}
fun main(){
    val faisal = PersonD("Faisal", "Yanto", 20)
    println("Name : ${faisal.firstName} ${faisal.lastName}")
    println("Age : ${faisal.age}")
}