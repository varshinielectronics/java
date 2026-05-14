package condition;

public class Continue2 {
 public static void main(String[] args) {

        // Example 2 - Skip even numbers
        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }
    } 
}
