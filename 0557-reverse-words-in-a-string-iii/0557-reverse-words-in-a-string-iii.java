class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
       
        StringBuilder ans=new StringBuilder();
        for(String x:arr)
        {
           ans.append( new StringBuilder(x).reverse().toString()).append(" ");
        }
        
       return ans.toString().trim();
    }

}
