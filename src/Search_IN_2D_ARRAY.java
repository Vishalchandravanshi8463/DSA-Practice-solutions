
import java.util.Scanner;

public class Search_IN_2D_ARRAY {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter the row amd column of array");
        int row = s.nextInt();
        int column = s.nextInt();

        int[][] arr = new int[row][column];
        System.out.println("enter the array element ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("arr[" + i + "][" + j + "]");
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("enter the target ");
        int target = s.nextInt();

        System.out.println("search method is called in your program _______________________________");
        search(arr, target, row, column);

        System.out.println("minimum method is calling ______________________________________________");
        minv(arr, row, column);

        // System.out.println("enter the value which you want to search in array ");
        //  int target = s.nextInt();
        System.out.println("");
        // search(arr, target, row, column);
        System.out.println("maximum number method is calling _______________________________________");
        maxv(arr, row, column);

    }

    static void maxv(int arr[][], int row, int column) {
        int max = -2392442;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < column; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("maximum v is " + max);

    }

    //FIND THE MINIMUM NUMBER IN THE 2 D ARRAY 
    static void minv(int arr[][], int row, int column) {
        System.out.println("you are come in the method where we find minimum number in array");
        int min = 342344373;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (min > arr[i][j]) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("minimum value in array is " + min);
    }

    static void search(int arr[][], int target, int row, int column) {
        int p = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (arr[i][j] == target) {
                    System.out.println("yes we find the target in the array " + target + "at "
                            + "the index of arr[" + i + "][" + j + "]");
                    p++;
                    break;

                }

            }
            if (p == 0) {
                System.out.println("sorry! we not find the target in the array ");
            }
        }
    }

}
