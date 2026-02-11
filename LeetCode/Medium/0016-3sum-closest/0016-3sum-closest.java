class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int dist = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                int distance = Math.abs(target - sum);

                if (distance < dist) {
                    dist = distance;
                    ans = sum;
                }

                if (sum < target) {
                    start++; 
                } else if (sum > target) {
                    end--;
                } else {
                    return sum; 
                }

            }
        }

        return ans;
    }
}