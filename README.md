# Лабораторная работа №9-10: Продвинутое ООП на Kotlin
## Описание
Лабораторная работа посвящена изучению продвинутых концепций объектно-ориентированного
программирования в Kotlin.
## Структура проекта
Проект содержит примеры реализации продвинутых механизмов ООП, а также пояснения к ключевым
концепциям.
## Как запустить проект
1. Клонируйте репозиторий:
```bash
git clone <https://github.com/xc8pt/Kotlin_Advanced_Lab_9_10_AbdulinRR.git>
```
2. Откройте проект в IntelliJ IDEA.
3. Запустите любой пример через контекстное меню или напрямую из `main`.

## Изученные темы

### 1. Геттеры и сеттеры
В Kotlin геттеры и сеттеры автоматически генерируются для свойств, но могут быть переопределены.

```kotlin
class Person {
    var name: String = ""
        get() = field.uppercase()
        set(value) {
            field = value.trim()
        }
    
    var age: Int = 0
        set(value) {
            if (value >= 0) field = value
        }
} 
```
### 2. Инкапсуляция
Принцип сокрытия внутренней реализации и предоставления безопасного интерфейса.
```kotlin
class BankAccount {
    private var balance: Double = 0.0
    
    fun deposit(amount: Double) {
        if (amount > 0) balance += amount
    }
    
    fun withdraw(amount: Double): Boolean {
        return if (amount <= balance) {
            balance -= amount
            true
        } else {
            false
        }
    }
    
    fun getBalance(): Double = balance
}
```
### 3. Data-классы
Специальные классы для хранения данных с автоматически генерированными методами.
```kotlin
data class Student(
    val id: Int,
    val name: String,
    val grade: Double
)

data class Book(
    val title: String,
    val author: String,
    val year: Int
) {
    fun isOld() = year < 2000
}
```
### 4.Абстрактные классы
Классы, которые не могут быть инстанциированы напрямую.
```kotlin
abstract class Shape {
    abstract fun area(): Double
    abstract fun perimeter(): Double
    
    fun description() = "Это геометрическая фигура"
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double = Math.PI * radius * radius
    override fun perimeter(): Double = 2 * Math.PI * radius
}

class Rectangle(val width: Double, val height: Double) : Shape() {
    override fun area(): Double = width * height
    override fun perimeter(): Double = 2 * (width + height)
}
```
### 5.Интерфейсы
Контракты поведения с возможностью default-реализаций.
```kotlin
// Простой интерфейс
interface Movable {
    val model: String
    var speed: Int
    
    fun move()
    fun stop() {
        println("Остановка...") // default реализация
    }
}
// Класс, реализующий интерфейс
class Car(override val model: String) : Movable {
    override var speed = 60

    override fun move() {
        println("Едем на машине $model со скоростью $speed км/ч")
    }
}

// Множественное наследование интерфейсов
interface Worker {
    fun work()
}

interface Student {
    fun study()
}

class WorkingStudent(val name: String) : Worker, Student {
    override fun work() = println("$name работает")
    override fun study() = println("$name учится")
}

// Конфликт имен методов в интерфейсах
interface VideoPlayable {
    fun play() {
        println("Play video")
    }
}

interface AudioPlayable {
    fun play() {
        println("Play audio")
    }
}

class MediaPlayer : VideoPlayable, AudioPlayable {
    override fun play() {
        println("Start playing")
        super<VideoPlayable>.play()
        super<AudioPlayable>.play()
    }
}

// Функция, принимающая интерфейс
fun travel(obj: Movable) {
    obj.move()
    obj.stop()
}

// Пример использования
fun main() {
    val car = Car("Toyota")
    car.move()

    val student = WorkingStudent("Иван")
    student.work()
    student.study()

    val player = MediaPlayer()
    player.play()

    // Полиморфизм
    travel(car)
}
```
# Galaxy Outpost Manager
Учебный проект на Kotlin, демонстрирующий основы объектно-ориентированного программирования и архитектурные приёмы языка.

## Sealed-классы
**Sealed-классы** используются для представления ограниченного набора состояний или результатов, которыеизвестны на этапе компиляции.
### Они позволяют:
 - гарантировать обработку всех возможных вариантов;
 - безопасно использовать конструкцию when без else;
 - удобно описывать состояния, события и результаты действий. 
### Пример: результат работы модуля
```kotlin
sealed-class ModuleResult {
    data class Success(val message: String) : ModuleResult()
    data class ResourceProduced(val resourceName: String, val amount: Int) : ModuleResult()
    data class NotEnoughResources(
    val resourceName: String, val required: Int, val available: Int
    ) : ModuleResult()
    data class Error(val reason: String) : ModuleResult()
}
```
## Object в Kotlin
**object** — это специальная конструкция Kotlin, которая создаёт единственный экземпляр класса (Singleton).
### Особенности:
 - создаётся при первом обращении;
 - существует в одном экземпляре;
 - не имеет конструктора.
### Пример: глобальный логгер
```kotlin
object Logger {
private var counter = 0
    fun log(message: String) {
    counter++
    println("[$counter] $message")
    }
}
```
### Использование:
 - Logger.log("Инициализация системы")
 - Logger.log("Модуль запущен")
### object удобно использовать для:
 - логгеров;
 - конфигураций;
 - состояний без данных в sealed-классах;
 - утилитарных классов.
---
## Автор
[Абдулин Ринат Рушанович]
## Лицензия
Проект создан в учебных целях.

