class Solution{
public int[] plusOne(int[] digits) {
    // Single loop traveling from right to left
    for (int i = digits.length - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;      // Add 1 to the current digit
            return digits;    // No carry remains, return immediately!
        }
        digits[i] = 0;        // 9 becomes 0, and the loop carries over to the next index
    }
    
    // If the loop finishes, the number was all 9s (e.g., 999 -> 1000)
    int[] newDigits = new int[digits.length + 1];
    newDigits[0] = 1;         // Set the first digit to 1, others default to 0
    return newDigits;
}
}