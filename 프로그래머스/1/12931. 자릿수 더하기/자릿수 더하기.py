def solution(n):
    answer = 0
# 파이썬은 들여쓰기 잘 하기
    # [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    print('Hello Python')
    while n > 0:
        answer += n % 10
        n //= 10  # 정수 나눗셈

    return answer