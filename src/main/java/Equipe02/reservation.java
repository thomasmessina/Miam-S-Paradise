/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miamsparadise;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ruban
 */
public class reservation extends javax.swing.JFrame {

    /**
     * Creates new form reservation
     */
    public reservation() {
         this.setUndecorated(true);      
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        reservationlabel = new javax.swing.JLabel();
        nbcouvlabel = new javax.swing.JLabel();
        nbtablelabel = new javax.swing.JLabel();
        heurelabel = new javax.swing.JLabel();
        datelabel = new javax.swing.JLabel();
        serveurlabel = new javax.swing.JLabel();
        nomlabel = new javax.swing.JLabel();
        serveur = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        reserver = new javax.swing.JButton();
        nbcouverts = new javax.swing.JTextField();
        ntable = new javax.swing.JTextField();
        heure = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btnmenus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        fond = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nom client", "Serveur", "Date ", "Heure", "Numéro table", "Nombre de couverts"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Long.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 240, 1420, 860));

        reservationlabel.setBackground(new java.awt.Color(51, 51, 51));
        reservationlabel.setFont(new java.awt.Font("Noto Sans", 0, 40)); // NOI18N
        reservationlabel.setText("Réservation");
        getContentPane().add(reservationlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 32, -1, -1));

        nbcouvlabel.setBackground(new java.awt.Color(51, 51, 51));
        nbcouvlabel.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        nbcouvlabel.setText("Nombre de couverts");
        getContentPane().add(nbcouvlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1458, 113, -1, -1));

        nbtablelabel.setBackground(new java.awt.Color(51, 51, 51));
        nbtablelabel.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        nbtablelabel.setText("Numéro table");
        getContentPane().add(nbtablelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1269, 113, -1, -1));

        heurelabel.setBackground(new java.awt.Color(51, 51, 51));
        heurelabel.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        heurelabel.setText("Heure");
        getContentPane().add(heurelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1084, 113, -1, -1));

        datelabel.setBackground(new java.awt.Color(51, 51, 51));
        datelabel.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        datelabel.setText("Date");
        getContentPane().add(datelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(863, 113, -1, -1));

        serveurlabel.setBackground(new java.awt.Color(51, 51, 51));
        serveurlabel.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        serveurlabel.setText("Serveur");
        getContentPane().add(serveurlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 113, -1, -1));

        nomlabel.setBackground(new java.awt.Color(51, 51, 51));
        nomlabel.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        nomlabel.setText("Nom client");
        getContentPane().add(nomlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 113, -1, -1));

        serveur.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        serveur.setPreferredSize(new java.awt.Dimension(186, 45));
        getContentPane().add(serveur, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 152, 186, 45));

        nom.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        nom.setPreferredSize(new java.awt.Dimension(186, 45));
        nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomActionPerformed(evt);
            }
        });
        getContentPane().add(nom, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 152, 186, 45));

        date.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        date.setPreferredSize(new java.awt.Dimension(186, 45));
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(802, 152, 186, 45));

        reserver.setBackground(new java.awt.Color(247, 244, 227));
        reserver.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruban\\OneDrive\\Bureau\\btnreserv.png")); // NOI18N
        reserver.setBorder(null);
        reserver.setContentAreaFilled(false);
        reserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserverActionPerformed(evt);
            }
        });
        getContentPane().add(reserver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1686, 152, -1, -1));

        nbcouverts.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        nbcouverts.setPreferredSize(new java.awt.Dimension(186, 45));
        getContentPane().add(nbcouverts, new org.netbeans.lib.awtextra.AbsoluteConstraints(1465, 152, 186, 45));

        ntable.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        ntable.setPreferredSize(new java.awt.Dimension(186, 45));
        getContentPane().add(ntable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1244, 152, 186, 45));

        heure.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        heure.setPreferredSize(new java.awt.Dimension(186, 45));
        getContentPane().add(heure, new org.netbeans.lib.awtextra.AbsoluteConstraints(1023, 152, 186, 45));

        jPanel1.setBackground(new java.awt.Color(247, 244, 227));
        jPanel1.setPreferredSize(new java.awt.Dimension(284, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruban\\OneDrive\\Bureau\\LOGOMENUS.png")); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 150));

        btnmenus.setBackground(new java.awt.Color(247, 244, 227));
        btnmenus.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruban\\OneDrive\\Bureau\\Menus.png")); // NOI18N
        btnmenus.setBorder(null);
        btnmenus.setContentAreaFilled(false);
        btnmenus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnmenusMouseClicked(evt);
            }
        });
        btnmenus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none(evt);
            }
        });
        jPanel1.add(btnmenus, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 225, -1, -1));

        jButton1.setBackground(new java.awt.Color(247, 244, 227));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruban\\OneDrive\\Bureau\\reservationblanc.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 400, -1, -1));

        jButton3.setBackground(new java.awt.Color(247, 244, 227));
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruban\\OneDrive\\Bureau\\sallebouton.png")); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 560, -1, -1));

        jButton4.setBackground(new java.awt.Color(247, 244, 227));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruban\\OneDrive\\Bureau\\stockbouton.png")); // NOI18N
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 720, -1, -1));

        jButton5.setBackground(new java.awt.Color(247, 244, 227));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruban\\OneDrive\\Bureau\\decobouton.png")); // NOI18N
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 960, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        fond.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        fond.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ruban\\OneDrive\\Bureau\\fond.png")); // NOI18N
        getContentPane().add(fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getAccessibleContext().setAccessibleName("reservationframe");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void none(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    private void reserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reserverActionPerformed

    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void btnmenusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmenusMouseClicked
    this.setVisible(false);
        new menus().setVisible(true);
    }//GEN-LAST:event_btnmenusMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnmenus;
    public javax.swing.JTextField date;
    public javax.swing.JLabel datelabel;
    public javax.swing.JLabel fond;
    public javax.swing.JTextField heure;
    public javax.swing.JLabel heurelabel;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    public javax.swing.JLabel logo;
    public javax.swing.JTextField nbcouverts;
    public javax.swing.JLabel nbcouvlabel;
    public javax.swing.JLabel nbtablelabel;
    public javax.swing.JTextField nom;
    public javax.swing.JLabel nomlabel;
    public javax.swing.JTextField ntable;
    public javax.swing.JLabel reservationlabel;
    public javax.swing.JButton reserver;
    public javax.swing.JTextField serveur;
    public javax.swing.JLabel serveurlabel;
    // End of variables declaration//GEN-END:variables
}