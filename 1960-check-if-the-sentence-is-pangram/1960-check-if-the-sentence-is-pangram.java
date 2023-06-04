class Solution {
    public boolean checkIfPangram(String sentence) {
        Character c = 'a';
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < 26; i++){
            map.put(c++, 0);
        }

        for(int i = 0; i < sentence.length(); i++){
            if(map.containsKey(sentence.charAt(i))){
                map.replace(sentence.charAt(i),1);
            } 
        }

        for(Map.Entry<Character, Integer> maps : map.entrySet()){
            int n = maps.getValue();
            if(n == 0){
                return false;
            }
        }
        return true;
    }
}