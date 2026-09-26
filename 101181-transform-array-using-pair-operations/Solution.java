class Solution {
    public boolean canTransform(int[] source, int[] target) {
        if(source.length!=target.length){
            return false;
        }
        if(source.length==1){
           if(source[0]==target[0]){
               return true;
           }else{
               return false;
           }
        }
        long sourceSum=0;
        long targetSum=0;

        for(int i=0; i<source.length;i++){
            sourceSum+=source[i];
            targetSum+=target[i];
        }
        if(sourceSum==targetSum){
            return true;
            
        }else{
            return false;
        }
    }
    
}