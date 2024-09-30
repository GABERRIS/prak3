fun main() {
    // Вводим двузначное число
    print("Введите двузначное число: ")
    val number = readLine()!!.toInt()

    // Выделяем первую и вторую цифры
    val firstDigit = number / 10 // Деление на 10 отбрасывает единицы, оставляя десятки
    val secondDigit = number % 10 // Оператор % (остаток от деления) дает единицы

    // Сравниваем цифры и выводим результат
    if (firstDigit > secondDigit) {
        println("Первая цифра больше второй.")
    } else if (firstDigit < secondDigit) {
        println("Вторая цифра больше первой.")
    } else {
        println("Цифры одинаковы.")
    }
}