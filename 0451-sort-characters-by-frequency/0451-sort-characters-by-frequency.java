class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        // build max heap based on frequency
        PriorityQueue<Character> pq= new PriorityQueue<>(
            (a,b)-> map.get(b)-map.get(a)
        );

        //add all the characters to heap
        pq.addAll(map.keySet());

        StringBuilder st= new StringBuilder();

        while(!pq.isEmpty()){
            char ch= pq.poll();
            int freq= map.get(ch);
            for(int i=0;i<freq;i++){
                st.append(ch);
            }
        }
        return st.toString();
    }
}