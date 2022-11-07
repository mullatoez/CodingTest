package questions.questionTwo;

import java.util.ArrayList;
import java.util.List;

public class Qn2Solution {
    /*
    Produce a spiral array. A spiral array is a square arrangement of the first N2 natural
numbers, where the numbers increase sequentially as you go around the edges of the
array spiraling inwards. For example, given 5, produce this array:
0 1 2 3 4
15 16 17 18 5
14 23 24 19 6
13 22 21 20 7
12 11 10 9 8
     */

    public static void main(String[] args) {
        // System.out.println("Hello world!");
        /*
        BIG - O Notation
        Time Complexity: - 0(n)
        Space Complexity: - 0(n)
         */
        printSpiral();

    }

    static void printSpiral(){
        populateArray(5);
    }

    static void populateArray(int size){
        int[][] arr = new int[size][size];
        int increment = 1;
        for(int i = 0; i < size; i++)
            for(int j = 0; j < size; j++)
                arr[i][j] = increment++;

        List<Integer> integers = spiralOrder(arr);
        System.out.print(integers);
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output = new ArrayList<>();
        if (matrix.length == 0) return output;

        int beginningRow = 0;
        int rowEnd = matrix.length - 1;
        int beginningColumn = 0;
        int columnEnd = matrix[0].length - 1;

        while (beginningRow <= rowEnd && beginningColumn <= columnEnd) {
            for (int i = beginningColumn; i <= columnEnd; i++) {
                output.add(matrix[beginningRow][i]);
            }

            beginningRow++;

            for (int i = beginningRow; i <= rowEnd; i++) {
                output.add(matrix[i][columnEnd]);
            }
            columnEnd--;

            if (beginningRow <= rowEnd) {
                for (int i = columnEnd; i <= beginningColumn; i--) {
                    output.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if (beginningColumn <= columnEnd) {
                for (int i = rowEnd; i >= beginningRow; i--) {
                    output.add(matrix[i][beginningColumn]);
                }
            }

            beginningColumn++;
        }

        return output;
    }

}
