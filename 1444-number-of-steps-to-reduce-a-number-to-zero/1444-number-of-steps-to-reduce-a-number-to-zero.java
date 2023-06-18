class Solution {
    public int numberOfSteps(int num) {
        return recursion(num, 0);
    }

    public int recursion(int num, int count){
        if(num == 0){
            return count;
        }
    
        if(num % 2 != 0){
            num = num - 1;
            count++;
        }
        else{
            num = num / 2;
            count++;
        }
        return recursion(num, count);
    }
}