package nullcheck

/**
 * In many languages (like Java), the infamous NullPointerException
 * (or "The Billion-Dollar Mistake") is a common cause of app crashes at runtime.
 * It happens when you try to access a property or call a method on an object that is currently null.
 */


fun main() {

//    val nullName = null
//    println(nullName)

    // Nullability Check Operators
    // 1. Safe call operator ?.
    // 2. Elvis operator ?:
    // 3. Not null assertion operator !!

    /*
    val name:String? = null
    print(name?.length ?: )

    it will give error as we are not handling the null check
     */
    // Let's do that
    var name: String? = "Rahul"
    name = null

    // 1. the long old school way

    if (name != null) {
        println("Old School- ${name.length}")
    } else {
        println("Old School- Name is null ")
    }

    // 2. Safe call operator
    println("Safe call- ${name?.length}");

    // 3. Not null assertion operator
//    println("Not null assertion- ${name!!.length}")

    // 4. Elvis operator
    println("Elvis operator- ${name?.length ?: "Can't give you length of null"}")

}