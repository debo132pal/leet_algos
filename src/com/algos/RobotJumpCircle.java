package com.algos;

public class RobotJumpCircle {
    public boolean judgeCircle(String moves) {

         int[] R    = {  1,  0 };
         int[] L    = { -1,  0 };
         int[] U    = {  0 , 1 };
         int[] D    = {  0 ,-1 };
         int[] curr = {  0 , 0 };
         for( int i = 0; i < moves.length() ; i++  ){
             char c = moves.charAt(i);
             switch ( c ) {
                 case 'R': curr[0] += R[0] ; curr[1] += R[1] ; break;
                 case 'L': curr[0] += L[0] ; curr[1] += L[1] ; break;
                 case 'U': curr[0] += U[0] ; curr[1] += U[1] ; break;
                 case 'D': curr[0] += D[0] ; curr[1] += D[1] ; break;
             }

         }
         return ( 0 ==  curr[0] && 0 == curr[1] );

    }

    public static void main(String[] args) {
        RobotJumpCircle jumpCircle = new RobotJumpCircle();
        System.out.println( jumpCircle.judgeCircle("UD"));
        System.out.println( jumpCircle.judgeCircle("LDRRLRUULR"));
    }
}
