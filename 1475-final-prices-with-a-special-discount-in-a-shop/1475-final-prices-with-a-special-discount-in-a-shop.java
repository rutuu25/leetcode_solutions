class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() > prices[i]) {
                stack.pop();
            }

            // If stack is not empty, top is the discount
            if (!stack.isEmpty()) {
                answer[i] = prices[i] - stack.peek();
            } else {
                answer[i] = prices[i];
            }

            stack.push(prices[i]);
        }

        return answer;
    }
}
    
