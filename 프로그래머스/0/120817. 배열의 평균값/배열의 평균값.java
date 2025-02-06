class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        // 배열의 모든 값을 더하기
        for(int arr : numbers) {
            answer += arr; 
        }
        
        // numbers.length: 배열의 길이 = 원소의 개수
        // 문자열에서 사용하는 length()랑 헷갈리지 말 것
        return answer / numbers.length;
    }
    
}