class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        //count students who prefers 0 or 1
        int count[] = new int[2];
        for(int student:students){
            count[student]++;
        }

        for(int sand: sandwiches){
            if(count[sand]==0){
                break;
            }
            count[sand]--;
        }
        return count[0]+count[1];
    }
}