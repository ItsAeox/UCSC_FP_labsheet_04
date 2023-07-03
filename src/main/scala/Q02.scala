@main def Question_02: Unit =
    println("Enter the Interger : ")
    var inp = scala.io.StdIn.readInt()
    check(inp)

def check(value: Int): Unit = {
    if(0 > value){
        println("Negative/Zero Input")
    } else if(value%2 == 0){
        println("Even number is given")
    } else if(value%2 == 1){
        println("Odd number is given")
    }
}