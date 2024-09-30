fun main() {
    // Вводим два числа с клавиатуры
    print("Введите число a: ")
    val a = readLine()!!.toInt()
    print("Введите число b: ")
    val b = readLine()!!.toInt()

    // Проверяем, делится ли b на a без остатка
    val isDivisible = b % a == 0

    // Выводим результат
    if (isDivisible) {
        println("$a является делителем $b")
    } else {
        println("$a не является делителем $b")
    }
}