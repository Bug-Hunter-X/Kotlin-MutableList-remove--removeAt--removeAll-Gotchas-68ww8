fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.remove(1)
    println(list) //Output: [2, 3, 4, 5]

    list.removeAt(0)
    println(list) //Output: [3, 4, 5]

    list.removeAll {it % 2 == 0}
    println(list) //Output: [3,5] 
}