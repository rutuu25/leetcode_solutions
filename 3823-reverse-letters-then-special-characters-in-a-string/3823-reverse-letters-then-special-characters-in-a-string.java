class Solution {
    public String reverseByType(String s) {
        ArrayList<Character> letters= new ArrayList<>();
        ArrayList<Character> special =new ArrayList<>();

        for(char ch : s.toCharArray()){
            if(Character.isLowerCase(ch)){
                letters.add(ch);
            }
            else{
                special.add(ch);
            }
        }

        Collections.reverse(letters);
        Collections.reverse(special);

        StringBuilder result= new StringBuilder();

        int l=0,s1=0;
        for(char ch: s.toCharArray()){
            if(Character.isLowerCase(ch)){
                result.append(letters.get(l++));
            }
            else{
                result.append(special.get(s1++));
            }
        }
        return new String(result);
    }
}