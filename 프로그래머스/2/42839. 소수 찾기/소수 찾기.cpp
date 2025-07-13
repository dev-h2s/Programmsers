#include <string>
#include <vector>
#include <cmath>
#include <algorithm>
#include <set>

using namespace std;



bool isPrime(int n) {
    if (n < 2) return false;
    for (int i = 2; i <= sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}

int solution(string numbers) {
    set<int> primeSet;
    sort(numbers.begin(), numbers.end());

    // 길이 1부터 n까지 모든 순열 조합 시도
    for (int len = 1; len <= numbers.size(); len++) {
        sort(numbers.begin(), numbers.end());
        do {
            string sub = numbers.substr(0, len);
            int num = stoi(sub);
            if (isPrime(num)) {
                primeSet.insert(num);
            }
        } while (next_permutation(numbers.begin(), numbers.end()));
    }

    return primeSet.size();
}