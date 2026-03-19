class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        // iterate over all odd lengths
        for (int len = 1; len <= n; len += 2) {
            
            // compute sum of first window
            int windowSum = 0;
            for (int i = 0; i < len; i++) {
                windowSum += arr[i];
            }
            totalSum += windowSum;

            // slide the window
            for (int i = len; i < n; i++) {
                windowSum += arr[i] - arr[i - len];
                totalSum += windowSum;
            }
        }

        return totalSum;
    }
}