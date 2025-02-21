fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    // safer alternative using filter
    val evenNumbersRemoved = list.filter { it % 2 != 0 }
    println(evenNumbersRemoved) //Output: [1,3,5]

    //safe alternative for removing at specific index 
    val list2 = mutableListOf<Int>(1, 2, 3, 4, 5)
    val indexToRemove = 2 //index of element to remove
    if(indexToRemove in list2.indices) { 
        list2.removeAt(indexToRemove)
        println(list2) //Output: [1,2,4,5]
    } else {
        println("Invalid index")
    }
    
    //using remove with check before removal
    val list3 = mutableListOf<Int>(1, 2, 3, 4, 5)
    val elementToRemove = 3
    if(elementToRemove in list3){ 
        list3.remove(elementToRemove)
        println(list3) //Output: [1,2,4,5]
    } else {
        println("Element not found")
    }
} 