class Solution {
    public void reverseString(char[] s) {

        
        int n = s.length;
        int j = n-1;
        char temp = 'X';

        for(int i = 0; i < n; i++){
            if(i >= j){
                break;
            }
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;

        }

        
    }
}