class Solution {
    public int minimumDistance(int[] nums) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        // store indices
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        int ans = Integer.MAX_VALUE;

        // check every number
        for (List<Integer> list : map.values()) {

            if (list.size() < 3) continue;

            for (int i = 0; i + 2 < list.size(); i++) {

                int a = list.get(i);
                int c = list.get(i + 2);

                int distance = 2 * (c - a);

                ans = Math.min(ans, distance);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}