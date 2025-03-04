import java.sql.*;


public class DemoJDBC {

    public static void main(String[] args) throws Exception {
        /*
        * Import package - java.sql.*
        * Load and register
        * Create Connection
        * Create Statement
        * Execute Statement
        * Process the Results
        * Close
        *
        * */

        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "12345678";

        String queryInsert = "INSERT INTO public.students VALUES (?,?,?)";

        String querySelectAll = "SELECT * FROM public.students";

        // Load and Reg - Not required in the Java 8+
        // Class.forName("org.postgresql.Driver");

        // Create Connection
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Created!");

        // Create Statement - Prepared Statement
        PreparedStatement prest = con.prepareStatement(queryInsert);

        // Insert Begins
        // Execute Statement
        prest.setInt(1,10);
        prest.setString(2, "rohit");
        prest.setInt(3, 72);

        prest.execute();
        //Insert Ends

        // Statement close
        prest.close();

        System.out.println("Connection Closed!");

    }
}
