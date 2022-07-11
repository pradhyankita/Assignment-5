package Basics.Assignment5.Fundamentals;

public class array {

    public static void main(String[] args) {
        System.out.println("Multi dimensional array");
        int[][] arr2 = new int[2][3];

        for (int a = 0; a < arr2.length; a++) {
            for (int b = 0; b < arr2[a].length; b++) {
                arr2[a][b] = a + b;
            }
        }

        for (int a = 0; a < arr2.length; a++) {
            for (int b = 0; b < arr2[a].length; b++) {
                System.out.println(arr2[a][b]);
            }
        }
    }
}