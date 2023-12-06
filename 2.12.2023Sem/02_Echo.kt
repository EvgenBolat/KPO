fun main() {
    val stroke = readLine()
    val words = stroke?.split(" ")?.toTypedArray()
    val name = words?.get(words.size - 1)
   for (i in 1..3) {
       println(name)
   }
}
