

# JDBC 

## Introduction

- To use a JDBC we need SQL -> Structured Query Language
- We have RDBMS to handle all the data -> Relational DataBase Management System

- To handle this from the backend language we use JDBC API -> Java DataBase Connectivity

___________________

## PGAdmin 4


- In Servers -> PG 16 -> Databases


____________________

## To Connect the PGSQL - JDBC

- Steps:
    1. Import Packages
    2. Load & Register Driver
    3. Create Connection
    4. Create Statement
    5. Execute Statement
    6. Process the Results
    7. Close

______________________________

### To Read One Row of Data

```java
// Import Package
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

        String query = "SELECT * FROM public.students WHERE sid = 1";

        // Load and Reg - Not required in the Java 8+
        // Class.forName("org.postgresql.Driver");

        // Create Connection
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Created!");

        // Create Statement
        Statement st = con.createStatement();

        // Execute Statement
        ResultSet res = st.executeQuery(query);

        // Process the results
        System.out.println(res.next());

        // Close
        st.close();


    }
}

```

________________________________


### To Read All the Rows from a table

```java
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

        String query = "SELECT * FROM public.students";

        // Load and Reg - Not required in the Java 8+
        // Class.forName("org.postgresql.Driver");

        // Create Connection
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Created!");

        // Create Statement
        Statement st = con.createStatement();

        // Execute Statement
        ResultSet res = st.executeQuery(query);

        // Process the results
        while(res.next()){
            System.out.print(res.getInt(1)+ " : ");
            System.out.print(res.getString(2)+ " : ");
            System.out.println(res.getInt(3));
        }

        // Close
        st.close();
        System.out.println("Connection Closed!");

    }
}
```

_____________________________

### Prepared Statement

- To have the multiple values we entered into the Insert SQL query we use PreparedStatement

- It makes us easy to insert different column values using simple structure.


```java
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

```
_________________________






