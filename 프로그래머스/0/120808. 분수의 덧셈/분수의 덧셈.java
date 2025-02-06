class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {

        int newNumber = (numer1 * denom2) + (numer2 * denom1);
        
        int newDenom = denom1 * denom2;
        
        int gcd = gdc(newNumber, newDenom); 
        
        int[] answer = {newNumber / gcd, newDenom / gcd};
   
        return answer;  
    }
    
    public int gdc(int a, int b) {
        // 유클리드 알고리즘 = 
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;  // 최대공약수 반환
    }
}
