package arsh;

import java.util.Arrays;

public class MatrixSetZeros {
    public static void main(String[] args) {
        int[][] matrix1={
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };

        int[][] matrix2={
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };

        System.out.println("Original array");
        printArray(matrix1);

       // setZerosBrute(matrix1);
        //System.out.println("After set zeroes brute force: ");
        //printArray(matrix1);

        System.out.println("After set zeroes optimal: ");
        setZeroesOptimal(matrix1);
        printArray(matrix1);

    }

    public static void printArray(int[][] matrix)
    {
        for(int[] row: matrix)
        {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void setZerosBrute(int[][] matrix)
    {
        int rows= matrix.length;
        int cols=matrix[0].length;

        boolean[] row=new boolean[rows];
        boolean[] col=new boolean[cols];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=true;
                    col[j]=true;
                }
            }
        }

        //Step 2 - set zeroes
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(row[i] || col[j])
                {
                    matrix[i][j]=0;
                }
            }
        }
    }

    public static void setZeroesOptimal(int[][] matrix)
    {
        int rows= matrix.length;;
        int cols=matrix[0].length;

        boolean firstRowZero=false;
        boolean firstColZero=false;

        //Check first row
        for(int j=0;j<cols;j++)
        {
           if(matrix[0][j]==0)
           {
               firstRowZero=true;
           }
        }

        //Check first col
        for(int i=0;i<rows;i++)
        {
            if(matrix[i][0]==0)
            {
                firstColZero=true;
            }
        }

        //Mark rows anf columns
        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<cols;j++)
            {
                if(matrix[i][j]==0)
                {
                 matrix[i][0]=0;
                 matrix[0][j]=0;
                }
            }
        }

        //Zero marked rows
        for(int i=1;i<rows;i++)
        {
            if(matrix[i][0]==0)
            {
                for(int j=0;j<cols;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }

        //Zero marked columns
        for(int j=1;j<cols;j++)
        {
            if(matrix[0][j]==0)
            {
                for(int i=0;i<rows;i++)
                {
                    matrix[i][j]=0;
                }
            }
        }

        //Zero first row
        if(firstRowZero)
        {
            for(int j=0;j<cols;j++)
            {
                matrix[0][j]=0;
            }
        }

        //Zero first col
        if(firstColZero)
        {
            for(int i=0;i<rows;i++)
            {
                matrix[i][0]=0;
            }
        }

    }
}
