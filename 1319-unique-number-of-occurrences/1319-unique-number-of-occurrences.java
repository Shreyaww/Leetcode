class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        
        List<Integer> ls = new ArrayList<>();
        for(int val : map.values()){
           if(ls.contains(val)){
               return false;
           }
           ls.add(val);
        }
       
        return true;
    }
}