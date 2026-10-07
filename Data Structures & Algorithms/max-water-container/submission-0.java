class Solution {
    public int maxArea(int[] heights) {
        int size=heights.length-1;
        int max=0;
        int left=0;
        int right=size;
        int cur=0;
        int minimum;

        while(left!=right){
            minimum=Math.min(heights[left],heights[right]);
            cur=minimum*size;
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
            if(cur>max){
                max=cur;
            }
            size--;
        }
        return max;
        

    }
}
