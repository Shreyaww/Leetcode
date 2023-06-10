class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        String s1 = "";
        String s2 = "";

        for(int i = 0; i < s.length()/2; i++){
            s1 += s.charAt(i);
        }

        for(int i = s.length()/2; i < s.length(); i++){
            s2 += s.charAt(i);
        }
        int countA = 0;
        int countB = 0;

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

        System.out.println(s1);
        System.out.println(s2);

        if(countA == countB){
            return true;
        }
        return false;
    }
}