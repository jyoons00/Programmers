class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        int l = my_string.length(); // 10
        int l2 = overwrite_string.length(); // 7
        
        // he
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
        
        return answer;
    }
}