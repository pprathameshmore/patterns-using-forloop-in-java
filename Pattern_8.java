
/**
 *
 * @author Prathamesh More
 */
public class Pattern_8 {

    public static void main(String args[]) {

        int size = 7;
        int odd = 1;
        int noOfSpaces = 3;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= noOfSpaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= odd; j++) {
                System.out.print("*");
            }
            if (i < 4) {
                odd += 2;
                noOfSpaces = noOfSpaces - 1;
            } else {
                odd -= 2;
                noOfSpaces = noOfSpaces + 1;
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
