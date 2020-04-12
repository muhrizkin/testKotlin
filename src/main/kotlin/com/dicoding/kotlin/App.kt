// from https://www.dicoding.com/academies/80
package com.dicoding.kotlin

fun main(){
    breakDanContinue()
}

fun fundamental() {
    val nama = "Muhammad Rizki Nurlahid"
    print("Hello my name is!! ")
    println(nama)
    print(if (true) "Always True" else "Always false")
}

fun dataTypes(){
    val firstWord = "Muhammad Rizki "
    val lastWord = "Nurlahid"
    print(firstWord + lastWord)

    println()

    val valueA = 10
    val valueB = 20
    print(valueA+ valueB)
}

fun characters() {
    var vocal = 'A'

    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println()
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
}

fun strings() {
    val text  = "Kotlin"
    val firstChar = text[0]

    println("First character of $text is $firstChar")

    for (char in text){
        print("$char ")
    }
    println()
    val statement = "Kotlin is \"Awesome!\""
    println(statement)

    val name = "Unicode test: \u0394"
    println(name)

    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)
}

fun arrays() {
    val intArray = intArrayOf(1, 3, 5, 7)
    print(intArray[2])

    println()

    intArray[2] = 11                       // [1, 3, 11, 7]
    print(intArray[2])

    println()

    val intArray1 = Array(4) { i -> i * i } // [0, 1, 4, 9] //i is argumen ex:[3]
    print(intArray1[3])
}

fun functions() {
    val user = setUser("Muh Rizki N", 19)
    println(user)

    printUser("Muh Rizki N")
}
fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"
fun printUser(name: String) {
    println("Your name is $name")
}

fun ifExpressions(){
    val openHours = 7
    val now = 7
    val office: String
    office = if (now > 7) {
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)
}

fun boolean(){
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    print("Office is open : $isOpen")

    println()

    val isOpen1 = now >= officeOpen && now <= officeClosed

    print("Office is open : $isOpen1")

    println()

    val isOpen2 = now < officeOpen || now > officeClosed

    print("Office is closed : $isOpen2")

    println()

    val officeOpen1 = 7
    val now1 = 10
    val isOpen3 = now1 > officeOpen1

    if (!isOpen3) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}

fun numbers(){
    val intNumbers = 100 // int 32 bit
    val longNumbers: Long = 100 // long 64 bit or val longNumbers = 100L
    val shortNumber: Short = 10 // short 16 bit
    val byteNumber = 0b11010010 // byte 8 bit
    val doubleNumbers = 1.3 // double 64 bit

    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

    println()

//    val maxInt = Int.MAX_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")

    println()

    val numberOne = 1
    val numberTwo = 2

    print(numberOne + numberTwo)

    println()

    val numberOne1: Int = 29
    val numberTwo1: Int = 10

    print(numberOne1 / numberTwo1)

    println()

    println(5 + 4 * 4)
    print((5 + 4) * 4)

    println()

    val byteNumber1: Byte = 10
    val intNumber: Int = byteNumber1.toInt() // ready to go

    val stringNumber = "23"
    val intNumber1 = 3

    print(intNumber1 + stringNumber.toInt())

    println()

    val readableNumber = 1_000_000
    print(readableNumber)
}

fun nullableTypes(){
    val text: String? = null

//val textLength = text.length // compile time error

    if (text != null){
        val textLength = text.length // ready to go
    }
}

fun safeCallsAndElvisOperator(){
    val text: String? = null

    // Safe calls (?.)
    text?.length

    // Elvis Operator (?:)
    val textLength = text?.length ?: 7

    // non-null assertion (!!) // NOT RECOMMENDED
    val textLength1 = text!!.length // ready to go ???
}

fun stringTemplate(){
    val name = "Kotlin"
    print("My name is $name")

    println()

    val old = 3
    print("My name is $name, im $old years old")

    println()

    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")
}

fun enumeration(){
    val color: Color = Color.GREEN

    when(color){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
    }
}
enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

fun whenExpressions(){
    val anyType: Any = 100L
    when (anyType) {
        is Long -> println("the value has a Long type")
        is Int -> println("the value has a Int type")
        is Double -> println("the value has a Double type")
        else -> println("undefined")
    }
}

fun expressionsDanStatements() {
    val value1 = 10 // value1 dan value2 merupakan statements
    val value2 = 10

    sum(value1, value2) // ini expression
}
fun sum(value1: Int, value2: Int) = value1 + value2

fun whileDanDoWhile(){
    var counter = 1
    while (counter <= 7){
        println("Hello, World!")
        counter++
    }


    do {
        println("Hello, World!")
        counter++
    } while (counter <= 7)
}

fun forLoop(){
    val ranges = 1.rangeTo(10) step 3 //ekstensi step yang akan mengembalikan nilai baru dengan tipe IntProgression dengan jarak nilai sebelumnya adalah 3
    for (i in ranges ){
        println("value is $i!")
    }

    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }

    ranges.forEach { value ->
        println("value is $value!")
    }

    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
}

fun range(){
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)

    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }
    if (11 !in tenToOne) {
        println("No value 11 in Range ")
    }

    val rangeChar = 'A'.rangeTo('F')
}

fun breakDanContinue(){
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }

    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }

    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
    //Pada kode diatas, break yang sudah ditandai dengan label akan dilompati ke titik awal proses perulangan yang sudah ditandai dengan label. break akan menghentikan proses perulangan terluar dari dalam proses perulangan, di mana break tersebut dipanggil
}


