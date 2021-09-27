import abstraction.Piano
import classes.User
import encapsulation.Musician
import inheritance.SuperMusician
import polymorphism.Animal
import polymorphism.Dog
import polymorphism.Mathematics

fun main() {

    val myUser = User("James", 50)

    //constructor

    /* myUser.age = 25
     myUser.name = "James"
 */
    //Value Change
    myUser.age = 65
    myUser.name = "Corey"


    println(myUser.age)
    println(myUser.name)
    println(myUser.information())
/*
    //encapsulation
    var james = Musician("James","Guitar",55)
    james.age = 60
    println(james.age)

 */

    //inheritance

    val lars = SuperMusician("Lars", "Drum", 70)
    println(lars.name)
    println(lars.instrument)
    lars.sing()

    //polymorphism (static and dynamic)

    //static(same class and same function name)
    val mathematics = Mathematics()
    println(mathematics.sum())
    println(mathematics.sum(2, 3))
    println(mathematics.sum(2, 3, 4))

    //dynamic(different class and same function name)
    val animal = Animal()
    animal.sing()

    val bob = Dog()
    bob.test()
    bob.sing()

    //abstract & interface

    //var people = People()

    var myPiano = Piano()
    myPiano.brand = "Yamaha"
    myPiano.digital = true
    println(myPiano.roomName)
    myPiano.info()

    //Lambda expressions

    fun printString(myString: String) {
        println(myString)
    }

    printString("My Test String")

    val testString = { myString: String -> println(myString) }

    testString("My Lambda String")

    val multiplyLambda = { a: Int, b: Int -> a * b }
    println(multiplyLambda(5, 4))

    val multiplyLambda2: (Int, Int) -> Int = { a, b -> a * b }
    println(multiplyLambda2(5, 5))

    //asynchrnous

    //callback function, listener function, completion function

    fun downloadMusicians(url: String, completion: (Musician) -> Unit) {
        //url -> download
        //data
        val kirkHammet = Musician("Kirk", "Guitar", 60)
        completion(kirkHammet)
    }

    downloadMusicians("metallica.com") { musician ->
        println(musician.name)
    }
    
}
