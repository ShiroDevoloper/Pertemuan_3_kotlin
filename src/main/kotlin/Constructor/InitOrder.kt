package Constructor
//contoh pengunaan konstructor
class InitOrder(name: String) {
    val firstProperty = "Nama: $name".also(::println)
    init {
        println("property pertama ${name}")
    }
    val secondProperty = "Property kedua: ${name.length}".also(::println)
    init {
        println("Initializer blok kedua yang menghasilkan ${name.length}")
    }
}
fun main(){
    val initOrder = InitOrder("Faisal Yanto Setiawan") //pemangilan
}