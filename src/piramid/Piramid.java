/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramid;

import java.util.Scanner;

/**
 *
 * @author Best
 */
public class Piramid {

    public static void main(String[] args) {

        System.out.print("Plese input number integer : ");
        int row = new Scanner(System.in).nextInt();
        int column = (row + 1) / 2;
        int dun = column - 1;
        int k = 1;

        for (int i = row; i >= 1; i--) {
            if (i % 2 != 0) {

                for (k = 1; k <= dun; k++) {
                    System.out.print(" ");
                }
                dun--;
                for (int j = i; j <= row; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
