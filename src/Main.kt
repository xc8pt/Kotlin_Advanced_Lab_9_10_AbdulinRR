import example.GameHero
import example.GameSession
import example.InstantMessenger
import example.Logger
import example.PhotoCamera
import example.SmartPhone
import example.UserProfile
import example.counter
import modules.EnergyGenerator
import modules.ModuleResult
import modules.ResearchLab
import resources.FileStorage
import resources.OutpostResourse
import resources.ResourceManager

fun main() {
//    val manager = ResourceManager()
//    manager.add(OutpostResourse(1, "Minerals", 120))
//    manager.add(OutpostResourse(2, "Gas", 40))
//    val generator = EnergyGenerator()
//    val lab = ResearchLab()
//    generator.performAction(manager)
//    lab.performAction(manager)
//    println()
//    manager.printAll()
//    val minerals = resources.OutpostResourse(1, "Minerals", 300)
//    val gas = resources.OutpostResourse(2, "Gas", 100)
//    manager.add(minerals)
//    manager.add(gas)
//    manager.printAll()
//    val bonus = minerals.copy(amount = minerals.amount + 50)
//    println("опия минералов с бонусами $bonus")
//
//    println("Программа запущена")
//    println("Проверяем состояние, но не трогаем GameSession")
//    println("Теперь запускаем игру")
//    GameSession.start()
//    println("Проверяем состояние ещё раз")
//    println("Активна ли сессия: ${GameSession.isActive}")
//
//    Logger.log("Первое сообщение")
//    Logger.log("Второе сообщение")
//    val logger1 = Logger
//    val logger2 = Logger
//    println(logger1 == logger2)
//
//    val generatorResult = generator.performAction(manager)
//    val labResult = lab.performAction(manager)
//    fun handleModuleResult(result: ModuleResult){
//        when (result){
//            is ModuleResult.Success ->
//                println("УСПЕХ: ${result.message}")
//            is ModuleResult.ResourceProduced ->
//                println("Произведено: ${result.resourceName} +${result.amount}")
//            is ModuleResult.NotEnoughResources ->
//                println("Недостаточно ресурса ${result.resourceName}. " +
//                "Нужно: ${result.required}, есть: ${result.available}")
//            is ModuleResult.Error ->
//                println("ОШИБКА: ${result.reason}")
//        }
//    }
//    handleModuleResult(generatorResult)
//    handleModuleResult(labResult)
//    println()
//    manager.printAll()

//    val max = InstantMessenger("max")
////    val photoCamera = PhotoCamera()
//    val yotaPhone = SmartPhone("YotaPhone", max)
//    yotaPhone.sendTextMessage()
//    yotaPhone.sendVideoMessage()
////
//    counter = 1
//    counter = 5
    //
//    println("Создаём профиль пользователя...")
//    val user = UserProfile("Rinat", "rinatAbd@example.com")
//    println("\nИмя: ${user.name}")
//    println("Email: ${user.email}")
//    println("\nОбращаемся к аватару впервые:")
//    println("Файл аватара: ${user.avatar}")
//    println("\nОбращаемся к аватару снова (должен быть взят из кэша):")
//    println("Файл аватара: ${user.avatar}")
//    println("\nМеняем email:")
//    user.email = "Abdrinat@example.com"
//    println("\nМеняем Name:")
//    user.name = "Rinat A."
//
//    println("Создаём героя...")
//    val hero = GameHero("Xc8pt")
//
//    println("\nТекущая мана: ${hero.mana}")
//
//    println("\nГерой пытается использовать способности: ")
//    println("Способность: ${hero.ultimate}")
//
//    println("\nПовторный вызов способности (должна быть мгновенной): ")
//    println("Способность: ${hero.ultimate}")
//
//    println("\nМеняем имя героя:")
//    hero.name = "Aragorn"
//
//    println("\nГерой восстанавливает ману:")
//    hero.mana = 200

    //
//    logger.log("Запуск базы")
//}
//object SystemLogger {
//    init {
//        println("SystemLogger инициализирован")
//    }
//    fun log(message: String){
//        println("[LOG] $message")
//    }
//}
//val logger by lazy{
//    SystemLogger
//}
    //
//    val loadedResources = FileStorage.load()
//    loadedResources.forEach { manager.add(it) }
//    if (loadedResources.isEmpty()){
//        manager.add(OutpostResourse(1,"Minerals", 300))
//        manager.add(OutpostResourse(2,"Gas", 100))
//
//    }
//    FileStorage.save(manager.getAll())
}
