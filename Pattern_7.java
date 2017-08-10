/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapatterns;

/**
 *
 * @author Prathamesh More
 */
public class Pattern_7 {

    public static void main(String args[]) {

        int size = 7;
        int odd = 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= odd; j++) {
                System.out.print("*");
            }
            if (i < 4) {
                odd += 2;
            } else {
                odd -= 2;
            }

            System.out.println();

        }

    }

}

/*
Output : 

*
***
*****
*******
*****
***
*


 */
