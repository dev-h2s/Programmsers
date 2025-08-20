#include <string>
using namespace std;

int pCount = 0;
int yCount = 0;
int check(const char *s)
{
    if (*s == '\0') return (pCount == yCount);
    if (*s == 'p' || *s == 'P') pCount++;
    if (*s == 'y' || *s == 'Y') yCount++;
    return check(s + 1);
}

// 프로그래머스에서 요구하는 함수
bool solution(string s)
{
    return check(s.c_str());
}