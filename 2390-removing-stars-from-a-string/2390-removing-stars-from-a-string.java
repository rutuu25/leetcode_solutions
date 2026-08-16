class Solution {
    public String removeStars(String s) {
       Stack<Character> st = new Stack<>();
       StringBuilder str= new StringBuilder();
       for(char ch: s.toCharArray()){
            if(!st.isEmpty() && ch=='*'){
                st.pop();
            }else{
                st.push(ch);
            }
       }
       while(!st.isEmpty()){
            str.append(st.pop());
       }
       return str.reverse().toString(); 
    }
}