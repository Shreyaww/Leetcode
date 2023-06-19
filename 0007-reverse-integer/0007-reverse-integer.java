class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        int count = s.length();

        if(x < 0){
            count--;
        }
        
        long temp = 0;
        while(count > 0){
            temp *= 10;
            temp = temp + x%10;
            
            x /= 10;
            count--;
        }
        
        if(temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE){
            return 0;
        }
        return (int)temp;
    }

}