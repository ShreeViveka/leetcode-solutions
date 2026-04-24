class WordPattern_optim {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length!=pattern.length())
          return false;
        HashMap<Object,Integer>mp=new HashMap<>();
        
        for(Integer i=0;i<pattern.length();i++){
      
            if(mp.put(pattern.charAt(i),i)!=mp.put(words[i],i))
              return false;
        }
        return true;
    }
}