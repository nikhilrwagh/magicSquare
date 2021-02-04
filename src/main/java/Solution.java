import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);
        System.out.println(result);

        scanner.close();
    }


    static int formingMagicSquare(int[][] s) {
        //Declare all the possible set of perfect magic squares
        int[][] sm1 = {
                {2,7,6},
                {9,5,1},
                {4,3,8}};
        int[][] sm2 = {{2,9,4},{7,5,3},{6,1,8}};
        int[][] sm3 = {{4,9,2},{3,5,7},{8,1,6}};
        int[][] sm4 = {{8,1,6},{3,5,7},{4,9,2}};
        int[][] sm5 = {{4,3,8},{9,5,1},{2,7,6}};
        int[][] sm6 = {{6,1,8},{7,5,3},{2,9,4}};
        int[][] sm7 = {{6,7,2},{1,5,9},{8,3,4}};
        int[][] sm8 = {{8,3,4},{1,5,9},{6,7,2}};

        int minCost = Integer.MAX_VALUE;
        int [][][] ALL_SQUARES ={sm1,sm2,sm3,sm4,sm5,sm6,sm7,sm8};

        //iterate over all the magic squares and calculate the difference
        // between every element of input array with the magic square
        for(int[][] magic : ALL_SQUARES ){
            int cost = 0;
            for(int i = 0;i < 3;i++){
                for(int j = 0; j < 3 ;j++){
                    cost += Math.abs(s[i][j]- magic[i][j]);
                }
            }
            minCost = Math.min(minCost,cost);
        }

        return minCost;


    }
}