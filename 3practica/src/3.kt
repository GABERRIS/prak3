fun main() {
    // Ввод двух чисел от пользователя
    println("Введите первое число:")
    val num1 = readLine()!!.toInt()
    println("Введите второе число:")
    val num2 = readLine()!!.toInt()

    // Проверка четности чисел
    if (num1 % 2 == 0 && num2 % 2 != 0) {
        // Если первое число четное, а второе нечетное, выводим второе число
        println("Нечетное число: $num2")
    } else if (num1 % 2 != 0 && num2 % 2 == 0) {
        // Если первое число нечетное, а второе четное, выводим первое число
        println("Нечетное число: $num1")
    } else {
        // Если оба числа четные или нечетные, выводим сообщение об ошибке
        println("Оба числа должны иметь разную четность.")
    }
}