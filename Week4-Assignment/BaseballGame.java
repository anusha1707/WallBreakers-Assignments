class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack();
        int sum =0;
        for(String s : ops)
        {
            if(s.equals("+"))
            {
                int top = stack.pop();
                int score = top + stack.peek();
                stack.push(top);
                stack.push(score);
            }
            else if(s.equals("D"))
            {
                stack.push(2*stack.peek());
            }
            else if(s.equals("C"))
            {
                stack.pop();
            }
            else
            {
                stack.push(Integer.valueOf(s));
            }
        }
        for(int i : stack)
        {
            sum = sum + i;
        }
        return sum;
    }
}