import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        // Fix 1 & 2: Use Character keys and change 'H' to 'M'
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000); 
        
        int sum = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            int currentVal = map.get(s.charAt(i));
            
            // Fix 3: If a smaller value is before a larger value, subtract it
            if (i < n - 1 && currentVal < map.get(s.charAt(i + 1))) {
                sum -= currentVal;
            } else {
                sum += currentVal;
            }
        }
        
        return sum;
    }
}
