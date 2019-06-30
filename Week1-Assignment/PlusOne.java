class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int c = digits[i];
        //Case where there is an extra element due to carry and is the first element
            if (c == 9 && i == 0) {
                digits[i] = 0;
                //define a new array with digits.length + 1 as length
                int[] res = new int[digits.length + 1];
                res[0] = 1;
                // Assign the values to res
                for (int j = 1; j < res.length; j++) {
                    res[j] = digits[j-1];
                }
                return res;
            // Case with carry
            } else if (c == 9) {
                digits[i] = 0;
                
           //Adds one to the element
            } else {
                digits[i]++;
                return digits;
            }
        }
        
        return digits;
    }
}