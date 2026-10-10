class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(target-nums[i])){
                return new int[]{hm.get(target-nums[i]),i};
            }
            hm.put(nums[i],i);
        }
        return new int[] {};
    }
}


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n=nums.length;
//         int arr[]=new int[2];
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[j]+nums[i]==target){
//                     arr[0]=i;
//                     arr[1]=j;   //return new int[]{i,j};
//                 }
//             }
//         }
//         return arr;   //return new int[]{};
//     }
// }