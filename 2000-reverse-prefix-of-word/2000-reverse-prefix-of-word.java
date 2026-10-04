class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.indexOf(ch)==-1){
            return word;
        }

        int index= word.indexOf(ch);

        StringBuilder str= new StringBuilder();

        Stack<Character> s= new Stack<>();
        for(int i=0;i<=index;i++){
            s.push(word.charAt(i));
        }

        while(!s.isEmpty()){
            str.append(s.pop());
        }

        for(int i=index+1;i<word.length();i++){
            str.append(word.charAt(i));
        }
        return str.toString();
    }
}