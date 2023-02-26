fun main() {
    var overpay_hours_25 = 0
    var overpay_hours_50 = 0
    var friday_hours_25 = 0
    var friday_hours_50 = 0
    var work_days = 20
    var month_standart_hours = 168
    println("Расчет ведется по минимальному рабочему месяцу равному 20 дням \nи 168 рабочим часам.")
    println()
    println("Введите желаемую по часовую оплату.")
    var hour_pay = readln()!!.toFloat()
    println("Сколько дополнительных часов хотите работать в сутки ?")
    var overpay_hours = readln()!!.toFloat()
    println(overpay_hours)
    if (overpay_hours >0 && overpay_hours <= 2) {
        var overpay_hours_25 = overpay_hours
    }
    if (overpay_hours > 2){
        var overpay_hours_25 = 2
        var overpay_hours_50 = overpay_hours - overpay_hours_25
    }
    println("Сколько часов хотите работать в пятницу?")
    var friday_hours = readln()!!.toFloat()
    if (friday_hours > 0 && friday_hours <= 2){
        var friday_hours_25 = friday_hours
    }
    if (friday_hours > 2){
        var friday_hours_25 = 2
        var friday_hours_50 = friday_hours - friday_hours_25
    }
    println("Сколько пятниц хотите работать в месяц?")
    var howmuch_fridays = readln()!!.toFloat()
    var total_month_pay = (hour_pay*month_standart_hours)+(hour_pay*work_days*overpay_hours_25*1.25)+(hour_pay*work_days*overpay_hours_50*1.5) +(hour_pay*friday_hours_25*1.25*howmuch_fridays)+(hour_pay*friday_hours_50*1.5*howmuch_fridays)
    var overpay_hours_25_in_month = overpay_hours_25*work_days
    var overpay_hours_50_in_month = overpay_hours_50*work_days
    println("Месячная зарплата брутто: "+ total_month_pay)
    println(" Всего рабочих часов в месяц: "+ (month_standart_hours+ overpay_hours_25_in_month+overpay_hours_50_in_month))
    println()
    println("Колличество обычных часов за месяц: " + month_standart_hours)
    println("Оплата стандартных часов: " + hour_pay*month_standart_hours)
    println()
    println("Дополнительных часов по 125% оплаты: " + work_days*overpay_hours_25)
    println("Оплата дополнительных часов по 125% : "+ hour_pay*work_days*overpay_hours_25*1.25)
    println()
    println("Колличество часов по 150% оплате: " + work_days*overpay_hours_50)
    println("Оплата дополнительных часов по 150% :" + hour_pay*work_days*overpay_hours_50*1.5)
    println()
    println("Пятничных часов: " + friday_hours*howmuch_fridays)
    println("Оплата пятничных часов: " + (hour_pay*friday_hours_25*1.25*howmuch_fridays)+(hour_pay*friday_hours_50*1.5*howmuch_fridays) )




}