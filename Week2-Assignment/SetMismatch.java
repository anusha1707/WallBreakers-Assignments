class Solution {
    public int[] findErrorNums(int[] nums) {
        //define array with 2 elents
      int[] result = new int[2];
        //iterate 1 through length of nums
        for(int i=1; i<=nums.length; i++)
        {
            //initialise count variable
           int count =0;
            //iterate for length of nums
            for(int j=0; j<nums.length; j++)
            {
                //count the occurance of each element
                if(nums[j]==i)
                {
                    count++;
                }
            }
            //duplicate occurs twice
             if (count == 2)
                result[0]= i;
            //for missing element count = 0
            else if (count == 0)
                result[1] = i;
        }
        return result;
    }
}