def solution(num1, num2):
    answer = -1
    max = 50000
    min = -50000
    if (num1>=-50000 or num1<=50000) and (num2>=-50000 or num2<=50000) :
        answer = num1+num2
    return answer