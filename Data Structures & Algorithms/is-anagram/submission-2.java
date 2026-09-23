class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        char[] letters=new char[26];

        for(char c:s.toCharArray()){
            letters[c-'a']+=1;
        }

        for(char c:t.toCharArray()){
            if(letters[c-'a']==0){
                return false;
            }
            letters[c-'a']-=1;
        }
        return true;
    }
}
