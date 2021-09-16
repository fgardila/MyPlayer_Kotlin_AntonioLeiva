package com.fgardila.myplayer_kotlinantonioleiva

open class Person(name: String, age: Int)

class Developer(name: String): Person(name, 20) {

}

fun test() {
    val p = Person("John", 20)
    val d = Developer("Tom")
}