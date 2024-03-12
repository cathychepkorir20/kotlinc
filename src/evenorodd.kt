import java.util.*

fun main() {

    var good = Scanner(System.`in`)


    print("Enter " +
            "number:")
    var number = good.nextInt()


    if (number % 2 == 0) {
        println("$number is even.")
    } else {
        println("$number is odd.")
    }
}