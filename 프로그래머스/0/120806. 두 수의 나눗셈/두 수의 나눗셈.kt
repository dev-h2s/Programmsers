class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Float = (num1.toFloat()/num2)*1000
        return answer.toInt()
    }
}