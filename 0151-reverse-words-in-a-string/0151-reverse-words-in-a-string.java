class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String [] words=s.split("\\s+");
        StringBuilder x=new StringBuilder();
            for(int i=words.length-1;i>=0;i--)
            {
                x.append(words[i]);
                    if(i!=0) x.append(" ");
            }

        return x.toString();
    }
}