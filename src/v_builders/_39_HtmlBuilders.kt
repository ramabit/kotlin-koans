package v_builders

import util.TODO
import util.doc39
import v_builders.data.getProducts
import v_builders.htmlLibrary.*

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"

fun todoTask39(): Nothing = TODO(
        """
        Task 39.
        1) Fill the table with the proper values from products.
        2) Color the table like a chess board (using getTitleColor() and getCellColor() functions above).
        Pass a color as an argument to functions 'tr', 'td'.
        You can run the 'Html Demo' configuration in IntelliJ to see the rendered table.
    """,
        documentation = doc39()
)

fun renderProductTable(): String {
    return html {
        table {
            tr(getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for (i in 0..products.size - 1) {
                tr {
                    td(getCellColor(1, i)) {
                        text(products.get(i).description)
                    }
                    td(getCellColor(2, i)) {
                        text(products.get(i).price)
                    }
                    td(getCellColor(3, i)) {
                        text(products.get(i).popularity)
                    }
                }
            }
        }
    }.toString()
}
