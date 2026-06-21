import java.util.Arrays;
class Solution {
    public String reverseWords(String s) {
        s = s.strip();
        String fs = "";
        for(int i = 0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i-1)!=' ')
            {
                fs = fs + s.charAt(i);
            }
            else if(s.charAt(i)==' ')
            {

            }
            else{
                fs = fs + s.charAt(i);
            }
        }
        char arr[] = fs.toCharArray();
        int i = 0; int j = arr.length-1;
        while(i<j)
        {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        int start = 0; int end = 0;
        for(int k = 0;k <arr.length;k++)
        {
            if(arr[k]==' ' || k ==arr.length-1)
            {
                if(k ==arr.length-1){
                    end = k;
                }
                else{
                    end = k-1;
                }
                while(start<end)
                {
                    char temp = arr[start];
                    arr[start] = arr[end];
                    arr[end] = temp;
                    start++;
                    end--;
                }
                start = k+1;
            }
        }
        return new String(arr);

      
    }
}