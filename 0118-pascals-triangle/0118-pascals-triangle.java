class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list= new ArrayList<>();
        for(int row=1;row<=numRows;row++){
            list.add(printRow(row));
        }
        return list;
    }
    public List<Integer> printRow(int row){
        List<Integer> ans=new ArrayList<>();
        int res=1;
        ans.add(1);
        for(int col=1;col<row;col++){
            res=res*(row-col);
            res=res/col;
            ans.add(res);
        }
        return ans;
    }
}