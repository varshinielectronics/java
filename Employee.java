package Super_Keyword;

public class Employee extends Person {

   String name = "Child Name";

   Employee() {

       super();

       System.out.println("Child Constructor Called");
   }

   void show() {

       System.out.println("Child Name : " + name);

       System.out.println("Parent Name : " + super.name);

       super.display();
   }


}
