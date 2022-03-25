package Polymorphism
//Percobaan Dynamic polymorphism dengan mendefenisikan beberapa fungsi yang di override.
// Lalu memangil fungsi yang dipanggil ditentukan pada saat runtime.
open class MyBase {

    open fun think () {
        println("Hey!! i am thinking ")
    }
}
class MyDerived: MyBase() {

    override fun think() {
        println("I Am from Child")
    }
}
fun main() {
    val myBase = MyBase()
    myBase.think()
    var myDerived = MyDerived()
    myDerived.think()
}