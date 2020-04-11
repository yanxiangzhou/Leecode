class Solution {
    public String reverseWords(String s) {
       StringBuilder sb = new StringBuilder();
       String []ss = s.split(" ");
       int len = ss.length;
       for(int i = len -1; i >= 0;i--){
           if(ss[i].length() == 0) continue;
           sb.append(ss[i]).append(" ");
       }
       if(sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
       return sb.toString();
    }
}