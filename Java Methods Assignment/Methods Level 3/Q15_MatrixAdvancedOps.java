import java.util.*;
public class Q15_MatrixAdvancedOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix3x3 = generateMatrix(3, 3);
        System.out.println("Matrix (3x3):");
        printMatrix(matrix3x3);

        System.out.println("\nTranspose:");
        printMatrix(transpose(matrix3x3));

        int det3 = determinant3x3(matrix3x3);
        System.out.println("\nDeterminant (3x3): " + det3);

        if (det3 != 0) {
            System.out.println("\nInverse (3x3):");
            printMatrix(inverse3x3(matrix3x3));
        } else {
            System.out.println("\nInverse not possible (det=0).");
        }

        int[][] matrix2x2 = generateMatrix(2, 2);
        System.out.println("\nMatrix (2x2):");
        printMatrix(matrix2x2);

        int det2 = determinant2x2(matrix2x2);
        System.out.println("\nDeterminant (2x2): " + det2);

        if (det2 != 0) {
            System.out.println("\nInverse (2x2):");
            printMatrix(inverse2x2(matrix2x2));
        } else {
            System.out.println("\nInverse not possible (det=0).");
        }

        sc.close();
    }
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.printf("%8d", val);
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] trans = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    public static int determinant2x2(int[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    public static int determinant3x3(int[][] m) {
        int det =
            m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1]) -
            m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0]) +
            m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
        return det;
    }

    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) throw new ArithmeticException("Matrix not invertible (det=0)");

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / (double) det;
        inv[0][1] = -m[0][1] / (double) det;
        inv[1][0] = -m[1][0] / (double) det;
        inv[1][1] = m[0][0] / (double) det;
        return inv;
    }

    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0) throw new ArithmeticException("Matrix not invertible (det=0)");

        double[][] inv = new double[3][3];

        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]);
        inv[0][1] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        inv[0][2] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]);

        inv[1][0] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]);
        inv[1][2] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);

        inv[2][0] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]);
        inv[2][1] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]);

        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = inv[j][i] / (double) det;
            }
        }
        return inverse;
    }
}
