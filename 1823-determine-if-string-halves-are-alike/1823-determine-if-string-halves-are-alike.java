class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String s1 = "";
        String s2 = "";

        for(int i = 0; i < s.length(); i++){
            if(i < s.length()/2)
                s1 += s.charAt(i);
            else    
                s2 += s.charAt(i);
        }

        int countA = 0, countB = 0;

        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u'){
                countA++;
            }
        }

        for(int i = 0; i < s2.length(); i++){
            if(s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u'){
                countB++;
            }
        }

        if(countA == countB){
            return true;
        }
        return false;
    }
}