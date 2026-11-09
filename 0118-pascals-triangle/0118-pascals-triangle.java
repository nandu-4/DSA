// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>>res=new ArrayList<>();
//         //List<Integer>list=new ArrayList<>();
//         // list.add(1);
//         // nums.add(list);
//         for(int i=0;i<numRows;i++){
//             List<Integer>row=new ArrayList<>();
//             for(int j=0;j<=i;j++){
//                 if(j==0 || j==i){
//                     row.add(1);
//                 }else{
//                     List<Integer>prev=res.get(i-1);
//                     row.add(prev.get(j-1)+prev.get(j));
//                 }
//             }
//             res.add(row);
//         }
//         return res;
//     }
// }
class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>>ans=new ArrayList<>();
         List<Integer>row=new ArrayList<>();
         row.add(1);
         ans.add(row);
         for(int i=1;i<numRows;i++){
            List<Integer>temprow=new ArrayList<>();
             temprow.add(1);
             for(int j=1;j<i;j++){
                int val=ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                temprow.add(val);
             }
             temprow.add(1);
             ans.add(temprow);
         }
         return ans;
    }
}