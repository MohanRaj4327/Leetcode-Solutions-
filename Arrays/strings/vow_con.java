import java.util.Scanner;

public class vow_con {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] freq = new int[26];

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        int maxvowel = 0;
        int maxcons = 0;

        for(int i = 0; i < 26; i++) {

            char ch = (char)('a' + i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                maxvowel = Math.max(maxvowel, freq[i]);
            }
            else {
                maxcons = Math.max(maxcons, freq[i]);
            }
        }

        System.out.println(maxvowel + maxcons);

        sc.close();
    }
}