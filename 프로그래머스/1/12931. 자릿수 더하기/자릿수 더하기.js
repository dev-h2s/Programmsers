function solution(n)
{
    var answer = 0;

    while(1){
        answer+= parseInt(n%10);
        parseInt(n/=10);
        if(n<1)
            break;
    }
    
    return answer;
}