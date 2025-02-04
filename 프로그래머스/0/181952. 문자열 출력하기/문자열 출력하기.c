#include <stdio.h>
#define MAX_LENGTH 1000001 // 문자열의 길이에 대한 조건을 반영

int main() {
    char str[MAX_LENGTH];
    
    scanf("%s", str); 
    // 배열이므로 주소 연산자 & 안씀 
    // (배열 자체가 첫 번째 주소의 주소를 가리 키기 때문이다.)
    
    printf("%s", str);

    return 0;
}
