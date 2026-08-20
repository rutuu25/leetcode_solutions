class Solution {
    public String removeDuplicates(String s) {
        if(s.isEmpty() || s.length()==0){
            return s;
        }
       Stack<Character> st=new Stack<>();
       StringBuilder ans=new StringBuilder();
       for(char ch:s.toCharArray()){
            if(!st.isEmpty() && st.peek()==ch){
                st.pop();
            }else{
                st.push(ch);
            }
       } 
       while(!st.isEmpty()){
            ans.append(st.pop());
       }
       return ans.reverse().toString();
    }
}