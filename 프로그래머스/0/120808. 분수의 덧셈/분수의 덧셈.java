class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int newNumber = (numer1 * denom2) + (numer2 * denom1); // 5
        
        int newDenom = denom1 * denom2; // 4
        
        int gcd = gdc(newNumber, newDenom); 
        
        int[] answer = {newNumber / gcd, newDenom / gcd};
   
        return answer;  
    }
    
    public int gdc(int a, int b) {
        // 유클리드 알고리즘
        // 계산 후의 분자와 분모를 이용해 최대 공약수 계산
        while (b != 0) {  
            int temp = b;   // temp = 4        // temp = 1
            b = a % b;      // b = 5 % 4 = 1   // b = 4 % 1 = 0 (나머지가 0이다.)
            a = temp;       // a = 4           // a = 1 (따라서 최대공약수는 1이다.)
        }
        return a;
    }
}
