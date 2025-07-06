import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        //리스트로 처리하여 배열로 옮겨서 해결(자바는 동적 배열안됨)
        List<Integer> answer = new  ArrayList<>();
        answer.add(arr[0]);
        
        for(int i = 1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
            answer.add(arr[i]);
            }
        }
        int[] answerArr = new int[answer.size()];
        for(int i = 0; i<answer.size(); i++){
            answerArr[i] = answer.get(i);
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answerArr;
    }
}