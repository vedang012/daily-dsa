class Solution {
    public int reverse(int x) {
        int revNumber = 0;
        boolean isNeg = false;
        if(x < 0) {
            x = x*-1;
            isNeg = true;
        }
        while(x > 0) {
            int lastdigit = x%10;

            if (revNumber > (Integer.MAX_VALUE - lastdigit) / 10) {
                return 0; // Overflow will occur
            }
            x = x/10;

            revNumber = revNumber*10 + lastdigit;
        }
        if(isNeg) {
            return revNumber*-1;
        } else {
            return revNumber;
        }
    }
}