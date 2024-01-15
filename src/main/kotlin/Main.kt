
fun main() {

    fun computeFee(amount: Double) {   //  Задача 1
        val minTax = 35.0 // минимальная комиссия
        val taxRate = 0.0075 // комиссия в процентах
        val tax = maxOf(amount * taxRate, minTax)  // Выбираем вариант комиссии
        println("Комиссия составит: $tax рублей")
    }


    fun likesName(likes: Int) {  //   Задача 2

        if (likes % 10 == 1 || likes % 100 == 1 || likes != 11) println("Понравилось $likes человеку") else println("Понравилось $likes людям") // Функция определения люди-человеки))
    }

    fun calculateDiscount(sum: Int, regularUser: Boolean): Double {   //  Задача 3
        // sum - сумма покупки regularUser - постоянный покупатель
        var discount = 0.0
        var result = sum.toDouble()  // приводим в дабл
        when {
            sum in 1001..10000 -> discount = 100.0
            sum > 10000 -> discount = sum * 0.05
        }
        result -= discount
        if (regularUser) {
            result *= 0.99
        }
        return result
    }

    println("Цена со скидкой = " + calculateDiscount(100000, true))

    likesName(1411)

    computeFee(10000.0)
}


