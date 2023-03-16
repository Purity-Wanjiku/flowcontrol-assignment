fun main(){
    numOdd()

    var result = nameCheck(arrayOf("people","elephant","fruit","catherine","egg"))
    println(result)

    partyDrinks(23)

    numCheck()
}
fun numOdd(){
    var z = 0
    for (x in 1..100)
        if (x % 2 != 0){
            println(x)
        }
}
fun nameCheck(names: Array<String>): Int {
    var z = 0
    for (x in names){
//    names.forEach{ x ->
        if (x.length>5) {
            z++
        }
    }
    return z
}
fun partyDrinks(age: Int){
    when (age){
        in 0..6 -> println("milk")
        in 7..15 -> println("fanta orange")
        else -> println("coca cola")

    }
}

fun numCheck(){
    for (x in 1..100)
        if (x % 3 == 0 && x % 5 == 0) {
            println("FizzBuzz")
        } else if (x % 5 == 0) {
            println("Buzz")
        } else if (x % 3 == 0 ) {
            println("Fizz")
        } else {
            println(x)
        }}

