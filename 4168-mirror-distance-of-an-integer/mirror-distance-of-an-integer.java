class Solution {
    public int mirrorDistance(int n) {

        int original = n;   // store original number
        int rem;
        int rev = 0;

        while(n > 0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        return Math.abs(original - rev);
    }
}