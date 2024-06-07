class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        
        String[] words = sentence.split(" ");
        String str = "";

        for(String currWord : words){
            String word = currWord;

            for(String dict : dictionary){
                if(word.startsWith(dict)){
                    if(dict.length() < word.length()){
                        word = dict;
                    }
                }
            }

            str += word + " ";

        }

        //System.out.println(Arrays.toString(words));

        return str.trim();
    }
}