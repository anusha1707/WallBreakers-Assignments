class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f=0, t=0, w=0;
        if(bills[0]!=5)
            return false;
        else
        {
            f++;
                for(int i=1; i<bills.length; i++)
                {
                    if(bills[i]==5)
                        f++;
                    else if(bills[i]==10)
                    {
                        if(f==0)
                            return false;
                        else
                        {
                            f--;
                            t++;
                        }
                    }
                    else if(bills[i]==20)
                    {
                       if(t==0)
                       {
                           if(f>=3)
                           {
                               f=f-3;
                               w++;
                           }
                           else if(f==0)
                            return false;
                           else if(f!=0 && f<3)
                               return false;
                       }
                        else
                        {
                            if(f>0)
                            {
                                t--;
                                f--;
                            }
                            else
                                return false;
                        }
                    }
                }
        }
      return true; 
    }
}