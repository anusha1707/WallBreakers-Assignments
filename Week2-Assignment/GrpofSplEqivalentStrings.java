class Solution {
    public int numSpecialEquivGroups(String[] A) {
        //define set to store groups
        HashSet<String> set = new HashSet<>();
        //iterate for every string in A
        for(String s : A)
        {
            //define two arrays for even and odd indices
            int[] e = new int[26];
            int[] o = new int[26];
            for(int i=0; i< s.length(); i++)
            {
                //for even indices
                if(i%2==0)
                {
                    e[s.charAt(i)-97]++;
                }
                //for odd indices
                else
                {
                     o[s.charAt(i)-97]++;
                }
            }
            //convert the arrays to strings and concatenate
           String group = Arrays.toString(e) + Arrays.toString(o);
            set.add(group);
        }
        //size of the set is the required number of groups
        return set.size();
    }
}