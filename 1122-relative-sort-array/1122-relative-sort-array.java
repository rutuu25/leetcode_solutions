class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num: arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int index=0;
        for(int num:arr2){
            int count=map.get(num);
            while(count>0){
                arr1[index]=num;
                count--;
                index++;
            }
            map.remove(num);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int num:map.keySet()){
            int count=map.get(num);
            while(count>0){
                ans.add(num);
                count--;
            }
        }
        Collections.sort(ans);

        for(int num:ans){
            arr1[index]=num;
            index++;
        }
        return arr1;
    }
}