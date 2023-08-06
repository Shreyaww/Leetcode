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

        ls.add(ls2);

        for(int n : nums2){
            if(!map1.containsKey(n) && !ls1.contains(n)){
                ls1.add(n);
            }
        }

        ls.add(ls1);

        return ls;

        // List<List<Integer>> ls = new ArrayList<>();
        // HashSet<Integer> ls1 = new HashSet<>();
        // HashSet<Integer> ls3 = new HashSet<>();
        // List<Integer> ls2 = new ArrayList<>();
        // List<Integer> ls4 = new ArrayList<>();

        // for(int i = 0; i < nums2.length; i++){
        //     ls3.add(nums2[i]);
        // }

        // for(int i = 0; i < nums1.length; i++){
        //     if(!ls3.contains(nums1[i])){
        //         if(!ls4.contains(nums1[i])){
        //             ls4.add(nums1[i]);
        //         }
        //     }
        // }
        
        // if(!ls.contains(ls4)){
        //     ls.add(ls4);
        // }

        // for(int i = 0; i < nums1.length; i++){
        //     ls1.add(nums1[i]);
        // }

        
        // for(int i = 0; i < nums2.length; i++){
        //     if(!ls1.contains(nums2[i])){
        //         ls2.add(nums2[i]);
        //     }
        // }

        // if(!ls.contains(ls2)){
        //     ls.add(ls2);
        // }

        // return ls;
    }
}