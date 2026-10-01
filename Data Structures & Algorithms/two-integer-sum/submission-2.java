class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm=new HashMap<>();
        int required;
        for(int i=0;i<nums.length;i++){
           
            required=target-nums[i];
            if(hm.containsKey(required) && hm.get(required)!=i){
                return new int[]{hm.get(required),i};
            }
            hm.put(nums[i],i);

        }
        return new int[]{0,0};    }
}
