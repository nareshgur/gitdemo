package abstraction;

import java.util.Scanner;

public class war{
    public static char[][] generateMatrix(int m, int n, char[] targets, int[] columnIndices, int[] rowPointers) {
        char[][] battlefield = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                battlefield[i][j] = 'z';
            }
        }

        for (int row = 0; row < m; row++) {
            int startIdx = rowPointers[row];
            int endIdx = rowPointers[row + 1];

            for (int idx = startIdx; idx < endIdx; idx++) {
                int col = columnIndices[idx];
                battlefield[row][col] = targets[idx];
            }
        }

        return battlefield;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.nextLine();

        String targetsInput = scanner.nextLine();
        char[] targets = targetsInput.toCharArray();

        String columnIndicesInput = scanner.nextLine();
        String[] colIndicesStr = columnIndicesInput.split(" ");
        int[] columnIndices = new int[colIndicesStr.length];
        for (int i = 0; i < colIndicesStr.length; i++) {
            columnIndices[i] = Integer.parseInt(colIndicesStr[i]);
        }

        String rowPointersInput = scanner.nextLine();
        String[] rowPointersStr = rowPointersInput.split(" ");
        int[] rowPointers = new int[rowPointersStr.length];
        for (int i = 0; i < rowPointersStr.length; i++) {
            rowPointers[i] = Integer.parseInt(rowPointersStr[i]);
        }

        char[][] result = generateMatrix(m, n, targets, columnIndices, rowPointers);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

