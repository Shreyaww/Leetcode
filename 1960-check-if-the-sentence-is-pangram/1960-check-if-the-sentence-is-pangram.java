class Solution {
    public boolean checkIfPangram(String sentence) {
        Character c = 'a';
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < 26; i++){
            map.put(c++, 0);
        }
        System.out.println(map);

        for(int i = 0; i < sentence.length(); i++){
            if(map.containsKey(sentence.charAt(i))){
                map.replace(sentence.charAt(i),1);
            } 
        }
        System.out.println(map);
        for(Map.Entry<Character, Integer> maps : map.entrySet()){
            //Character ch = maps.getKey();
            int n = maps.getValue();
            if(n == 0){
                return false;
            }
        }
        // System.out.println(map);
        // if(sentence.length() >= 26){
        //     return true;
        // }
        return true;
    }
}