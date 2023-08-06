class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ls = new ArrayList<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();

        for(int n : nums1){
            map1.put(n, map1.getOrDefault(n, 0)+1);
        }

        for(int n : nums2){
            map2.put(n, map2.getOrDefault(n, 0)+1);
        }

        for(int n : nums1){
            if(!map2.containsKey(n) && !ls2.contains(n)){
                ls2.add(n);
            }
        }

        for(int n : nums2){
            if(!map1.containsKey(n) && !ls1.contains(n)){
                ls1.add(n);
            }
        }

        ls.add(ls2);
        ls.add(ls1);

        return ls;
    }
}