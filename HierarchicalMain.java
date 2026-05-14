package Hierarchical_Inheritance;

public class HierarchicalMain {
public static void main(String[] args) {

       Developer d = new Developer();

       d.company();
       d.code();

       System.out.println();

       Tester t = new Tester();

       t.company();
       t.test();
   }

}
