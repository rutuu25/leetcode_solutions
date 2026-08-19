class Solution {
    public boolean halvesAreAlike(String s) {
        int leftCount=0;
        int rightCount=0;
        int i=0;
        int j= s.length()/2;
        while( j<s.length()){
            if(isVowel(s.charAt(i))){
                leftCount++;
            }
            if(isVowel(s.charAt(j))){
                rightCount++;
            }
            i++;
            j++;
        } 
        return leftCount==rightCount;
    }
    public boolean isVowel(char ch){
        return ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||
               ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch =='U';
    }
}