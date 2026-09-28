class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //loop

        //if not visited add to result array mark visited

        //create a ascii array

        //check size of next element-not equal, skip

        //oterwise create a ascii array and use array.equals(), if equals add to result mark 
        //visited 

        List<List<String>> result=new ArrayList<>();
        if(strs.length==0){
            return result;
        }
        if(strs.length==1){
            result.add(List.of(strs[0]));
            return result;
        }

        int[] iarr=new int[26];

        for(int i=0;i<strs.length;i++){
            List<String> temp=new ArrayList<>();
            if(!strs[i].equals("visited")){
                    temp.add(strs[i]);
                    iarr=asciify(strs[i]);
                    
                }
            else{
                continue;
            }
            
            for(int j=i+1;j<strs.length;j++){
                if(strs[i].length()!=strs[j].length() || strs[j].equals("visited")){
                    continue;
                }
                int[] jarr=new int[26];
                jarr=asciify(strs[j]);
                if(Arrays.equals(iarr,jarr)){
                    temp.add(strs[j]);
                    strs[j]="visited";
                }
            }
            result.add(temp);
        }
        return result;

    }

    private int[] asciify(String str){
            int[] retval=new int[26];
            for(char c:str.toCharArray()){
                retval[c-'a']+=1;
            }

            return retval;
    }
}
