fun main() {
    val num: Int = 10
    val doubleNum: Double
    doubleNum = 343.334

    val userCount = 10
    val readCount = 20
    var user2 = 30 // ключивое слово var если нужно менять значение переменной
    user2 = 40

    println("сообщение ${userCount + readCount} сообщение user2 = ${user2}")
    print("$doubleNum принт без энтера \n  а так с \t табуляция \n")

    println("сообщение $user2 одна переменая $userCount еще одна")
    user2 += 1
    user2 ++
    user2 --
    println(user2)
    val firstNumber: Int = 1
    val secondNumber: Int = 2
    val newNumber = firstNumber + secondNumber
    println(newNumber)
    println("когда нужны ковычки в тексте \"нужно исползовать обратную косую черту\"")

}