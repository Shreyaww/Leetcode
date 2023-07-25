class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);

            String str = String.valueOf(arr); //aet
           
            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(strs[i]);
        }
        
        List<List<String>> ls = new ArrayList<>(map.values());

       // System.out.println(map);
        return ls;
    }
}