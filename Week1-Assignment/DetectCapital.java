class Solution {
    public boolean detectCapitalUse(String word) {
        char[] c = word.toCharArray();
        boolean first = false, second = false;
        for(int i = 0; i < c.length; i++)
        {
            //check if first letter is capital 
            if(i == 0)
            {
                if(Character.isUpperCase(c[i]))
                {
                    first = true;
                }
            }
            //check if second letter is capital
            else if(i==1)
            {
                if(Character.isUpperCase(c[i]))
                {
                    second = true;
                }
                // case when first letter is lowercase and if any other letter is uppercase 
                if(!first)
                {
					if(Character.isUpperCase(c[i]))
					{
						return false;
					}   
                }
            }
            else
            {
                //when both first and second letters are true 
                if(first && second)
                {
                    //return false when any letter is lowercase 
                    if(!Character.isUpperCase(c[i]))
                        return false;
                }
                //if first is true and second is not capital then others shouldn't be capital
                // if both are not capital then also others should be lowercase
                else if((first && !second) || (!first && !second))
                {
                    if(Character.isUpperCase(c[i]))
                        return false;
                }
            }
        }
        return true;
    }
}