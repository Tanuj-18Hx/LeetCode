class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
       boolean []seen = new boolean[arr.length + 1]; 
        for(int key : map.values() ){
            if(seen[key]) return false ;

            seen[key] = true ;
        }
        return true ;
    }
}