package classes

import abstraction.People

class User : People {
    //property

    var name: String? = null
    var age: Int? = null

    //constructor & init

    constructor(nameInput: String, ageInput: Int) {

        this.age = ageInput
        this.name = nameInput
    }

    init {
        println("init")
    }
}