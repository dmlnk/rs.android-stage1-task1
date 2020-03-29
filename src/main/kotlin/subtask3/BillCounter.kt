package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        val arr = bill.take(k) + bill.takeLast(bill.size - k - 1)
        val bill = arr.sum() / 2

        if (bill == b) {
            return "Bon Appetit"
        } else
            return (b - bill).toString()
    }
}
