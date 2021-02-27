package com.algos;

public class SearchMatrix1 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int R = matrix.length ;
        int C = matrix[0].length;
        int lo = 0;
        int hi = R*C ;
        while( lo < hi ){
            int mid = lo + ( hi - lo) / 2 ;
            int c = mid % C ;
            int r = (mid - c ) / C;
            if( matrix[r][c] > target ){
                hi =  mid;
            } else if( matrix[r][c] < target){
                lo = mid + 1;
            } else {
                return true;
            }
        }
        return( false);
    }

    public static void main(String[] args) {
        int[][] matrix =  {  {1,3,5,7} ,
                             {10,11,16,20} ,
                             {23,30,34,60} };
        SearchMatrix1 matrix1 = new SearchMatrix1();

        for( int i = 0 ; i < 61; i++ ) {
            System.out.println( i + "found " + matrix1.searchMatrix(matrix, i));
        }
    }
}
