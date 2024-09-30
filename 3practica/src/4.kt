fun main() {
    // Ввод первого числа (большего)
    print("Введите первое число (большее): ")
    val firstNumber = readLine()!!.toInt()

    // Ввод второго числа (меньшего)
    print("Введите второе число (меньшее): ")
    val secondNumber = readLine()!!.toInt()

    // Проверка на кратность
    if (firstNumber % secondNumber == 0) {
        // Если первое число кратно второму, выводим сообщение
        println("$firstNumber кратно $secondNumber")
    } else {
        // Если первое число не кратно второму, выводим сообщение и остаток от деления
        val remainder = firstNumber % secondNumber
        println("$firstNumber не кратно $secondNumber. Остаток от деления: $remainder")
    }
}