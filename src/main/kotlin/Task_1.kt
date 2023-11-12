val cities = arrayOf(
    "Москва", "Санкт-Петербург", "Мурманск", "Омск", "Тверь",
    "Тула", "Калининград", "Сочи", "Челябинск", "Екатеринбург",
    "Ростов-на-Дону", "Минск", "Азов", "Хельсинки", "Красноярск"
)

fun main(args: Array<String>) {

    fun create_train(){
        var choice = 1
        while (choice == 1) {
            println("Выберите действие: \n 1 - создать поезд \n 0 - закончить работу")
            choice = readLine()?.toIntOrNull() ?: 0
            if (choice == 1){
                var route1 = Route()
                route1.printRoute()
            } else {
                println("Завершение работы...")
            }
        }
    }
    create_train()
}