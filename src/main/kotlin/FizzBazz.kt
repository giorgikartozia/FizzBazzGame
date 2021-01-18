fun main() {
    val range = getRange()
    val arr = IntArray(range, {i -> i + 1})
    playFizzBazz(arr)
}

fun playFizzBazz(arr: IntArray) {
    for (e in arr) {
        when {
            (e % 3 == 0 && e % 5 == 0) -> print("FizzBazz ")
            (e % 3 == 0 ) -> print("Fizz ")
            (e % 5 == 0 ) -> print("Bazz ")
            else -> print("$e ")
        }
    }
}

fun getRange() : Int {
    println("Please enter the last number")
        val range = readLine()?.toInt()
        return range!!
}

