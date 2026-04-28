class Solution {
    public int minOperations(int[][] grid, int x) {
        int row = grid.length;
        int col = grid[0].length;

        int size = row * col;
        int arr[] =  new int[size];
        int k = 0; 

        for(int[] i :grid){
            for(int val: i){
                arr[k++] = val;
            }
        }

        int rem = arr[0] % x;
        
        for(int val: arr){
            if(val% x != rem){
                return -1;
            }
        }

        int counts = 0;
        Arrays.sort(arr);
        int median = arr[size/2];
        for(int val:arr){
            counts+=Math.abs((val-median)/x);
        }
        return counts;
    }
}