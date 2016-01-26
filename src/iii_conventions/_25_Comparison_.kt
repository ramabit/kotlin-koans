package iii_conventions

import iii_conventions.test.s
import util.*

fun todoTask25(): Nothing = TODO(
    """
        Task 25.
        Uncomment the commented line and make it compile. 
        Add all changes to the file MyDate.kt.
        Make class MyDate implement Comparable.
    """,
    documentation = doc25(),
    references = { date: MyDate, comparable: Comparable<MyDate> -> }
)

fun task25(date1: MyDate, date2: MyDate): Boolean {
    var yearly = date1.year < date2.year
    var monthly = date1.year == date2.year && date1.month < date2.month
    var daily = date1.year == date2.year && date1.month == date2.month && date1.dayOfMonth < date2.dayOfMonth
    return yearly || monthly || daily
}

