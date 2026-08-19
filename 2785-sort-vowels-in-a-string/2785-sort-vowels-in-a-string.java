class Solution {
    public String sortVowels(String s) {
       
        ArrayList<Character> vowels = new ArrayList<>();

        // Collect vowels
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                vowels.add(ch);
            }
        }

        // Sort vowels
        Collections.sort(vowels);

        // Put sorted vowels back
        StringBuilder sb = new StringBuilder();
        int i = 0;

        for (char ch : s.toCharArray()) {

            if (isVowel(ch)) {
                sb.append(vowels.get(i));
                i++;
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public boolean isVowel(char ch) {

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}