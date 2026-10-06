class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list= new ArrayList<>();
        for(int num=left; num<=right;num++){
            int temp=num;
            boolean selfdividing=true;
            while(temp>0){
                int digit=temp%10;
                if(digit==0 || num%digit!=0){
                    selfdividing=false;
                    break;
                }
                temp/=10;
            }
            if(selfdividing){
                list.add(num);
            }
        }
        return list;
    }
}