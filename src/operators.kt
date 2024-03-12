fun main() {
    //Arithmetic operators
    var num1 = 45
    var num2 = 34
    println(num1 + num2)
    println(num1 - num2)
    println(num1 * num2)
    println(num1 / num2)
    println(num1 % num2)

    //Comparison operators
    println(num1 < num2)
    println(num1 > num2)
    println(num1 <= num2)
    println(num1 >= num2)
    println(num1 == num2) //equal to
    println(num1 != num2) //not equal to

    //logic operators - and, or and not
    println(num1< num2 && num1 != num2)
    println(num1< num2 || num1 != num2)
    println(!(num1< num2 || num1 != num2))

    //Assignment operators

    var x = 34
    x += 2
    println(x)

    var y = 15
    y %= 4
    println(y)




}