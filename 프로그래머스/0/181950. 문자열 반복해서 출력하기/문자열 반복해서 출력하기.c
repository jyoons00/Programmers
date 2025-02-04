#include <stdio.h>
#define LEN_INPUT 11

int main(void) {
    char str[LEN_INPUT];
    int n;
    scanf("%s %d", str, &n);
    
    if(n >= 1 && n <= 5) {
        for(int i=1; i<=n; i++){
            printf(str);
        } 
    }

    return 0;
}