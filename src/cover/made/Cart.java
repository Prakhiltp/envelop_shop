/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cover.made;

import static cover.made.login.username;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prakhil
 */
public class Cart extends javax.swing.JFrame {

    
    /**
     * Creates new form Cart
     */
    public Cart() {
        initComponents();
        try{
        
         String sql="select * from data where name=?";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
        com.mysql.jdbc.Statement stmt=(com.mysql.jdbc.Statement)con.createStatement();
        PreparedStatement pst=con.prepareStatement(sql);
        pst.setString(1, username);
        
        ResultSet rs = pst.executeQuery();
        while(rs.next())
        {  
            DefaultTableModel model=(DefaultTableModel)table1.getModel();
                 String valueid=rs.getString("id");
                 String value1=rs.getString("Extralarge_quantity");
                 String value2=rs.getString("large_quantity");
                 String value3=rs.getString("Medium_quantity");
                 String value4=rs.getString("Small_quantity");
                 String value5=rs.getString("Total_price");
            
            model.addRow(new Object[] {valueid,value1,value2,value3,value4,value5,});
            
            
        }
    }
    
    catch(ClassNotFoundException | SQLException e)
    {
       
    }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        home1 = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        settings = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home1.setBackground(new java.awt.Color(153, 153, 153));
        home1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home1MouseClicked(evt);
            }
        });
        jPanel2.add(home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 90, 20));

        profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        jPanel2.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 80, 20));

        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsMouseClicked(evt);
            }
        });
        jPanel2.add(settings, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 70, 20));

        about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });
        jPanel2.add(about, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 70, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cover/made/Capture1.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        table1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.gray, java.awt.Color.gray, java.awt.Color.lightGray));
        table1.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Extra Large", "Large", "Medium", "Small", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(table1);

        jLabel6.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Purchased Details");

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cover/made/505436.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jLabel6)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 1090, 730));

        jLabel13.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cover/made/wf.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 1360, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           try{
           int row=table1.getSelectedRow(); 
           String eh1=null,eh2=null,eh3=null,eh4=null;
           if(table1.getModel().getValueAt(row,1)!=null){
               eh1=table1.getModel().getValueAt(row,1).toString();
           }
           if(table1.getModel().getValueAt(row,2)!=null ){
               eh2=table1.getModel().getValueAt(row,2).toString();
           }
           if(table1.getModel().getValueAt(row,3)!=null){
           eh3=table1.getModel().getValueAt(row,3).toString();
           }
           if(table1.getModel().getValueAt(row,4)!=null){
           eh4=table1.getModel().getValueAt(row,4).toString();
           }
           String eh=table1.getModel().getValueAt(row,0).toString();
           
           int eh11=0,eh12=0,eh13=0,eh14=0;
           if(eh1!=null)
           {
               eh11=Integer.parseInt(eh1);
           }
           if(eh2!=null)
           {
               eh12=Integer.parseInt(eh2);
           }
           if(eh3!=null)
           {
               eh13=Integer.parseInt(eh3);
           }
           if(eh4!=null)
           {
               eh14=Integer.parseInt(eh4);
           }
           Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            com.mysql.jdbc.Statement stmt=(com.mysql.jdbc.Statement)con.createStatement();
            String query="select * from stock";
             PreparedStatement pst1=con.prepareStatement(query);
            ResultSet rs=pst1.executeQuery();
            if(rs.next())
            {
                String el=rs.getString("extralarge");
                String l=rs.getString("large");
                String m=rs.getString("medium");
                String s=rs.getString("small");
                int ee=Integer.parseInt(el);
                int le=Integer.parseInt(l);
                int me=Integer.parseInt(m);
                int sme= Integer.parseInt(s);
                eh11=eh11+ee;
                eh12=eh12+le;
                eh13=eh13+me;
                eh14=eh14+sme;
                String cup1=String.valueOf(eh11);
                String cup2=String.valueOf(eh12);
                String cup3=String.valueOf(eh13);
                String cup4=String.valueOf(eh14);
                String query1="update stock set extralarge=? where id=1;";
                String query2="update stock set large=? where id=1;";
                String query3="update stock set medium=? where id=1;";
                String query4="update stock set small=? where id=1;";
                PreparedStatement pst2=con.prepareStatement(query1);
                PreparedStatement pst3=con.prepareStatement(query2);
                PreparedStatement pst4=con.prepareStatement(query3);
                PreparedStatement pst5=con.prepareStatement(query4);
                pst2.setString(1, cup1);
                pst3.setString(1, cup2);
                pst4.setString(1, cup3);
                pst5.setString(1, cup4);
                pst2.execute();
                pst3.execute();
                pst4.execute();
                pst5.execute();
                
            }
             String sql ="DELETE FROM project.`data` WHERE id = ? AND `name` = ?;";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, eh);
            pst.setString(2, username);
            
            pst.execute();
            ((DefaultTableModel)table1.getModel()).removeRow(row);
       }catch(NumberFormatException | SQLException e)
       {
           
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void home1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home1MouseClicked
       home h=new home();
       h.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_home1MouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            com.mysql.jdbc.Statement stmt=(com.mysql.jdbc.Statement)con.createStatement();
            String sql12="update reminder set profilep=1 where id=1;";
                        PreparedStatement ps12=con.prepareStatement(sql12);
                        ps12.execute();
           
       home h=new home();
       h.setVisible(true);
       this.setVisible(false);
       }
       catch(ClassNotFoundException | SQLException e){}
       
    }//GEN-LAST:event_profileMouseClicked

    private void settingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsMouseClicked
    try{
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            com.mysql.jdbc.Statement stmt=(com.mysql.jdbc.Statement)con.createStatement();
            String sql12="update reminder set settings1=1 where id=1;";
                        PreparedStatement ps12=con.prepareStatement(sql12);
                        ps12.execute();
        home h=new home();
       h.setVisible(true);
       this.setVisible(false);
    }catch(ClassNotFoundException | SQLException e){}
    }//GEN-LAST:event_settingsMouseClicked

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
      try{
          Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            com.mysql.jdbc.Statement stmt=(com.mysql.jdbc.Statement)con.createStatement();
            String sql12="update reminder set settings1=1 where id=1;";
                        PreparedStatement ps12=con.prepareStatement(sql12);
                        ps12.execute();
        home h=new home();
       h.setVisible(true);
       this.setVisible(false); 
      }catch(ClassNotFoundException | SQLException e){}
    }//GEN-LAST:event_aboutMouseClicked

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
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Cart().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JLabel home1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel settings;
    private javax.swing.JTable table1;
    // End of variables declaration//GEN-END:variables
}
