class Solution {
    public String removeOuterParentheses(String s) {
       StringBuilder result=new StringBuilder();
       int cnt=0;
       for(char c : s.toCharArray())
       {
        if(c == '('){
            if(cnt>0) 
            result.append(c);
            cnt++;
          }
        else if(c==')') 
        {
            if(cnt>1) result.append(c);
            cnt--;
            }

        }
        
      return result.toString();   
    }
}