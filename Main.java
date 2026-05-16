import java.sql.*;
public class Main{
    public static void main(String[] args){
        String url="jdbc:mysql://localhost:3306/school";
        String user="root";
        String password="";
        try{
            Connection con=DriverManager.getConnection(url,user,password);
            Statement st=con.createStatement();
            st.addBatch("INSERT INTO students(name,email,marks)VALUES('varshini','varshini@gmail.com',80)");
            st.addBatch("INSERT INTO students(name,email,marks)VALUES('jeevitha','Jeevitha@gmail.com',78)");
            st.addBatch("INSERT INTO students(name,email,marks)VALUES('latha','Latha@gmail.com',69)");
            st.executeBatch();
            System.out.println("Batch insert completed!");
            con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
  