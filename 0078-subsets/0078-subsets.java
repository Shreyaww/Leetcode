class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        List<Integer> ls1 = new ArrayList<>();
        fun(0, nums.length, nums, ls, ls1);
        return ls;
    }

    public void fun(int i, int n, int[] arr, List<List<Integer>> ls, List<Integer> ls1){
        if(i == n){
            ls.add(new ArrayList(ls1));
            return;
        }

        ls1.add(arr[i]);
        fun(i+1, n, arr, ls, ls1);
        ls1.remove(ls1.size() - 1);
        fun(i+1, n, arr, ls, ls1);
    }
}