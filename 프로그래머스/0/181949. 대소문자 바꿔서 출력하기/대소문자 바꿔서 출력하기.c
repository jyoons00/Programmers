#include <stdio.h>
#define LEN_INPUT 21

int main(void) {
    char s1[LEN_INPUT];
    scanf("%s", s1);

    // 배열 순회 (배열의 각 원소에 직접 접근하기 위해 포인터 사용)
    for(char *p = s1; *p != '\0'; *p++) {
        
        if(islower(*p)) {
        
            *p = toupper(*p);
        
        } else if (isupper(*p)) {
            
            *p = tolower(*p);
        }
        
     }  

     // 변환된 문자열 출력
     printf("%s\n", s1);
        
    return 0;
}
