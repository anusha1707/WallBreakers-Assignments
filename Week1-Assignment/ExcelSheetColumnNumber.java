class Solution
{	
	public int titleToNumber(String s)
	{
		int num = 0;
		//iterate for every character after converting the string to char array
		for(char c : s.toCharArray())
		{
        //ASCII value of A is subtracted first and 1 is added as given A value starts with 1
			num = num * 26 + (c - 'A' + 1);
		}
		return num;
	}
}