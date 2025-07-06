function solution(n)
{
    var answer = 0;
//JS는 parint하지않으면 실수형 나눗셈해버림
    while(1){
        answer+= parseInt(n%10);
        parseInt(n/=10);
        if(n<1)
            break;
    }
    
    return answer;
}