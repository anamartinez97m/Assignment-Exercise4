package assignment.exercise4;

public class AssignmentExercise4 {

    public static void main(String[] args) {
        int m = 12;
        int n = 13;
        int numElems = m * n;
        
        int[][] matrix = new int[m][n];
        
        int count = 1; // Count is to fill the matrix
        
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[0].length; column++){
                matrix[row][column] = count;
                count++;
            }
        }
        
        for(int row = 0; row < matrix.length; row++){
            for(int column = 0; column < matrix[0].length; column++){
                System.out.print(matrix[row][column] + "\t");
            }
            System.out.println();
        }
        
        System.out.print("-------------------------------");
        System.out.println();
        
        int[] mRi = {0, 0}; // mR -> move Right init
        int[] mRf = {0, n - 1}; // mR -> move Right finish
        
        int[] mDi = {1, n - 1 }; // mD -> move Down init
        int[] mDf = {m - 1, n - 1}; // mD -> move Down finish
        
        int[] mLi = {m - 1, n - 2}; // mL -> move Left init
        int[] mLf = {m - 1, 0}; // mL -> move Left finish
        
        int[] mUi = {m - 2, 0}; // mU -> move Up init
        int[] mUf = {1, 0}; // mU -> move Up finish
        
        
        int counter = 0; // counter allows us to know how many elements have been shown
        
        if((m != 0) && (n != 0)){
            while(counter < numElems){ 
                // Right movement
                for(int j = mRi[1]; j <= mRf[1] && counter < numElems; j++){
                    System.out.print(matrix[mRi[0]][j] + ", ");
                    counter++;
                }

                mRi[0]++;
                mRi[1]++;
                mRf[0]++;
                mRf[1]--;

                for(int k = mDi[0]; k <= mDf[0] && counter < numElems; k++){
                    System.out.print(matrix[k][mDi[1]] + ", ");
                    counter++;
                }

                mDi[0]++;
                mDi[1]--;
                mDf[0]--;
                mDf[1]--;

                for(int l = mLi[1]; l >= mLf[1] && counter < numElems; l--){
                    System.out.print(matrix[mLi[0]][l] + ", ");
                    counter++;
                }

                mLi[0]--;
                mLi[1]--;
                mLf[0]--;
                mLf[1]++;

                for(int z = mUi[0]; z >= mUf[0] && counter < numElems; z--){
                    System.out.print(matrix[z][mUi[1]] + ", ");
                    counter++;
                }

                mUi[0]--;
                mUi[1]++;
                mUf[0]++;
                mUf[1]++;
            }
        }
    }
    
}



