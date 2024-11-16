//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun sumOfDigit(number:Int):Int{
    if(number==0){
        return 0
    }
    return number % 10 + sumOfDigit(number/10)
}
fun main() {
    val number = 12345
    val result = sumOfDigit(number)
    println("$result")
}