package `Nested dan Inner Class`
//Percobaan Anonymous Class
//Konsep membuat sebuah objek interface menggunakan objek runtime dikenal sebagai anonymous class
fun main() {
    var programmer: Human = object : Human {
        override fun think() { // overriding the think method
            print("I am an example of Anonymous Inner Class ")
        }
    }
    programmer.think()
}
interface Human {
    fun think()
}