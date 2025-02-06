class Solution {
    public int[] solution(int[] array) {
        
        int max = array[0];  
        int maxIndex = 0;    
        
        for(int i = 1; i < array.length; i++) {
            if(array[i] > max) {
                // 최대값 갱신
                max = array[i];  
                // 인덱스 갱신
                maxIndex = i;
            }
        }
        
        int result [] = {max, maxIndex};
        return result;
        
    }
    
}
