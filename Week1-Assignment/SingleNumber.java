class Solution {
    public int singleNumber(int[] nums) {
       int result =0;
        //used XOR as it's 0 when occurs multiple times
        for(int i=0; i<nums.length; i++)
        {
            result = result^nums[i];
        }
        return result;
    }
}