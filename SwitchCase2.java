package condition;

public class SwitchCase2 {
public static void main(String[] args) {
        String day ="Monday";

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                System.out.println("Weekday -Training Time");
                case "Saturday", "Sunday" ->
                System.out.println("Weekend - Practice Project");
                default ->
                System.out.println("Invalid day");
                
        }
    }

}
