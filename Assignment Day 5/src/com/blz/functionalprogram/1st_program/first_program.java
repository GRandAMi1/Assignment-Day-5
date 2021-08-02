import java.util.Scanner;

public class first_program {
    public static Scanner scanner = new Scanner(System.in);
    public static int row, col;
    public static void main(String[] args) {
        System.out.println("Enter number of rows : ");
        row = scanner.nextInt();
        System.out.println("Enter number of Columns : ");
        col = scanner.nextInt();
        int[][] array = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
