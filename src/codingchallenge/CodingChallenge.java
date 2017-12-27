/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchallenge;

import java.util.Scanner;

/**
 *
 * @author Chimuelos
 */
public class CodingChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String operation;
        long sum;
        int count, xOne, yOne, zOne, xTwo, yTwo, zTwo;
        int T = input.nextInt();

        for (int i = 0; i < T; i++) {
            int N = input.nextInt();
            int M = input.nextInt();

            int[] W = new int[N];
            int[] x = new int[N];
            int[] y = new int[N];
            int[] z = new int[N];
            count = 0;

            for (int j = 0; j < M; j++) {
                operation = input.next();
                 if (operation.charAt(0) == 'U') {
                    x[count] = input.nextInt() - 1;
                    y[count] = input.nextInt() - 1;
                    z[count] = input.nextInt() - 1;
                    W[count] = input.nextInt();

                    for (int k = 0; k < count; k++) {
                        if (x[k] == x[count] && y[k] == y[count] && z[k] == z[count]) {
                            W[k] = 0;
                        }
                    }
                    count++;

                } else {
                    sum = 0;
                    xOne = input.nextInt() - 1;
                    yOne = input.nextInt() - 1;
                    zOne = input.nextInt() - 1;
                    xTwo = input.nextInt() - 1;
                    yTwo = input.nextInt() - 1;
                    zTwo = input.nextInt() - 1;

                    for (int a = 0; a < count; a++) {
                        if (x[a] >= xOne && y[a] >= yOne && z[a] >= zOne && x[a] <= xTwo && y[a] <= yTwo && z[a] <= zTwo) {
                            sum += W[a];
                        }
                    }

                    System.out.println(sum);
                }
            }
        }
    }
}
