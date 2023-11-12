class Route() {
    fun city(otherCity: String): String{
        var num = (Math.random() * 15).toInt() //рандом число от 0 до 14
        var city = cities[num]

        //если города одинаковые, он сгенерирует новый город
        while (city == otherCity){
            num = (Math.random() * 15).toInt()+1
            city = cities[num]
        }
        return city
    }

    val cityA = this.city("")
    var cityB = this.city(cityA)
    var passangers = (Math.random() * 197).toInt() + 5
    var train = Train(passangers)

    init {
        train.vagon()
    }

    fun vagon_amount(): String {
        var result = ""
        for (i in 0 until train.vagons.size) {
            result = result + "\n вагон ${i} вместимостью ${train.vagons[i]} человек \n"
        }
        println(result)
        return result
    }

    fun printRoute(): String {
        var result = "\n Маршрут: \n ${cityA} - ${cityB} \n Кол-во вагонов: \n ${train.vagons.size} \n Кол-во купленных билетов: \n ${passangers}"
        println(result)
        vagon_amount()
        return result
    }
}