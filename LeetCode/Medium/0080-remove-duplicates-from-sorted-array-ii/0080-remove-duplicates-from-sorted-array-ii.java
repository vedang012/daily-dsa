class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int last = nums[0];
        boolean onlyOne = true;
        while (j < nums.length ) {

            if(nums[j] == last && onlyOne) {
                nums[i+1] = nums[j];
                onlyOne = false;
                i++;     
            }

            if(nums[j] != nums[j-1]){
                nums[i+1] = nums[j];
                onlyOne = true;
                i++;
            } 
            last = nums[i];
            j++;
        }

        return i+1;

    }
}