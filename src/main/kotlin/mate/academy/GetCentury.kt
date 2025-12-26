package mate.academy

private const val YEARS_IN_CENTURY = 100

fun getCentury(year: Int): Int {
    val result = year / YEARS_IN_CENTURY

    return if (year % YEARS_IN_CENTURY == 0) {
        result
    } else {
        result + 1
    }
}

