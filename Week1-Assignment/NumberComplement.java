class Solution {
    public int findComplement(int num) {
         
        int sum = 0;
        int n = 0;

        //sum of two complements is all one's
        while (sum < num)
        {
            sum += Math.pow(2, n);
            n++;
        }
        //to get complement subtract number from the sum
        sum-=num;
        return sum;
    }
}