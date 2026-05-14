package Encapsulation;

public class EmployeeMain {
   public static void main(String[] args) {

       Employee emp = new Employee();

       emp.setEmployeeId(501);
       emp.setEmployeeName("Kiran");
       emp.setSalary(45000);

       System.out.println("Employee ID : " + emp.getEmployeeId());
       System.out.println("Employee Name : " + emp.getEmployeeName());
       System.out.println("Salary : " + emp.getSalary());
   }

}
