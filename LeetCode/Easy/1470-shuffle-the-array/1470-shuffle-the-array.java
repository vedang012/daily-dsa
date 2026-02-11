class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        int start = 0;
        int mid = n;

        for(int i = 0; i < nums.length-1; i += 2) {
            ans[i] = nums[start];
            ans[i+1] = nums[mid];
            start++;
            mid++;
        }

        return ans;
    }
}