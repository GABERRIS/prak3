fun main() {
    // Вводим расстояние в километрах
    print("Введите расстояние в километрах: ")
    val kilometers = readLine()!!.toDouble()

    // Вводим расстояние в футах
    print("Введите расстояние в футах: ")
    val feet = readLine()!!.toDouble()

    // Переводим футы в метры
    val metersFromFeet = feet * 0.305

    // Переводим километры в метры
    val metersFromKilometers = kilometers * 1000

    // Сравниваем расстояния в метрах
    if (metersFromFeet < metersFromKilometers) {
        println("Расстояние в футах меньше")
    } else if (metersFromFeet > metersFromKilometers) {
        println("Расстояние в километрах меньше")
    } else {
        println("Расстояния равны")
    }
}