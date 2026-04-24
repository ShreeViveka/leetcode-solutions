class WordPattern{
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length!=pattern.length())
          return false;
        HashMap<String,Character>mp=new HashMap<>();
        HashMap<Character,String>mt=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            String c1=words[i];
            char c2=pattern.charAt(i);
            if((mp.containsKey(c1)&&mp.get(c1)!=c2)||(mt.containsKey(c2)&&!mt.get(c2).equals(c1)))
              return false;
        
            mp.put(c1,c2);
            mt.put(c2,c1);
        }
        return true;
    }
}