class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s= new Stack<>();
        for(String ch : tokens){
            if( ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                int b= s.pop();
                int a= s.pop();
                int result=0;
                if(ch.equals("+")){
                    result=a+b;
                }
                else if(ch.equals("-")){
                    result=a-b;
                }
                else if(ch.equals("*")){
                    result=a*b;
                }
                else{
                    result=a/b;
                }
                s.push(result);
            }else{
                s.push(Integer.parseInt(ch));
            }
        }
        return s.pop();
    }
}