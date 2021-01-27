class Solution {
    
    public int romanToInt(String s) {
        
        int retorno = 0;
        
        Map<Character, Integer> ht = new HashMap();
        
        ht.put('I',1);
        ht.put('V',5);
        ht.put('X',10);
        ht.put('L',50);
        ht.put('C',100);
        ht.put('D',500);
        ht.put('M',1000);
        
        for(int i = 0;i < s.length(); i++){
            
            if(s.length() == 1){
                return ht.get(s.charAt(i));
            }
            
            int currentValue = ht.get(s.charAt(i));
            int nextValue = (i < s.length()-1) ? ht.get(s.charAt(i+1)) : -1;
            
            if(currentValue < nextValue){
                retorno += nextValue - currentValue;
                i++;
            }else{
                retorno += currentValue;
            }
            
            
        }
        return retorno;
    }
    

}
