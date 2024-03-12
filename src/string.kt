fun main() {

    var greeting = "Hello world"
    var firstname = "Cate"
    firstname ="Kaso"
    var lastname = "Chepkorir"

    println(firstname + " " + lastname) //String concatenation
    println(firstname.plus(lastname))

    println(greeting[6]) //Accessing an element in a string
    println(greeting.indexOf("world"))

    println(firstname.toUpperCase())

    //String interpolation
    println("Hello there.My name is $firstname")

}