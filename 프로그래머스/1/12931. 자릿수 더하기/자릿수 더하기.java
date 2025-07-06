import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
 //자바는 while(1)문법이 안됨(int를 bool처럼 사용 불가능)
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