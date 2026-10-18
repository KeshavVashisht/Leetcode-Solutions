class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;

        for(int i=s.length()-1 ;i>=0;i--){
            char ch = s.charAt(i);
            System.out.println(ch);
            if(Character.isWhitespace(ch)){
                if(count>0){
                    break;
                }else{
                    continue;
                }
            }else{
                count++;
            }

        }
        return count;
    }
}