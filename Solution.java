class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        if(list.size() >= 3){
            return(list.get(list.size() - 3));
        }
        else{
            return(list.get(list.size() - 1));
        }
    }
}
