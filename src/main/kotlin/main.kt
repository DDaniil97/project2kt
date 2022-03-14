fun main() {
    var amount = 7595625
    val amountRub  = amount / 100.0
    println("Сумма перевода : $amount копеек ($amountRub рублей) (комиссия за перевод - 0,75%, минимум 35 рублей (3500 копеек))")
    val proc = 0.0075
    var commission = amount * proc
    if (commission < 3500) commission = 3500.0
    val commissionRub = commission / 100.0
    println("Ваша комиссия составит: $commission копеек ($commissionRub рублей)")
}