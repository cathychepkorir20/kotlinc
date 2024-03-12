import java.util.Scanner

fun main() {

    var reader = Scanner(System.`in`)

    println("enter room temperature:")
    var temperature = reader.nextInt(    )

    if (temperature < 25){
        println("it is cold")
    }
    else{
        println("it is hot")
    }

}