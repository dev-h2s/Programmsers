#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    char charArr[12];
    sprintf(charArr, "%d", n);
    int intArr[9];
     if(n >100000000){
         printf("n은 100000000이하의 자연수 입니다.");
     }else{    
         for(int i = 0; i<strlen(charArr); i++){
             answer += charArr[i]-'0';
         }
     }
    
    
    return answer;
}