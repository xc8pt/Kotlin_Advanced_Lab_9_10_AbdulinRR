data class OutpostResourse(
    val id: Int,
    val name: String,
    val amount: Int
) {
    override fun toString(): String {
        return "Ваш ресурс: $id | Имя: $name | Кол-во: $amount"
    }
}
fun main(){
    val gas = OutpostResourse(1,"Gas", 100)
    val mineral = OutpostResourse(2, "Minerals", 250)
    println("Успех! Вы добавили доп. кол-во минералов: " +
            "${mineral.amount + 50}")
    val bonusMineral = mineral.copy(3,"Mineral Bonus", amount = mineral.amount + 50)
    println(gas.toString())
    println(mineral.toString())
    println(bonusMineral.toString())
}