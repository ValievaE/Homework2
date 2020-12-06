fun main() {

    val minComission = 3500
    var amount = 100000
    val minAmount = 300
    val maxAmount = 75000
    var comission: Double = amount * 0.75

    if (amount < minAmount) {
        println("Comission: 0")
    } else if (amount in minAmount..maxAmount) {
        val resultComission = if (comission < minComission) minComission else comission
        println("Comission: $resultComission kop.")
    } else if (amount > maxAmount) {
        println("Limit 75000 rub.")
    }
}