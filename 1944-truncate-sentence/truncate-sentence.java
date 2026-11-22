class Solution {
    public String truncateSentence(String s, int k) {
        String[] words = s.trim().split("\\s+");
        int n = s.length();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            
            if(k==0) {
                return sb.toString();
    
            }
            if(ch==' ')k--;
            if(k>0) sb.append(ch);
            
            
        }
        
        return  sb.toString();

        
    }
}