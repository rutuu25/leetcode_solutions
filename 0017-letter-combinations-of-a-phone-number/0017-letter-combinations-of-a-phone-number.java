class Solution {
    public List<String> letterCombinations(String digits) {
       ArrayList<String> result= new ArrayList<>();
       if(digits==null || digits.length()==0){
         return result;
       }
       String mapping[]={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

       solve("",digits,result,mapping);
       return result;
    }
    static void solve(String p,String digits,ArrayList<String> result,String[] mapping){
        if(digits.isEmpty()){
            result.add(p);
            return ;
        }

        int digit= digits.charAt(0) -'0';
        String letters= mapping[digit];

        for(int i=0;i<letters.length();i++){
            solve(p+letters.charAt(i),digits.substring(1),result,mapping);
        }
    }
}