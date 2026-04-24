class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        
        int n1 = 0;
        int n2 = 0;
        for(int i = 0; i <moves.length();i++){
            if(moves.charAt(i) == 'L'){
                n1-=1;
                n2-=1;
            }else if(moves.charAt(i)=='R'){
                n1+=1;
                n2+=1;
            }else if(moves.charAt(i)=='_'){
                n1-=1;
                n2+=1;
            }
        }
        return Math.max(Math.abs(n1),Math.abs(n2));
    }
}