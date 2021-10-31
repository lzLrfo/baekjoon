class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray();
        int index = 0;
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] != ' ') {
                if(index % 2 == 1)
                    answer += Character.toLowerCase(ch[i]);
                else
                    answer += Character.toUpperCase(ch[i]);
                index++;
            }
            else {
                answer += " ";
                index = 0;
            }
        }
        return answer;
    }
}
