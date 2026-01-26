package modules

import resources.OutpostResourse
import resources.ResourceManager

class EnergyGenerator: OutpostModule("Генератор энергии") {
    override fun performAction(manager: ResourceManager) {
        println("Генератор работает... Производит 20 энергии")
        val energy = manager.get("Energy")
        if (energy != null){
            energy.amount += 20
        } else {
            manager.add(OutpostResourse(99, "Energy", 20))
        }
    }
}