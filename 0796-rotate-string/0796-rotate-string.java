class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }

        // Add string with itself
        String doubled = s + s;

        return doubled.contains(goal);
    }
}