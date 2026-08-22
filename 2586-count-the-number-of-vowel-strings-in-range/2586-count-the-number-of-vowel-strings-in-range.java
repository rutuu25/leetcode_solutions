class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
  
        for (int i = left; i <= right; i++) {
            String word = words[i];

            if (isVowel(word.charAt(0)) &&
                isVowel(word.charAt(word.length() - 1))) {
                count++;
            }
        }

        return count;
    }
    boolean isVowel(char ch){
        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}