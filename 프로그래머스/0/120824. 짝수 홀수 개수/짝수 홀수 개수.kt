class Solution {
    fun solution(num_list: IntArray): IntArray {
       var answer: IntArray = intArrayOf()
        var mutList = mutableListOf<Int>()
        var odd = 0
        var even = 0

        for(i in num_list){
            if(i%2 == 0){
                odd++
            }else{
                even++
            }
        }

        mutList.add(odd)
        mutList.add(even)

        answer = mutList.toIntArray()

        return answer
    }
}