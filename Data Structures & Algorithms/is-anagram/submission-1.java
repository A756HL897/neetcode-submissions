class Solution {
    public boolean isAnagram(String s, String t) {
    
        if(s.length()!=t.length()){return false;}


        Map<Character,Integer> sSet=new HashMap<>();
        Map<Character,Integer> tSet=new HashMap<>();

        char[] charS=s.toCharArray();
        char[] charT=t.toCharArray();

        for(int i=0;i<charS.length;i++){
            if(sSet.containsKey(charS[i])){
                sSet.replace(charS[i],sSet.get(charS[i])+1);
            }else{
                sSet.put(charS[i],1);
            }
            if(tSet.containsKey(charT[i])){
                tSet.replace(charT[i],tSet.get(charT[i])+1);
            }
            else{
                tSet.put(charT[i],1);
            }
        }

        return sSet.equals(tSet);

        
    }
}
