/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NoyauFonctionnel;

import java.sql.*;
import java.util.ArrayList;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class RequeteType {
    private String url;
    private String user;
    private String password;
    private Connection conn = null;
    private PreparedStatement prepstate = null;
    private ResultSet result = null;
    private Statement state = null;
    public RequeteType() throws SQLException {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sir", "admin", "macarel");
            SQLWarningsExceptions.printWarnings(conn);
        }
        catch( SQLException se ) {
            // Print information about SQL exceptions
            SQLWarningsExceptions.printExceptions(se);
            return;
        //} catch (ClassNotFoundException ex) {
         //   Logger.getLogger(RequeteType.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public RequeteType(String url, String user, String password) throws SQLException {
        this.url = url;
        this.user = user;
        this.password = password;
        try {
            //Class.forName("com.mysql.jdbc.driver") ;
            conn = DriverManager.getConnection(url, user, password);
            SQLWarningsExceptions.printWarnings(conn);
        }
        catch( SQLException se ) {
            // Print information about SQL exceptions
            SQLWarningsExceptions.printExceptions(se);
            return;
        //} catch (ClassNotFoundException ex) {
         //   Logger.getLogger(RequeteType.class.getName()).log(Level.SEVERE, null, ex);
        }
    return;
}
        

     public PreparedStatement insert(String table, String champ) throws SQLException {
     
        String[] champSep = champ.split(",");

        String query = "INSERT INTO " + table + "(" + champ + ") VALUES (";
        System.out.println(champ);
        System.out.println(champSep);

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
     public ResultSet select(String query) { //A REVOIR ! LA METHODE NE FONCTIONNE PAS
        try {
            //Création d'un objet statement 
            state = this.conn.createStatement();

            //On execute la SQL Query
            result = state.executeQuery(query);
            System.out.println("fin de la requete");
            return result;
        } catch (SQLException e) {
            Logger.getLogger(RequeteType.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("exception " + e.getMessage());
        }
        return null;
    }
     
    public void deconnexion(){
        this.conn = null;
    }   
}
