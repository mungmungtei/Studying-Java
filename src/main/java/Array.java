import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

        int[] num = {1, 2, 3};
        int[] newNum = new int[5];
        System.out.println(num);  // [I@6b71769e
        System.out.println(Arrays.toString(num));  // [1, 2, 3]
        System.out.println(Arrays.toString(newNum));  // [0, 0, 0, 0, 0]

        for (int i = 0; i < num.length; i++) {
            newNum[i] = num[i];
            System.out.println(Arrays.toString(newNum));
                // [1, 0, 0, 0, 0]
                // [1, 2, 0, 0, 0]
                // [1, 2, 3, 0, 0]
        }

        int[][] square = new int[3][5];
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.print("*");
            }
            System.out.println();
                // *****
                // *****
                // *****
        }
    }
}