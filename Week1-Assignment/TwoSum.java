class Solution {
    public int[] twoSum(int[] nums, int target) {
        //define array with two values 
    int[] result = new int[2];
        //define hashmap to store key-value pair
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) 
    {
        if (map.containsKey(target - nums[i])) 
        {
            result[0] = map.get(target - nums[i]);
            result[1] = i ;
            return result;
        }
        map.put(nums[i], i);
    }
    return result;
}
}