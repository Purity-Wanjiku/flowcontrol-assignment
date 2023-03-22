fun main(){
    numOdd()

    var result = nameCheck(arrayOf("people","elephant","fruit","catherine","egg"))
    println(result)

    partyDrinks(6)

    numCheck()
}
//Create a function that prints out all the odd numbers between 1 and 100
fun numOdd(){
    for (x in 1..100)
        if (x%2 != 0){
            println(x)
        }
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun nameCheck(names: Array<String>): Int {
    var z = 0
    for (x in names){
        if (x.length>5) {
            z++
        }
    }
    return z
}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.
fun partyDrinks(age: Int){
    when (age){
        in 0..5 -> println("milk")
        in 7..14 -> println("fanta orange")
        else -> println("coca cola")

    }
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
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

