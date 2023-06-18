class Solution {
    public int addDigits(int num) {
        
        return recursion(num);
    }

    public int recursion(int num){
        if(num < 10){
            return num;
        }

        int rem = 0;
        int sum = 0;
        int temp = num;

        while(temp > 0){
            rem = temp%10;
            sum += rem;
            temp /= 10;
        }

        return recursion(sum);
    }
}