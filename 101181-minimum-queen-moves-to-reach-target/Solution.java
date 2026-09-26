class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        int sourceRow=source[0];
        int sourceColumn=source[1];
        int targetRow=target[0];
        int targetColumn=target[1];
        if(sourceRow == targetRow && sourceColumn == targetColumn){
            return 0;
        }
        if(sourceRow == targetRow || sourceColumn == targetColumn|| Math.abs(sourceRow-targetRow)==Math.abs(sourceColumn-targetColumn)){
            return 1;
        }
        return 2;
    }
}