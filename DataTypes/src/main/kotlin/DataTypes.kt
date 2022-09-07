import java.math.BigDecimal

fun main(args: Array<String>) {
    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val long1 = arrayOf(1L, 2L, 3L)
    val long2 = arrayOf<Long>(1, 2, 3, 4)
    val int1 = arrayOf(1, 2, 3, 4)

    println(long1 is Array<Long>)
    println(long2 is Array<Long>)
    println(int1 is Array<Int>)

    println(names[1])

    val evenNum = Array(16) { i -> i * 2}

    for (num in evenNum) {
        println(num)
    }

    val allZero = Array(100) { 0 }

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    
}