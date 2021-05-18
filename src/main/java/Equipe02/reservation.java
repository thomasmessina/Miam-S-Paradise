/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equipe02;

//import Equipe02.dao.ReservationDao;
import Equipe02.dao.ReservationDao;
import Equipe02.models.ReservationModel;
import com.mysql.cj.xdevapi.Table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Ruban
 */
public class Reservation extends javax.swing.JFrame {

    private Object id = 1;


    /**
     * Creates new form reservation
     */
    public Reservation() {
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
        fond = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        menus = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btnmenuon = new javax.swing.JButton();
        btnreserv = new javax.swing.JButton();
        btnsalle = new javax.swing.JButton();
        btnstock = new javax.swing.JButton();
        btndeco = new javax.swing.JButton();

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
        reserver.setBorder(null);
        reserver.setContentAreaFilled(false);
        reserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserverActionPerformed(evt);
            }
        });
        getContentPane().add(reserver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1670, 140, 180, 60));

        nbcouverts.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        nbcouverts.setPreferredSize(new java.awt.Dimension(186, 45));
        getContentPane().add(nbcouverts, new org.netbeans.lib.awtextra.AbsoluteConstraints(1465, 152, 186, 45));

        ntable.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        ntable.setPreferredSize(new java.awt.Dimension(186, 45));
        getContentPane().add(ntable, new org.netbeans.lib.awtextra.AbsoluteConstraints(1244, 152, 186, 45));

        heure.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        heure.setPreferredSize(new java.awt.Dimension(186, 45));
        getContentPane().add(heure, new org.netbeans.lib.awtextra.AbsoluteConstraints(1023, 152, 186, 45));

        fond.setFont(new java.awt.Font("Noto Sans", 0, 20)); // NOI18N
        getContentPane().add(fond, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, nom.getText(), null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id réservation", "Date", "Heure", "Nom client"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        menus.setBackground(new java.awt.Color(247, 244, 227));
        menus.setPreferredSize(new java.awt.Dimension(284, 1080));

        logo.setIcon(new javax.swing.ImageIcon("D:\\Cours\\Java\\Miam-S-Paradise\\src\\images\\LOGOMENUS.png")); // NOI18N

        btnmenuon.setBackground(new java.awt.Color(247, 244, 227));
        btnmenuon.setIcon(new javax.swing.ImageIcon("D:\\Cours\\Java\\Miam-S-Paradise\\src\\images\\Menus.png")); // NOI18N
        btnmenuon.setBorder(null);
        btnmenuon.setContentAreaFilled(false);
        btnmenuon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuonActionPerformed(evt);
            }
        });

        btnreserv.setBackground(new java.awt.Color(247, 244, 227));
        btnreserv.setIcon(new javax.swing.ImageIcon("D:\\Cours\\Java\\Miam-S-Paradise\\src\\images\\reservbouton.png")); // NOI18N
        btnreserv.setBorder(null);
        btnreserv.setContentAreaFilled(false);
        btnreserv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnreservMouseClicked(evt);
            }
        });
        btnreserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreservActionPerformed(evt);
            }
        });

        btnsalle.setBackground(new java.awt.Color(247, 244, 227));
        btnsalle.setIcon(new javax.swing.ImageIcon("D:\\Cours\\Java\\Miam-S-Paradise\\src\\images\\sallebouton.png")); // NOI18N
        btnsalle.setBorder(null);
        btnsalle.setContentAreaFilled(false);
        btnsalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalleActionPerformed(evt);
            }
        });

        btnstock.setBackground(new java.awt.Color(247, 244, 227));
        btnstock.setIcon(new javax.swing.ImageIcon("D:\\Cours\\Java\\Miam-S-Paradise\\src\\images\\stockbouton.png")); // NOI18N
        btnstock.setBorder(null);
        btnstock.setContentAreaFilled(false);
        btnstock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstockActionPerformed(evt);
            }
        });

        btndeco.setBackground(new java.awt.Color(247, 244, 227));
        btndeco.setIcon(new javax.swing.ImageIcon("D:\\Cours\\Java\\Miam-S-Paradise\\src\\images\\decobtn2.png")); // NOI18N
        btndeco.setBorder(null);
        btndeco.setContentAreaFilled(false);
        btndeco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndecoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menusLayout = new javax.swing.GroupLayout(menus);
        menus.setLayout(menusLayout);
        menusLayout.setHorizontalGroup(
            menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menusLayout.createSequentialGroup()
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menusLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmenuon)
                    .addComponent(btnreserv)
                    .addComponent(btnsalle)
                    .addComponent(btnstock)
                    .addComponent(btndeco))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menusLayout.setVerticalGroup(
            menusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menusLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnmenuon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnreserv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnstock)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btndeco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(menus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getAccessibleContext().setAccessibleName("reservationframe");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private String url;
    private String username;
    private String password;

        
    
    private void reserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserverActionPerformed

    try{
        String url = "jdbc:mysql://mysql-thomas-messina.alwaysdata.net:3306/thomas-messina_miamsparadise";
        String username = "194765";
        String password = "MiamSParadise";
        Connection connection = DriverManager.getConnection(url, username, password);
        
    
           
        ReservationModel reservation = new ReservationModel();
        reservation.setNomClient(nom.getText());
        reservation.setNomClient(serveur.getText());
        reservation.setDate(date.getText());
        reservation.setHeure(heure.getText());
        reservation.setNomClient(ntable.getText());
        reservation.setNomClient(nbcouverts.getText());


        ReservationDao reservationDao = new ReservationDao(url, username, password);
        reservationDao.saveReservation(reservation);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
 
    }//GEN-LAST:event_reserverActionPerformed
    private void nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void btnmenuonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuonActionPerformed
        this.setVisible(false);
        new menus().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnmenuonActionPerformed

    private void btnreservMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnreservMouseClicked

        this.setVisible(false);
        new Reservation().setVisible(true);
    }//GEN-LAST:event_btnreservMouseClicked

    private void btnreservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreservActionPerformed
        this.setVisible(false);
        new Reservation().setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_btnreservActionPerformed

    private void btnsalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalleActionPerformed
        this.setVisible(false);
        new gestionsalle().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnsalleActionPerformed

    private void btnstockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstockActionPerformed
        this.setVisible(false);
        new gestionstock().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnstockActionPerformed

    private void btndecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndecoMouseClicked
        this.dispose();
    }//GEN-LAST:event_btndecoMouseClicked

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
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
      

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btndeco;
    public javax.swing.JButton btnmenuon;
    public javax.swing.JButton btnreserv;
    public javax.swing.JButton btnsalle;
    public javax.swing.JButton btnstock;
    public javax.swing.JTextField date;
    public javax.swing.JLabel datelabel;
    public javax.swing.JLabel fond;
    public javax.swing.JTextField heure;
    public javax.swing.JLabel heurelabel;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JLabel logo;
    public javax.swing.JPanel menus;
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
