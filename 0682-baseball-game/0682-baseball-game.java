class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
       
        for(String str:operations){
            if(str.equals("C")){
                s.pop();
            }else if(str.equals("D")){
                s.push(2 * s.peek());
            }else if(str.equals("+")){
                int last= s.pop();
                int second= s.peek();
                s.push(last);
                s.push(last+second);
            }else{
                s.push(Integer.parseInt(str));
            }
        }
        int sum=0;
        for(int score:s){
            sum+=score;
        }
        return sum;
    }
}