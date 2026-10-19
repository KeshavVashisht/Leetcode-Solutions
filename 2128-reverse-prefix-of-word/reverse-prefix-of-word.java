class Solution {
    public String reversePrefix(String word, char ch) {
        int index=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                index=i;
                break;
            }
        }
        
        if(index==-1){
            return word;
        }
        StringBuilder sb = new StringBuilder(word);
        int a=0;
        int b=index;
        while(a<=b){ 
            char temp=sb.charAt(a);
            sb.setCharAt(a, sb.charAt(b));
            sb.setCharAt(b, temp);
            a++;
            b--;
        }

        return sb.toString();

    }

}