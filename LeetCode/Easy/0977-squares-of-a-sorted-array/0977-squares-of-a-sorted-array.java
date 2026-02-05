class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;
        int i = nums.length - 1;

        while (start <= end) {
            int startsq = nums[start] * nums[start];
            int endsq = nums[end] * nums[end];

            if(startsq > endsq) {
                ans[i] = startsq;
                start++;
            } else {
                ans[i] = endsq;
                end--;
            }
            i--;

        }

        return ans;
    }
}