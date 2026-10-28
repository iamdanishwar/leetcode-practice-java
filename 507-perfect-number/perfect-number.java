class Solution {
    public boolean checkPerfectNumber(int num) {

        int m = 0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                m += i;
            }
        }
        if(m == num){
            return true;
        }

        return false;
    }
}