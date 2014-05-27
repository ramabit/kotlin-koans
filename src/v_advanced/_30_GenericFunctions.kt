package v_advanced.generics

import java.util.ArrayList
import java.util.HashSet
import util.TODO

fun task29() = TODO(
    """
        Task29.
        Add function 'partitionTo' that splits collection in two collections according to a predicate.
        Uncomment the commented invocations of 'partitionTo' below and make them compile.

        There is the function 'partition()' in the standard library that always returns two lists (newly created).
        You shall write a function that split the collection in two given collections as arguments.
        The signature of the function 'toCollection()' from standard library may help you.
    """,
        references = { (l: List<Int>) ->
            l.partition { it > 0 }
            l.toCollection(HashSet<Int>())
        }
)

fun List<String>.partitionWordsAndLines(): Pair<List<String>, List<String>> {
    task29()
//    return partitionTo(ArrayList<String>(), ArrayList()) { s -> !s.contains(" ") }
}

fun Set<Char>.partitionLettersAndOtherSymbols(): Pair<Set<Char>, Set<Char>> {
    task29()
//    return partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z'}
}