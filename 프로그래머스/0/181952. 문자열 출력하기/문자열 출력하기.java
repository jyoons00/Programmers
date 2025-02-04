import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        
        str = sc.nextLine();
        
        if(str.length() >= 1 && str.length() <= 1000000) {
          System.out.println(str);
        } else {
          System.out.println("입력 조건을 만족하지 않습니다.");
        }
            
        sc.close();
        
    }
    
}