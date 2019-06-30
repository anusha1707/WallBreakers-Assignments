class Solution {
    public int binaryGap(int N) {
        int temp =-1;
        int result =0;
        for(int i=0; i<32; i++)
        {
            if(((N>>i)&1)>0)
            {
                if(temp>=0)
                    //calculating the maximum among old result and the new value
                    result = Math.max(result, i-temp);
                //update temp
                temp=i;
            }
        }
        return result;
    }
}