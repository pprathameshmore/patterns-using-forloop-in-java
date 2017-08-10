
import java.util.*;

/**
 *
 * @author Prathamesh More
 */
public class Pattern_6 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int size = 5;

        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= 0; j--) {
                if (i > j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println(" ");
        }

    }

}

/*
Output:


*****  
****   
***    
**     
*   


 */
