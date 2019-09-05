class Solution {
    public void rotate(int[] nums, int k) {
       Queue<Integer> q = new LinkedList<>();
        for(int i = nums.length-1; i>=0; i--)
        {
            q.add(nums[i]);
        }
       while(k>0)
       {
           int i = q.peek();
           q.remove();
           q.add(i);
           k--;
       }
        for(int i=nums.length-1; i>=0; i--)
        {
            nums[i] = q.poll();
        }
    }
}