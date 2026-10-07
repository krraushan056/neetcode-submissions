class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Character> temp = new HashMap<Integer,Character>();
       for(int i=0;i<nums.length;i++){
        if(temp.containsKey(nums[i])){
            return true;
        }else{
            temp.put(nums[i],'Y');
        }
       }
        return false;
    
    }
}