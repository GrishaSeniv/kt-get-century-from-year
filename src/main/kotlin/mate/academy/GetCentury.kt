package mate.academy

fun getCentury(year: Int): Int {
    if (year <= 0) {
        return 0
    }

    val result = year / 100

    if (year % 100 == 0) {
        return result
    }

    return result + 1
}
