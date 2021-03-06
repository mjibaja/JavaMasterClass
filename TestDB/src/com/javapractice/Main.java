package com.javapractice;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\testjava.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS contacts (name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                                  "VALUES ('Joe', 45632, 'joe@anywhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                                  "VALUES ('Jane', 4829484, 'jane@somewhere.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                                  "VALUES ('Fido', 9038, 'dog@email.com')");

//            statement.execute("UPDATE contacts SET phone=5566789 WHERE name='Jane'");
//            statement.execute("DELETE FROM contacts WHERE name='Joe'");
            statement.execute("SELECT * FROM contacts");
            ResultSet results = statement.getResultSet();
            while(results.next()) {
                System.out.println(results.getString("name") + " " +
                                   results.getInt("phone") + " " +
                                   results.getString("email"));
            }
            results.close();

            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Algo salio mal... " + e.getMessage());
        }
    }
}
