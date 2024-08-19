function solution(num1, num2) {
    var answer = -1;
    var max =50000;
    var min = -50000;
    if(num1<=50000 || num1>=-5000&&num2<=50000 || num2>=-5000){
        answer = num1+num2;
    }
    return answer;
}