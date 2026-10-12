class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n != m)
            return false;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        char ch1[] = s.toCharArray();
        for (int i = 0; i < n; i++) {
            hm1.put(ch1[i], hm1.getOrDefault(ch1[i], 0) + 1);
        }
        char ch2[] = t.toCharArray();
        for (int i = 0; i < m; i++) {
            if (!hm1.containsKey(ch2[i])) {
                return false;
            }
            hm1.put(ch2[i], hm1.getOrDefault(ch2[i], 0) - 1);
            if (hm1.get(ch2[i]) == 0) {
                hm1.remove(ch2[i]);
            }
        }
        return true;
    }
}

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         int n=s.length();
//         int m=t.length();
//         if(n!=m) return false;
//         HashMap<Character,Integer>hm1=new HashMap<>();
//         char ch1[]=s.toCharArray();
//         for(int i=0;i<n;i++){
//             hm1.put(ch1[i],hm1.getOrDefault(ch1[i],0)+1);  
//         }
//         HashMap<Character,Integer>hm2=new HashMap<>();
//         char ch2[]=t.toCharArray();
//         for(int i=0;i<m;i++){
//             hm2.put(ch2[i],hm2.getOrDefault(ch2[i],0)+1);  
//         }
//         if(!hm1.equals(hm2)){
//             return false;
//         }
//         return true;
//     }
// }