class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ls = new ArrayList<>();

        for(int i = 0; i < numRows; i++){
            List<Integer> ls1 = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    ls1.add(1);
                }
                else{
                    ls1.add(ls.get(i-1).get(j-1) + ls.get(i-1).get(j));
                }
            }
            ls.add(ls1);
        }
        return ls;
    }
}