package com.algos.arrays;

public class SearchInMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int R = matrix.length;
        int C = matrix[0].length;

        int r = 0;
        int c = C - 1;
        while (r < R && c >= 0) {
            if ( matrix[r][c] > target ) {
                c--;
            } else if ( matrix[r][c] < target ) {
                r++;
            } else {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {

        int[][] matrix =   {
                             {1,4,7,11,15},
                             {2,5,8,12,19},
                             {3,6,9,16,22},
                             {10,13,14,17,24},
                             {18,21,23,26,30}
                           };
         SearchInMatrix m = new SearchInMatrix();
       for( int i= 0 ; i < 35 ; i++ ){

            System.out.println(  i + " found= " + m.searchMatrix( matrix, i ));
        }
    }
}
