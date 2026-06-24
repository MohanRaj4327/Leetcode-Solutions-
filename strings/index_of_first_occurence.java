class Solution {
    public int strStr(String haystack, String needle) {
        char arr[] = haystack.toCharArray();
        int dummy = 0;
        if(!haystack.contains(needle))
        {
            return -1;
        }
        int index = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]==needle.charAt(0))
            {
                int temp = i;
                for(int j = 0;j<needle.length();j++)
                {
                    
                    if(arr[i]==needle.charAt(j)){
                        i++;
                        dummy = 1;

                    }
                    else{
                        dummy = 0;
                        break;
                    }

                }
                if(dummy==1)
                {
                    if(temp<index)
                    {
                        index = temp;
                    }
                }


            }
        }
        return index;
        
    }
}