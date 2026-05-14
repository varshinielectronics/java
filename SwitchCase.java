package condition;

public class SwitchCase {

   public SwitchCase() {
   }

   public static void main(String[] var0) {
      switch ("Monday") {
         case "Monday":
         case "Tuesday":
         case "Wednesday":
         case "Thursday":
         case "Friday":
            System.out.println("Weekday -Training Time");
            break;
         case "Saturday":
         case "Sunday":
            System.out.println("Weekend - Practice Project");
            break;
         default:
            System.out.println("Invalid day");
      }

   }
}

