package DiffExamples.ClassesAndObjects.DataStructures;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        String[][] ticTacTow = new String[3][3];

        for(int i = 0; i < ticTacTow.length; i++) {
            for(int j = 0; j < ticTacTow[i].length; j++) {
                ticTacTow[i][j] = " - ";
            }
        }
        System.out.println(Arrays.deepToString(ticTacTow));

        for(int i = 0; i < ticTacTow.length; i++) {
            for(int j = 0; j < ticTacTow[i].length; j++) {
                System.out.print(ticTacTow[i][j]);
            }
            System.out.println();
        }
    }
}
