class Solution {
    public int compress(char[] chars) {
       int index =0; 
       int i=0;

      while( i <chars.length){
        Integer count =0;
        char current = chars[i];
        while(i<chars.length && chars[i]== current){
            count++;
            i++;
        }

        chars[index++] = current;
        
        if (count>1){
            String cnt = count.toString();

            for(char c: cnt.toCharArray()){
                chars[index++]=c;
            }
        }
        
        
       }
       
       return index;
    }
}