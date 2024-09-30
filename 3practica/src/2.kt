fun main() {
    // Ввод трех чисел
    print("Введите первое число: ")
    val num1 = readLine()!!.toInt()
    print("Введите второе число: ")
    val num2 = readLine()!!.toInt()
    print("Введите третье число: ")
    val num3 = readLine()!!.toInt()

    // Проверка на наличие одинаковых чисел
    if (num1 == num2 || num1 == num3 || num2 == num3) {
        println("Ошибка!")
    } else {
        // Вычисление среднего арифметического
        val average = (num1 + num2 + num3) / 3.0

        // Вывод результата
        println("Среднее значение равно: $average")
    }
}