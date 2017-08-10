
import java.util.*;
/**
 *
 * @author Prathamesh More
 */
public class Pattern_1 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        for (int i = 1; i <= size; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int j = 1; j <= size - 2; j++) {

            for (int i = 1; i <= size; i++) {
                if (i == 1 || i == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        for (int i = 1; i <= size; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

}


/* 

Output :
	
*****
*   *
*   *
*   *
*****
	
*/