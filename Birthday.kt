fun main() {
    val age = 25
    val layers = 5
    val name = "Rover"
    
    println("Happy Birthday, ${name}!")
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
    
    println()
	
	println("You are already ${age} years old, ${name}!")
	println("${age} years old is the very best age to celebrate!")
   
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}

fun printCakeCandles(age: Int) {
    print(" ")
    repeat(age) {
        print(",")
    }
    println() // EmptyLine
    
    print(" ") // Prints insert
    repeat(age){
        print("|")
    }
    println() //EmptyLine
}

fun printCakeBottom(age: Int, layers: Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
    println()
}