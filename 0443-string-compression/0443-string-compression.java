class Solution {
    public int compress(char[] chars) {
       int index = 0; // write pointer

        for (int i = 0; i < chars.length; i++) {
            Integer count = 1;

            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            // write character
            chars[index++] = chars[i];

            // write count if > 1
            if (count > 1) {
                String countStr = count.toString();
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;
    }
}