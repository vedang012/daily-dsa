class Solution {
    public void sortColors(int[] nums) {
        int[] count = new int[3];

        for (int num : nums) {
            if (num == 0) {
                count[0]++;
            } else if (num == 1) {
                count[1]++;
            } else {
                count[2]++;
            }
        }

        for(int i : count){
            System.out.println(i);
        }

        int c = 1;
        for (int i = 0; i < nums.length; i++) {
            if (c <= count[0]) {
                nums[i] = 0;
            } else if (c > count[0] && c <= count[0] + count[1]) {
                nums[i] = 1;
            } else if (c > count[0] + count[1]){
                nums[i] = 2;
            } 

            c++;

        }
    }
}