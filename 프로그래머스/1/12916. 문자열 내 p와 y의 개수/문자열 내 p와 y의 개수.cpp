#include <string>
using namespace std;

int pCount = 0;
int yCount = 0;

int check(const char *s)
{
    if (*s == '\0') return (pCount == yCount); // 문자열 끝에 도달 시 pCount와 yCount가 같은지 비교
    if (*s == 'p' || *s == 'P') pCount++;     // 현재 문자가 'p' 또는 'P'면 pCount 증가
    if (*s == 'y' || *s == 'Y') yCount++;     // 현재 문자가 'y' 또는 'Y'면 yCount 증가
    return check(s + 1);                      // 포인터를 다음 문자로 이동 후 재귀 호출
}

bool solution(string s)
{
    return check(s.c_str()); // string 객체를 C 스타일 문자열(const char*)로 변환하여 재귀 함수에 전달
}