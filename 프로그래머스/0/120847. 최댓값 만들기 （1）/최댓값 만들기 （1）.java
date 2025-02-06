import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        
        // 오름차순 정렬
        Arrays.sort(numbers);
        
        int max = numbers[numbers.length - 1] * numbers[numbers.length - 2];
       
        return max;    
        
    }
    
}