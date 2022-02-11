/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoyauFonctionnel;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.sql.DriverManager;
public class RequeteType {
    private String url;
    private String user;
    private String password;
    private Connection conn = null;
    private PreparedStatement prepstate = null;
    public RequeteType() throws SQLException {
        this("jdbc:oracle:thin:@im2ag-oracle.e.ujf-grenoble.fr:1521:ufrima", "vassona", "");
    }

    public RequeteType(String url, String user, String password) throws SQLException {
        this.url = url;
        this.user = user;
        this.password = password;
        try {
            Class.forName("oracle.jdbc.driver") ;
            conn = DriverManager.getConnection(url, user, password);
            SQLWarningsExceptions.printWarnings(conn);
        }
        catch( SQLException se ) {
            // Print information about SQL exceptions
            SQLWarningsExceptions.printExceptions(se);
            return;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RequeteType.class.getName()).log(Level.SEVERE, null, ex);
        }
    return;
}
        

     public PreparedStatement insert(String table, String champ) throws SQLException {
     
        String[] champSep = champ.split(",");

        String query = "INSERT INTO " + table + "(" + champ + ") VALUES (";
        System.out.println(champ);
        System.out.println(champSep);
        // Ajoute autant de ? que de champs à la requête
        for (int i = 0; i < champSep.length - 1; i++) {
            query += "?, ";
        }
        query = query + "?) ";
        System.out.println(query);
        prepstate = this.conn.prepareStatement(query);
        return prepstate;
    }
     public void close() {
     

        if (prepstate != null) {
            try {
                prepstate.close();
            } catch (SQLException ignore) {
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ignore) {
            }
        }
    }
}
