class Solution {
    public boolean checkDivisibility(int n) {

        int realN = n;
        int sum = 0;
        int prod = 1;
        int finalSum = 0;

        while(n > 0){
            sum += n % 10;
            n = n / 10;
        }
        n = realN;
        while(n > 0){
            prod *= n % 10;
            n = n / 10;
        }
        if(n == 0){
            finalSum = 0;
        }
        n = realN;
        finalSum = prod + sum;
        if(n % finalSum == 0){
            return true;
        }
        else{
            return false;
        }


        
    }
}