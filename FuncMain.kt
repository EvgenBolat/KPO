fun main() {
   var arr = readLine()?.split(" ")?.toTypedArray()
   var count = 1
   if (arr!![0] != "") {
       for (i in 1..arr.size - 1) {
           if (arr[i-1] != arr[i]) {
               count += 1
           }
       }
   } else {
       count = 0
   }
   println(count)
}
