package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

operator fun MyDate.rangeTo(other: MyDate): DateRange {
    return DateRange(this, other)
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return MyIterator(start, endInclusive)
    }

}

class MyIterator(val start: MyDate, val endInclusive: MyDate) : Iterator<MyDate> {
    override fun hasNext(): Boolean {
        return task25(start, endInclusive)
    }

    override fun next(): MyDate {
        return start.nextDay()
    }

}

operator fun DateRange.contains(d: MyDate): Boolean = task25(start, d) && task25(d, endInclusive)

