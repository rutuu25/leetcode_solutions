class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb= new StringBuilder();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty() &&
            ((st.peek() == Character.toLowerCase(ch) && Character.isUpperCase(ch)) ||
            (st.peek() == Character.toUpperCase(ch) && Character.isLowerCase(ch)))){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}