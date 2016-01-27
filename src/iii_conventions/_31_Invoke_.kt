package iii_conventions

import util.*


class Invokable(){
    var invokations: Int = 0
}

fun todoTask31(): Nothing = TODO(
    """
        Task 31.
        Change class Invokable to count the number of invocations (round brackets).
        Uncomment the commented code - it should return 4.
    """,
    references = { invokable: Invokable -> })

operator fun Invokable.invoke(): Invokable{
    invokations++
    return this
}

fun Invokable.getNumberOfInvocations(): Int {
    return this.invokations
}

fun task31(invokable: Invokable): Int {
    return invokable()()()().getNumberOfInvocations()
}
