class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder s = new StringBuilder();
        int count = 0;

        // Step 1: make s length >= b length
        while (s.length() < b.length()) {
            s.append(a);
            count++;
        }

        // Step 2: check
        if (s.indexOf(b) != -1) {
            return count;
        }

        // Step 3: try one more repetition (boundary case)
        s.append(a);
        count++;

        if (s.indexOf(b) != -1) {
            return count;
        }

        return -1;
    }
}