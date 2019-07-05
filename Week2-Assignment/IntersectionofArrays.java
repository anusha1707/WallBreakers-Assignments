class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     HashSet<Integer> set1 = new HashSet<>();
         HashSet<Integer> set2 = new HashSet<>();
        for(int i=0; i< nums1.length; i++)
            set1.add(nums1[i]);
         for(int i=0; i< nums2.length; i++)
         {
             //only add the elements that are already present in set1
             if(set1.contains(nums2[i]))
             set2.add(nums2[i]);
         }
        // convert set to array
         int[] result = new int[set2.size()];
        int n =0;
        for(Integer num : set2)
        {
            result[n++] = num;
        }
        return result;
    }
}