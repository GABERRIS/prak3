fun main() {
    // Ввод натурального числа с клавиатуры
    print("Введите натуральное число: ")
    val number = readLine()!!.toInt()

    // Проверка на четность
    if (number % 2 == 0) {
        println("Число четное")
    } else {
        println("Число нечетное")
    }

    // Проверка на окончание цифрой 7
    if (number % 10 == 7) {
        println("Число оканчивается цифрой 7")
    } else {
        println("Число не оканчивается цифрой 7")
    }
}