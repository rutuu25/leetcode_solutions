class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list= new ArrayList<>();
        long ans =1;
        list.add(1);
        for(int i=0;i<rowIndex;i++){
            ans*=(long)(rowIndex-i);
            ans/=(i+1);
            list.add((int)ans);
        }
        return list;
    }
}