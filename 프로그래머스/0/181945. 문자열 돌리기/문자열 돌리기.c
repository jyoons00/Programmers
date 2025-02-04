#include <stdio.h>
#define LEN_INPUT 11

int main(void) {
    char s1[LEN_INPUT];
    scanf("%s", s1);
    
    for(char *p = s1; *p != '\0'; p++) {
        
        printf("%c\n", *p);
        
    }

    return 0;
}
