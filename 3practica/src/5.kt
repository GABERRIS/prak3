fun main() {
    // Запрашиваем у пользователя ввести год
    print("Введите год: ")
    val year = readLine()!!.toInt()

    // Проверяем, является ли год високосным
    val isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0

    // Выводим на экран, является ли год високосным
    if (isLeapYear) {
        println("$year - високосный год")
    } else {
        println("$year - не високосный год")
    }

    // Определяем количество дней в году
    val daysInYear = if (isLeapYear) 366 else 365

    // Выводим количество дней в году
    println("Количество дней в году: $daysInYear")
}