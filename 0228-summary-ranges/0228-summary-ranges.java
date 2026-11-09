class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans=new ArrayList<>();
        int i=0;
        while(i<nums.length){
                int start=nums[i];
                int j=i;
                while(j<nums.length-1 && nums[j+1]==nums[j]+1){
                    j++;
                }
                int end=nums[j];
                StringBuilder sb=new StringBuilder();
                if(start==end){
                    sb.append(start);
                }else{
                    sb.append(start);
                    sb.append("->");
                    sb.append(end);
                }
                ans.add(sb.toString());
                i=j+1;
            }
        return ans;
    }
}