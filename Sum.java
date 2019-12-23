import java.util.Arrays; 
class twoSum {
    public boolean twoSum(int[] nums, int target) {
        int i=0,j=nums.length-1;
        Arrays.sort(nums);
        while(i<j){
            if(nums[i]+nums[j]==target){
                return true;
            } else if (nums[i]+nums[j]<target){
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}