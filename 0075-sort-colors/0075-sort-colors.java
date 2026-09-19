class Solution {
    public void sortColors(int[] nums) {
        int countZ = 0;
        int countO = 0;
        int countT = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                countZ++;
            }
            else if(nums[i] == 1){
                countO++;
            }
            else {
                countT++;
            }
        }
        for(int i = 0; i < countZ; i++){
            nums[i] = 0;
        }
        for(int i = countZ; i < countZ + countO; i++){
            nums[i] = 1;
        }
        for (int i = countZ + countO; i < nums.length; i++){
            nums[i] = 2;
        }
    }
}