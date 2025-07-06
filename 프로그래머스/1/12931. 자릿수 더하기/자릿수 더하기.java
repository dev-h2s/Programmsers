import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        for(int i = 0; i<10; i++){
            answer+= n%10;
            n/=10;
        }
        System.out.println("Hello Java")
;
    
        return answer;
    }
}