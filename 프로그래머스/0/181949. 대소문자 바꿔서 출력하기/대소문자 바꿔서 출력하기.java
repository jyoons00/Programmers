import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        // 문자열을 char 배열로 변환 (순회를 위해서)
        char [] arr = str.toCharArray();
        
        // 결과 저장용 스트링 빌더(String은 변경 불가능한 문자열이기 때문)
        StringBuilder result = new StringBuilder();
        
        // 배열을 foreach로 순회
        if(str.length() >= 1 && str.length() <= 20) { 
            
            // c는 배열에서 순차적으로 가져온 각 문자
            for(char c : arr) {

                 // 만약 소문자라면?
                if(Character.isLowerCase(c)) {
                    
                    // 대문자로 변환  
                    result.append(Character.toUpperCase(c));
                    
                } // if
                
                // 만약 대문자라면?
                else if(Character.isUpperCase(c)) {

                    // 소문자로 변환  
                    result.append(Character.toLowerCase(c));
                    
                } // else if

            } // for
        
        } // if
        
        // 결과물 출력 (스트링 빌더는 .toString()사용 )
        System.out.println(result.toString());
        
    }
    
}