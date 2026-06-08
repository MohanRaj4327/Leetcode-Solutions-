class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int temp=x;
        if(x<0)
        {
            return false;

        }
        else{
            while(x!=0)
            {
                int lastdigit=x%10;
                rev=rev*10+lastdigit;
                x=x/10;
               
            }
            
        }
        if(temp==rev)
        {
            return true;
        }
        else {
            return false;
        }
        
    }
}