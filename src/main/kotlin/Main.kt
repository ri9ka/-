fun main(args: Array<String>) {

    //задание1

    val age1 =  42.0       //ктр+шифт+Р
    val age2 = 21.0

    //зд 2

    val avg1 = (age1+age2)/2  /*правильный отв 31.5, тут выходит 31*/

    //задание3

    /* необходимо преобразовать age1 и age2 в double*/

    //задание4

    val firstName = "Рина"
    val lastName = "Схапцежук"

    //задание5

    val fullName = "$firstName $lastName"  /*firstName + " " + lastName
                                              альтернативный способ */

    //задание6

    val myDetails = "привет! меня зовут $firstName $lastName)"

    //задание7

    val Triple: Triple < Int, Int, Int > = Triple (9, 9, 2023)
    /*прикола тут не поняла....*/

    //задание8

     val month = Triple.first
    val day = Triple.second
    val year = Triple.third

    //задание9

    /* val result = "$month $year"
    print(result)                    nen jlyf rjycnfynf  */

    val mounthResult = "$month"
    val yearResult = "$year"
    println("$mounthResult месяц, $yearResult год")

    //задание 10

    val date = Triple(1, 17, 2005)
    var (month1, _, year1) = date

    month1 = 10
    val updatedDate = Pair(month1, year1)
    println("дата(мм.гггг): $updatedDate")

}