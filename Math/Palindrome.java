class Palindrome {
public:
    bool isPalindrome(int x) {
 
        long t,sum=0;
        int k=x;
        while(x!=0){
            t=x%10;
            sum=sum*10+t;
            x=x/10;
        }
        if(sum==k){
            if(k>=0)
              return true;
        }
        return false;
          
    }
};