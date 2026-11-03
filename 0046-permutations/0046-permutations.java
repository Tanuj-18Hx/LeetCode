class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>() ;
        
        fun(nums,0,list) ;
        return list ;
    }
    private void fun(int [] nums , int start , List<List<Integer>> list){

        if(start == nums.length) {
            List<Integer> tmp = new ArrayList<>() ;
            for(int i :  nums){
                tmp.add(i) ;
            }
            list.add(tmp) ;
            return ;
        }
        for(int i = start ; i < nums.length ; i++){
            int temp = nums[i] ;
            nums[i]  = nums[start] ;
            nums[start] = temp ;

            fun(nums,start+1,list) ;

             temp = nums[i] ;
            nums[i]  = nums[start] ;
            nums[start] = temp ;
        }
    }
}