package Encapsulation
//Percobaan setter dan getter default
class EmployeeA(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field
    var name: String = _name
        get(){
            return field.toUpperCase()
        }
        set(value) {
            field = value
        }
    var age: Int = _age
        get() = field
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("Umur harus lebih besar dari 0")
        }
}
fun main() {
    val emp = EmployeeA(2213, "Faisal", 20)
    println("Id : ${emp.id}, Nama : ${emp.name}, Umur : ${emp.age}")
    emp.age = -1
}