
import java.util.*;

/**
 *
 * @author Prathamesh More
 */
public class Pattern_2 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j == 1 || j == size || i == 1 || i == size) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
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
