import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        
        // ArrayList는 동적 배열이라 요소를 추가하거나 제거해도 자동으로 크기 조절됨
        
        // 동적 배열인 ArrayList 생성 (조건을 만족하는 문자열을 담을 리스트)
        List<String> result = new ArrayList<>();
        
        // 문자열 배열 순회
        for(String str : strArr) {
        
            // 조건: 문자열에 "ad"가 포함되어 있지 않은 경우만
            if(!str.contains("ad")) {
                
                // 조건을 만족하면 리스트에 추가
                result.add(str);
                
            } // if
            
        } // foreach
        
        // 리스트를 String 배열로 변환하여 반환 (new String[0]으로 타입 명시)
        return result.toArray(new String[0]);
        
    }
    
}