class Solution {
    public void reverseString(char[] s) {
       int l=0; int n=s.length;int r=n-1;char temp=' ';
        for(int i=0;i<n;i++){
            if(l<=r){
                temp=s[l];
                s[l]=s[r];
                s[r]=temp;
                l++; r--;
            }
        }
    }
}