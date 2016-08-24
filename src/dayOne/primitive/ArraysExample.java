package dayOne.primitive;

/**
 * Created by student on 22-Aug-16.
 */
public class ArraysExample {



  public static void main(String[] args){

      int month_days[] = {31,28, 31, 30,31,30,31,31,30, 31, 31, 31};


      int twoD[][] = new int [4][5];// means 4 rows and 5 columns


      int i, j, k = 0;

      for(i=0; i<4;i++){// loops for row

          for (j=0;j<5;j++){// loops for columns
              twoD[i][j] = k;
          }
      }




      int threeD[][][] = new int [3][4][5];

      int a,b,c;
      for (a=0;a<3;a++)
          for (b=0;b<3;b++)
              for (c=0;c<3;c++){
                  threeD[a][b][c] = a*b*c;
              }

  }

}
