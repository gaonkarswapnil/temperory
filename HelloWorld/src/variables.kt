import kotlin.reflect.typeOf

fun main() {

    /*
    var- we can change value anytime
    val- we can't change value once assign
    */
//    var userName : String? = "Oliver"
//    println("Hello $userName")
//
//    var userId: Int? = 12751
//    println("User ID $userId")
//
//    var userNumber: Long? = 9876543210
//    println("User Number $userNumber")
//
//    var flag: Boolean? = true
//    println("Flag is $flag")
//
//    val number: Int = 24
//
//    val minNumber: Int = Int.MIN_VALUE;
//    val maxNumber: Int = Int.MAX_VALUE
//    println("$number $minNumber $maxNumber")
//
//    val minLongNumber: Long = Long.MIN_VALUE
//    val maxLongNumber: Long = Long.MAX_VALUE
//    println("$minLongNumber $maxLongNumber")
//
//    val minByte: Byte = Byte.MIN_VALUE
//    val maxByte: Byte = Byte.MAX_VALUE
//    println("$minByte $maxByte")
//
//    val minByteShortVal: Short = Short.MIN_VALUE
//    val maxByteShortVal: Short = Short.MAX_VALUE
//    println("$minByteShortVal $maxByteShortVal")
//
//    val minFloat: Float = Float.MIN_VALUE;
//    val maxFloat: Float = Float.MAX_VALUE
//    println("$minFloat $maxFloat")
//
//    val minDouble: Double = Double.MIN_VALUE
//    val maxDouble: Double = Double.MAX_VALUE
//    println("$minDouble $maxDouble")

    var myNumber: Int = 85
//    if(myNumber>=80){
//        println("First")
//    }else if(myNumber>=60) {
//        println("Second")
//    }else if(myNumber>=40) {
//        println("Third")
//    }else {
//        println("Backlog")
//    }

    val isActive: Boolean = true

//    if(!isActive){
//        println("Active")
//    }
//    else{
//        println("Inactive")
//    }

//    if(isActive && myNumber >= 85) {
//        println("flex")
//    }else{
//        println("neutral")
//    }

    var myNum: Int = 80;
    var myNum1: Int = 40;
    var text = if (myNum < 0 || myNum1 < 0) {
//        println("Enter positive number: ")
        "Enter Positive number: "
    } else {
//        println("number: ")
        5
    }

    println("text is ${text::class.java}")
}