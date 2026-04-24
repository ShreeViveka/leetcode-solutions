class Isomorphic{
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=s.length())
          return false;
        HashMap<Character,Character>mp=new HashMap<>();
        HashMap<Character,Character>mt=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if((mp.containsKey(c1)&&mp.get(c1)!=c2)||(mt.containsKey(c2)&&mt.get(c2)!=c1))
              return false;
        
            mp.put(c1,c2);
            mt.put(c2,c1);
        }
        return true;
    }
}