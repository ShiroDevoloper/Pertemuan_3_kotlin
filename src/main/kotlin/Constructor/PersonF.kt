package Constructor

//Penggunaan Delegasi ke konstruktor lain di kelas yang sama dilakukan menggunakan keyword this

class PersonF (val firstName: String, val lastName: String) {
    init {
        println("Sedang inisialisasi wak!")
    }
    constructor(_firstName: String, _lastName: String, _age:Int): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println()
    }
    constructor(_firstName: String, _lastName:String, _country:String): this(_firstName, _lastName){
        println("Name : $_firstName $_lastName")
        println("Country : $_country")
        println()
    }
    constructor(_firstName: String, _lastName:String, _age:Int, _country:String): this(_firstName,
        _lastName, _age){
        println("Name : $_firstName $_lastName")
        println("Age : $_age")
        println("Country : $_country")
    }
}
fun main(){
    val anton = PersonF("Titok", "Yudani")
    val budi = PersonF("Faisal", "Yanto", 20)
    val caca = PersonF("Amanda", "Agung", "Indonesia")
    val dono = PersonF("Putri", "nurhaniza", 20, "Indonesia")
}