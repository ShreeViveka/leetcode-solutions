class CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int c=1,p=0,ans=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1))
              c++;
            else{
                ans+=Math.min(p,c);
                p=c;
                c=1;
            }
        }
        return ans+Math.min(p,c);
        
    }
}