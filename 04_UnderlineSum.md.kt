fun main() {
    val sizeofMatr = readLine()?.toInt()
    var arr = Array(sizeofMatr!!) { Array<Int>(sizeofMatr!!) { 0 } }
    for (i in 0..sizeofMatr - 1) {
        for (j in 0..sizeofMatr - 1) {
            arr[i][j] = (0..10).random()
            print(arr[i][j])
            print(" ")
        }
        print('\n')
    }
    var sum = 0
    for (i in 1..sizeofMatr - 1) {
        for (j in 0..i - 1) {
            sum += arr[i][sizeofMatr - 1 - j]
        }
    }
    println(sum)
}