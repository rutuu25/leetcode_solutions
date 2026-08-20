class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String words[]=s.split(" ");

        if(words.length!=pattern.length()){
            return false;
        }
        HashMap<Character,String> charToWord= new HashMap<>();
        HashMap<String,Character> wordToChar= new HashMap<>();

        for(int i=0;i<words.length;i++){
            char ch=pattern.charAt(i);
            String word=words[i];

            if(charToWord.containsKey(ch)){
                if(!charToWord.get(ch).equals(word)){
                    return false;
                }
            }else if(wordToChar.containsKey(word)){
                if(!wordToChar.get(word).equals(ch)){
                    return false;
                }
            }else{
                charToWord.put(ch,word);
                wordToChar.put(word,ch);
            }
        }
        return true;
    }
}