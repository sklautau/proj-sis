package Interface;


import library.interfaces.Patient;
import library.interfaces.PatientLocation;
import library.interfaces.ServeurHL7;
import library.structure.groupe.messages.Message;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrameServeur.java
 *
 * Created on 19 févr. 2009, 19:33:01
 */
/**
 *
 * @author Anthony CROUZET Polytech'Grenoble TIS3
 */
public class FrameServeur_adaptation extends javax.swing.JFrame {

    private Patient patient;
    private Message message;
    private ServeurHL7 c;

    /** Creates new form FrameServeur */
    public FrameServeur_adaptation() {
        initComponents();
        this.patient = null;
        this.message = null;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panelConexion = new javax.swing.JPanel();
        panelPatient1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        fieldPort = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        labelFin = new javax.swing.JLabel();
        labelFin1 = new javax.swing.JLabel();
        labelFin2 = new javax.swing.JLabel();
        labelFin3 = new javax.swing.JLabel();
        labelFin4 = new javax.swing.JLabel();
        labelFin5 = new javax.swing.JLabel();
        labelFin6 = new javax.swing.JLabel();
        labelFin7 = new javax.swing.JLabel();
        labelFin8 = new javax.swing.JLabel();
        labelFin9 = new javax.swing.JLabel();
        labelFin10 = new javax.swing.JLabel();
        labelFin11 = new javax.swing.JLabel();
        labelFin12 = new javax.swing.JLabel();
        labelFin13 = new javax.swing.JLabel();
        labelFin14 = new javax.swing.JLabel();
        labelFin15 = new javax.swing.JLabel();
        labelFin16 = new javax.swing.JLabel();
        labelFin17 = new javax.swing.JLabel();
        labelFin18 = new javax.swing.JLabel();
        labelFin19 = new javax.swing.JLabel();
        labelFin20 = new javax.swing.JLabel();
        labelFin21 = new javax.swing.JLabel();
        labelFin22 = new javax.swing.JLabel();
        labelFin23 = new javax.swing.JLabel();
        labelFin24 = new javax.swing.JLabel();
        labelFin25 = new javax.swing.JLabel();
        labelFin26 = new javax.swing.JLabel();
        labelFin27 = new javax.swing.JLabel();
        labelFin28 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelConexion.setPreferredSize(new java.awt.Dimension(467, 557));
        panelConexion.setLayout(new java.awt.GridBagLayout());

        panelPatient1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelPatient1.setLayout(new java.awt.GridBagLayout());

        jLabel12.setFont(new java.awt.Font("Lucida Sans", 1, 16)); // NOI18N
        jLabel12.setText("Connexion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        panelPatient1.add(jLabel12, gridBagConstraints);

        jLabel14.setText("Port :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        panelPatient1.add(jLabel14, gridBagConstraints);

        fieldPort.setMinimumSize(new java.awt.Dimension(48, 20));
        fieldPort.setPreferredSize(new java.awt.Dimension(48, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 0, 4, 4);
        panelPatient1.add(fieldPort, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        panelConexion.add(panelPatient1, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setLabel("Connexion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setLabel("Déconnexion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .add(27, 27, 27)
                .add(jButton3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 127, Short.MAX_VALUE)
                .add(jButton2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton2)
                    .add(jButton3))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        panelConexion.add(jPanel2, gridBagConstraints);

        jPanel5.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin11, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin12, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin13, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin14, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin15, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin16, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin17, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin18, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin19, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin20, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin21, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin22, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin23, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin24, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin25, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin26, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin27, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        jPanel5.add(labelFin28, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 4, 5, 4);
        panelConexion.add(jPanel5, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Service de chirurgie cardiaque");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        panelConexion.add(jLabel1, gridBagConstraints);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 550, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(panelConexion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 550, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 557, Short.MAX_VALUE)
            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(layout.createSequentialGroup()
                    .add(0, 0, Short.MAX_VALUE)
                    .add(panelConexion, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Integer port = Integer.parseInt(this.fieldPort.getText());
        c = new ServeurHL7();
        c.connection(port);
        c.ecoute();
        String messageHL7 = c.protocole();
        
        System.out.println("Reçu :" + messageHL7);
        this.patient = c.getPatient();
        this.message = c.getMessage();

        this.labelFin.setText(this.message.getType());
        this.labelFin1.setText("Classe Patient: " + patient.getPatClass());
        this.labelFin2.setText("Id Patient :" + patient.getID());
        this.labelFin3.setText("Nom : " + patient.getFamillyName());

        if (patient.getFirstName() != null) {
            this.labelFin4.setText("Prénom : " + patient.getFirstName());
        }

        if (patient.getBirth() != null) {
            this.labelFin5.setText("Né le : " + patient.getBirth().toString());
        }

        if (patient.getSex() != null) {
            this.labelFin6.setText("Sexe : " + patient.getSex());
        }

        if (!(patient.getValueDeath()).equals("")) {
            this.labelFin7.setText("Décès : " + patient.getValueDeath());

            if (patient.getDeath() != null) {
                this.labelFin8.setText("Décédé le: " + patient.getDeath().toString());
            }
        }

        // if (patient.getDateDicharge() != null) {
        // this.labelFin9.setText("Admi le: " + patient.get());
        //}

        if (patient.getDateDicharge() != null) {
            System.out.println("patient.getDateDicharge() != null");
            this.labelFin10.setText("Sorti le: " + patient.getDateDicharge());
        }

        if (patient.getAssignedPatLocation() != null) {
            this.labelFin11.setText("-------- Localisation --------");

            PatientLocation locPat = patient.getAssignedPatLocation();
            if (locPat.getPointOfCare() != null) {
                this.labelFin12.setText("Point Of Care: " + locPat.getPointOfCare());
            }
            if (locPat.getBuilding() != null) {
                this.labelFin13.setText("Bâtiment : " + locPat.getBuilding());
            }
            if (locPat.getFloor() != null) {
                this.labelFin14.setText("Étage: " + locPat.getFloor());
            }
            if (locPat.getRoom() != null) {
                this.labelFin15.setText("Chambre: " + locPat.getRoom());
            }

            if (locPat.getBed() != null) {
                this.labelFin16.setText("Lit: " + locPat.getBed());
            }
            if (locPat.getStatus() != null) {
                this.labelFin17.setText("Status: " + locPat.getStatus());
            }
            if (locPat.getPersonLocationType().length() > 0) {
                this.labelFin18.setText("Type: " + locPat.getPersonLocationType());
            }

        }
        if (patient.getPriorPatLocation() != null) {
            this.labelFin19.setText("-------- Anciene localisation --------");
            PatientLocation locPat = patient.getPriorPatLocation();
            if (locPat.getPointOfCare() != null) {
                this.labelFin20.setText("Point Of Care: " + locPat.getPointOfCare());
            }
            if (locPat.getBuilding() != null) {
                this.labelFin21.setText("Bâtiment : " + locPat.getBuilding());
            }
            if (locPat.getFloor() != null) {
                this.labelFin22.setText("Étage: " + locPat.getFloor());
            }
            if (locPat.getRoom() != null) {
                this.labelFin23.setText("Chambre: " + locPat.getRoom());
            }

            if (locPat.getBed() != null) {
                this.labelFin24.setText("Lit: " + locPat.getBed());
            }

            if (locPat.getStatus() != null) {
                this.labelFin25.setText("Status: " + locPat.getStatus());
            }
            if (locPat.getPersonLocationType().length() > 0) {
                this.labelFin26.setText("Type: " + locPat.getPersonLocationType());
            }
        }


}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.c.fermer();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrameServeur_adaptation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField fieldPort;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel labelFin;
    private javax.swing.JLabel labelFin1;
    private javax.swing.JLabel labelFin10;
    private javax.swing.JLabel labelFin11;
    private javax.swing.JLabel labelFin12;
    private javax.swing.JLabel labelFin13;
    private javax.swing.JLabel labelFin14;
    private javax.swing.JLabel labelFin15;
    private javax.swing.JLabel labelFin16;
    private javax.swing.JLabel labelFin17;
    private javax.swing.JLabel labelFin18;
    private javax.swing.JLabel labelFin19;
    private javax.swing.JLabel labelFin2;
    private javax.swing.JLabel labelFin20;
    private javax.swing.JLabel labelFin21;
    private javax.swing.JLabel labelFin22;
    private javax.swing.JLabel labelFin23;
    private javax.swing.JLabel labelFin24;
    private javax.swing.JLabel labelFin25;
    private javax.swing.JLabel labelFin26;
    private javax.swing.JLabel labelFin27;
    private javax.swing.JLabel labelFin28;
    private javax.swing.JLabel labelFin3;
    private javax.swing.JLabel labelFin4;
    private javax.swing.JLabel labelFin5;
    private javax.swing.JLabel labelFin6;
    private javax.swing.JLabel labelFin7;
    private javax.swing.JLabel labelFin8;
    private javax.swing.JLabel labelFin9;
    private javax.swing.JPanel panelConexion;
    private javax.swing.JPanel panelPatient1;
    // End of variables declaration//GEN-END:variables
}
