class Solution {

    // separate method we're gonna Use to find Common prefix first

    public String commonPart(String s1, String s2){
        
        int n = Math.min(s1.length() , s2.length());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            if(s1.charAt(i) == s2.charAt(i)){
                sb.append(s1.charAt(i));
            }
            else{
                 break;
            }
        }
        return sb.toString();
    }

    // actual Method where Main code is gonna Work
    public String longestCommonPrefix(String[] strs) {
        
        String res = strs[0];

        for(int j = 1; j < strs.length; j++){
            res = commonPart(res , strs[j]);
        }

        return res;

    }
}