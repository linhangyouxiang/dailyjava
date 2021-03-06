public class Solution {
    public boolean isHappy(int n) {
        
        if (n<1)return false;
        
        HashSet<Integer> set = new HashSet<>();
        
        int tmp;
        int newN;
        while(n!=1 && !set.contains(n)){
            set.add(n);
            newN = 0;
            while(n>0){
                tmp = n%10;
                n = n/10;
                newN += tmp*tmp;
                
                
            }
            n = newN;
            
            
        }
        return n==1;
    }
}