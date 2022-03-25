package `Nested dan Inner Class`
//Percobaan nested
//Ketika sebuah kelas dideklarasikan didalam kelas lain, maka ia disebut dengan nested class.
//Sebuah nested class tidak dapat mengakses anggota dari kelas luarnya
//Untuk mengakses anggota dari nested class, kita gunakan („.‟) operator dengan outer kelasnya
class Outer {
    val a = "Outside Nested class."
    class Nested {
        val b = "Inside Nested class."
        fun callMe() = "Function call from inside Nested class."
    }
}
fun main(args: Array<String>) {
// accessing member of Nested class
    println(Outer.Nested().b)
// creating object of Nested class
    val nested = Outer.Nested()
    println(nested.callMe())
}