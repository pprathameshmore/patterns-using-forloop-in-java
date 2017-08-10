
import java.util.*;

/**
 *
 * @author Prathamesh More
 */
public class Pattern_5 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= 1; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }

    }

}

/*

Output : 

    *
   **
  ***
 ****
*****    


 */
