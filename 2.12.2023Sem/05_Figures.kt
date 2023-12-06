fun main() {
    print("Введите тип фигуры: ")
    var typeOfFig = readLine()
    print("Введите высоту фигуры: ")
    var height = readLine()?.toUInt()!!
    print("Введите основание фигуры: ")
    var length = readLine()?.toUInt()!!

    var fig : Figure
    when (typeOfFig) {
        "Куб" -> {
            fig = Cube(height, length)
            print(fig.ToString())
        }
        "Пирамида" -> {
            fig = Pyramid(height, length)
            print(fig.ToString())
        }
        "Конус" -> {
            fig = Cone(height, length)
            print(fig.ToString())
        }
        else -> println("\nНеправильный тип фигуры!")
    }
}