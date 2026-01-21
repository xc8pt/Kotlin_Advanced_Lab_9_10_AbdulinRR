fun main(){
    val manager = ResourceManager()
    val minerals = OutpostResourse(1, "Minerals", 300)
    val gas = OutpostResourse(2, "Gas", 100)
    manager.add(minerals)
    manager.add(gas)
    manager.printAll()
    val bonus = minerals.copy(amount = minerals.amount + 50)
    println("опия минералов с бонусами $bonus")
}