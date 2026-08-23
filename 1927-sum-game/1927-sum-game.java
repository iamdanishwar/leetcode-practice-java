class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int leftSum = 0, rightSum = 0;
        int leftMarks = 0, rightMarks = 0;

        for (int i = 0; i < n; i++) {
            char ch = num.charAt(i);
            if (i < n / 2) {
                if (ch == '?') leftMarks++;
                else leftSum += (ch - '0');
            } else {
                if (ch == '?') rightMarks++;
                else rightSum += (ch - '0');
            }
        }

        if ((leftMarks + rightMarks) % 2 != 0) {
            return true;
        }
        int diffSum = leftSum - rightSum;
        int diffMarks = rightMarks - leftMarks;

        if (diffSum == (diffMarks / 2) * 9) {
            return false; 
        }

        return true; 
    }
}