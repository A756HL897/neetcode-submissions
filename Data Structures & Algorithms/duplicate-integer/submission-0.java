class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> numList=new HashSet<>();

        for(int num:nums){
            if(numList.contains(num)){
                return true;
            }
            numList.add(num);
        }
        return false;
    }
}