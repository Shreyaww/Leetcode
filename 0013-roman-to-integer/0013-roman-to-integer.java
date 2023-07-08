class Solution {
    public int romanToInt(String s) {
        char[] str = s.toCharArray();
        int num = 0;

        for(int i =0; i < str.length; i++){
            if(i < (str.length-1) && str[i] == 'I' && str[i+1] == 'V'){
                num+=4;
                i+=1;
            }
            else if(i < (str.length-1) && str[i] == 'I' && str[i+1] == 'X'){
                num+=9;
                i+=1;
            }
            else if(i < (str.length-1) && str[i] == 'X' && str[i+1] == 'L'){
                num+=40;
                i+=1;
            }
            else if(i < (str.length-1) && str[i] == 'X' && str[i+1] == 'C'){
                num+=90;
                i+=1;
            }
            else if(i < (str.length-1) && str[i] == 'C' && str[i+1] == 'D'){
                num+=400;
                i+=1;
            }
            else if(i < (str.length-1) && str[i] == 'C' && str[i+1] == 'M'){
                num+=900;
                i+=1;
            }
            else if(str[i] == 'I'){
                num+=1;
            }
            else if(str[i] == 'V'){
                num+=5;
            }
            else if(str[i] == 'X'){
                num+=10;
            }
            else if(str[i] == 'L'){
                num+=50;
            }
            else if(str[i] == 'C'){
                num+=100;
            }
            else if(str[i] == 'D'){
                num+=500;
            }
            else if(str[i] == 'M'){
                num+=1000;
            }
            
        }
        return num;
    }
}