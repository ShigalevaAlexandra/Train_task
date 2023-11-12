class Train(val passangers: Int) {
    var vagons = arrayOf<Int>() //пустой массив интегеров (тут будет число вместительности)
    var capacity = 0

    fun vagon(){
        while (capacity <= passangers) {
            var vagon = (Math.random() * 21).toInt()+5  //сколько людей туда поместятся
            capacity += vagon
            vagons = vagons.plus(vagon)
        }
    }
}