package payment

sealed class PaymentResult{
    data class Success(val id: String) : PaymentResult()
    data class Error(val reason: String) : PaymentResult()
    object Processing : PaymentResult()
}
enum class CardType{
    VISA, MASTERCARD, MIR, UNKNOWN
}
data class Payment(
    val card: String,
    val sum: Int,
    val type: CardType = CardType.UNKNOWN
)
class PaymentValidator {
    fun check(payment: Payment): Boolean{
        return when (payment.type){
            CardType.VISA -> payment.card.length == 16
                    && payment.card.startsWith("4")
            CardType.MASTERCARD -> payment.card.length == 16
                    && payment.card.startsWith("5")
            CardType.MIR -> payment.card.length == 16
                    && payment.card.startsWith("2")

            CardType.UNKNOWN -> payment.card.length == 16
        } && payment.sum > 0
    }
}