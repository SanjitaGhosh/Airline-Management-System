package airlinemanagementsystem;

import java.sql.*;

    public class Connection_db {

        java.sql.Connection c;
        Statement s;

        public Connection_db() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem", "root", "Sanjitadadu697403");
                s = c.createStatement();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


