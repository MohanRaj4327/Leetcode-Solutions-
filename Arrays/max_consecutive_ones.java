class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int newmax = 0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                newmax++;
                
            }

            else{
                if(newmax > max)
                {
                    max=newmax;
                    newmax=0;
                }
                
            }
            max=0;

        }
        return newmax;
    }
}