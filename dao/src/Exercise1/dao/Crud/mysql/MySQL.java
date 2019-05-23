package Exercise1.dao.Crud.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class MySQL {

   protected static String dbHost = "localhost";
   protected static String dbName = "movies_db";
   protected static String dbUser = "root";
   protected static String dbPass = "root";
   protected static String useSSL = "false";
    // This parameter allows us run stored procedures, added to the connection query.
    protected static  String procBod = "true";

   protected static Connection connection = null;

   protected static final int GET_BY_ID = 10;
   protected static final int GET_COLLECTION = 20;
   protected static final int INSERT = 10;
   protected static final int UPDATE = 20;
   protected static final int DELETE = 30;

   protected static void Connect() {

       try {
           Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException ex) {
           System.out.println("My SQL Driver not found! " + ex);
       }

       System.out.println("My SQL Driver Registered.");

       try {
           connection = DriverManager.getConnection("jdbc:mysql://" + dbHost + ":3306/" + dbName + "?useSSL=" + useSSL + "&noAccessToProcedureBodies=" + procBod, dbUser, dbPass);
       } catch (SQLException ex) {
           System.out.println("Connection failed!" + ex);
       }

       if (connection != null) {
           System.out.println("Successfully connected to MySQL DB");

       } else {
           System.out.println("Connection failed!");
       }


   }



}
