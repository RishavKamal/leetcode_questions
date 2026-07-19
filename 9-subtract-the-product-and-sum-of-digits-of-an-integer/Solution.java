class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int multiplication = 1;

        while(n>0){
            int lastDigit = n%10;
            multiplication = lastDigit*multiplication;
            sum =  sum + lastDigit;
            n= n/10;
        }
        
        return multiplication-sum;
    }
}