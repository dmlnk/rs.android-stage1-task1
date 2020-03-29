package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var happyArr = sadArray.toMutableList()
        var isHappy: Boolean

        do {
            isHappy = false

            for (i in 1 until happyArr.size - 1) {
                if (happyArr[i - 1] + happyArr[i + 1] < happyArr[i]) {
                    happyArr.removeAt(i)
                    isHappy = true

                    break
                }
            }
        } while (isHappy)

        return happyArr.toIntArray()
    }
}
