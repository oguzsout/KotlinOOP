package encapsulation

open class Musician(name: String, instrument: String, age: Int) {

    //encapsulation private public protected
    var name: String? = name
        get
        private set

    var instrument: String? = instrument
        get
        private set
/*
    private var age: Int? = age
        get
        private set

 */


/*
    constructor(name: String, instrument: String, age: Int){
        this.name = name
        this.instrument = instrument
        this.age = age

 */
}