class Solution {
    fun solution(numbers: IntArray): Double {
        var total: Int = 0
        
        for (number in numbers) {
            total += number
        }
        
        val answer = total.toDouble() / numbers.size 
        return answer
    }
}