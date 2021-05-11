package com.algos.arrays;

import javax.swing.*;

public class SetZero {

    public void setZeroes(int[][] matrix) {

      int R = matrix.length;
      int C = matrix[0].length;

      boolean isColm = false;

      for( int i = 0 ; i < C ; i++ ){
          if( matrix[0][i] == 0 ){
              isColm = true;
              break;
          }
      }

      for( int i = 0 ; i < R ; i++ ){
          for( int j = 0 ; j < C ; j++ ){
              if( matrix[i][j] == 0 ){
                      matrix[i][0] = 0 ;
                      matrix[0][j] = 0 ;
              }
          }
      }

     /* for( int i = 1 ; i < C ; i++ ){
            if( matrix[0][i] == 0  ) {
                for( int  j = 1 ; j < R ; j++ ){
                    matrix[j][i] = 0;
                }
            }
          //  if(colm)
                matrix[0][i] = 0;
      }

        for( int i = 1 ; i < R ; i++ ){
            if( matrix[i][0] == 0
            ) {
                for( int  j = 0 ; j < C ; j++ ){
                    matrix[i][j] = 0;
                }
            }

        }
*/


    }

    public void print( int[][] matrix ){
        System.out.println("*********************************" );
        for( int i = 0 ; i < matrix.length ; i++ ){
            for( int j = 0 ; j < matrix[0].length ; j++ ){
                System.out.print( matrix[i][j] + "  ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] x = { {0,0,0,5},
                      {4,3,1,4},
                      {0,1,1,4},
                      {1,2,1,3},
                      {0,0,1,1}};

        SetZero z = new SetZero();
        z.print( x );
        z.setZeroes( x );
        z.print( x );
    }
}
