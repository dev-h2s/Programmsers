class Solution {
    fun solution(angle: Int): Int {
        return if (angle == 180) {
            4 // 평각
        } else if (angle == 90) {
            2 // 직각
        } else if (angle < 90) {
            1 // 예각
        } else {
            3 // 둔각
        }
    }
}