/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NoyauFonctionnel;

/**
 *
 * @author Arthur
 */
public class Session {
    private String user;
    private String mdp;
    
    public Session(String user, String mdp){
        this.user = user;
        this.mdp = mdp;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @return the mdp
     */
    public String getMdp() {
        return mdp;
    }
}
