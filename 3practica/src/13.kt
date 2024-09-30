fun main() {
    // Вводим четырехзначное число
    print("Введите четырехзначное число: ")
    val number = readLine()!!.toInt()

    // Разделяем число на цифры
    val digit1 = number / 1000
    val digit2 = (number % 1000) / 100
    val digit3 = (number % 100) / 10
    val digit4 = number % 10

    // Проверяем равенство суммы первых двух и последних двух цифр
    val sumFirstTwo = digit1 + digit2
    val sumLastTwo = digit3 + digit4
    println("Сумма первых двух цифр равна сумме последних двух: ${sumFirstTwo == sumLastTwo}")

    // Проверяем кратность суммы цифр трем
    val sumDigits = digit1 + digit2 + digit3 + digit4
    println("Сумма цифр кратна трем: ${sumDigits % 3 == 0}")

    // Проверяем кратность произведения цифр четырем
    val productDigits = digit1 * digit2 * digit3 * digit4
            println("Произведение цифр кратно четырем: ${productDigits % 4 == 0}")

    // Вводим число а
    print("Введите число a: ")
    val a = readLine()!!.toInt()

    // Проверяем кратность произведения цифр числу а
    println("Произведение цифр кратно числу a: ${productDigits % a == 0}")
}