fun main() {
    // Вводим длины сторон треугольника
    println("Введите длину первой стороны:")
    val side1 = readLine()!!.toDouble()

    println("Введите длину второй стороны:")
    val side2 = readLine()!!.toDouble()

    println("Введите длину третьей стороны:")
    val side3 = readLine()!!.toDouble()

    // Проверяем, может ли существовать треугольник с такими сторонами
    val isTriangle = (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)

    // Выводим результат
    if (isTriangle) {
        println("Треугольник с такими сторонами может существовать.")
    } else {
        println("Треугольник с такими сторонами не может существовать.")
    }
}