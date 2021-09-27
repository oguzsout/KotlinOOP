package polymorphism

class Dog : Animal() {

    fun test() {
        super.sing() //(this sing comes from animal class)
    }

    override fun sing() {
        println("dog class")  //(however this sing different function)

    }
}