class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList();
        int[] alpha = new int[26];
        int temp =0, last=0;
        for(int i=0; i<S.length(); i++)
        {
            alpha[S.charAt(i)-97] = i;
        }
        for(int i=0; i<S.length(); i++)
        {
            last = Math.max(last, alpha[S.charAt(i)-97]);
            if(i==last)
            {
                result.add(i-temp+1);
                temp = i+1;
            }
        }
        return result;
    }
}