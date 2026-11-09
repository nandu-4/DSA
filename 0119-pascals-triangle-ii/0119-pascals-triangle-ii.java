class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>>ans=new ArrayList<>();
         List<Integer>row=new ArrayList<>();
         row.add(1);
         ans.add(row);
         for(int i=1;i<=rowIndex;i++){
            List<Integer>temprow=new ArrayList<>();
             temprow.add(1);
             for(int j=1;j<i;j++){
                int val=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                temprow.add(val);
             }
             temprow.add(1);
             ans.add(temprow);
         }
        return ans.get(rowIndex);
    }
}
