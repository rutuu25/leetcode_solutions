class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> map = new HashMap<>();
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z ]", " ");

        String[] str= paragraph.trim().split("\\s+");

        HashSet<String> set= new HashSet<>();
        for(String word: banned){
            set.add(word);
        }

        for(String word: str){
            if(!set.contains(word)){
                map.put(word, map.getOrDefault(word,0)+1);
            }
        }

        String ans="";
        int max=0;
        for(String key: map.keySet()){
            if(map.get(key)>max){
                max= map.get(key);
                ans= key;
            }
        }
        return ans;
    }
}