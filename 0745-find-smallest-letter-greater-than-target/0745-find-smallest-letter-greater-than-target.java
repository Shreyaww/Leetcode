class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        // if(letters[letters.length-1] <= target){
        //     return letters[0];
        // }

        int low = 0, high = letters.length - 1;

        while(low <= high){
            int mid = (low+high)/2;

            if(letters[mid] > target){
                high = mid-1;
            }
            else if(letters[mid] <= target){
                low = mid+1;
            }
        }
        return letters[low % letters.length];
    }
}