/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gulam
 */
public class DashBord extends javax.swing.JFrame {

    /**
     * Creates new form DashBord
     */
    public DashBord() {
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

        jLabel1 = new javax.swing.JLabel();
        book_available = new javax.swing.JButton();
        remove_book = new javax.swing.JButton();
        add_book = new javax.swing.JButton();
        fire_staff = new javax.swing.JButton();
        hire_staff = new javax.swing.JButton();
        staff_detail = new javax.swing.JButton();
        dashBord_edit_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dash bord");

        book_available.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        book_available.setText("Books Available");
        book_available.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book_availableActionPerformed(evt);
            }
        });

        remove_book.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        remove_book.setText("Remove Book");
        remove_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_bookActionPerformed(evt);
            }
        });

        add_book.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_book.setText("Add Book");
        add_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bookActionPerformed(evt);
            }
        });

        fire_staff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fire_staff.setText("Fire Staff");
        fire_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fire_staffActionPerformed(evt);
            }
        });

        hire_staff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hire_staff.setText("Hire Staff");
        hire_staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hire_staffActionPerformed(evt);
            }
        });

        staff_detail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        staff_detail.setText("Staff Detail");
        staff_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staff_detailActionPerformed(evt);
            }
        });

        dashBord_edit_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dashBord_edit_btn.setText("Edir");
        dashBord_edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashBord_edit_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(book_available, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(remove_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(staff_detail, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(hire_staff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fire_staff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(dashBord_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(book_available, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add_book, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(remove_book, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(staff_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hire_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fire_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(dashBord_edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void book_availableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_availableActionPerformed
        // TODO add your handling code here:
        Books_Avialable books = new Books_Avialable();
        books.setVisible(true);
        
    }//GEN-LAST:event_book_availableActionPerformed

    private void remove_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remove_bookActionPerformed

    private void add_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bookActionPerformed
        // TODO add your handling code here:
        Add_Books ad_obj = new Add_Books();
        ad_obj.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_add_bookActionPerformed

    private void fire_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fire_staffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fire_staffActionPerformed

    private void hire_staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hire_staffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hire_staffActionPerformed

    private void staff_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staff_detailActionPerformed
        // TODO add your handling code here:
        Staff_Details staff_details_obj = new Staff_Details();
        staff_details_obj.setVisible(true);
//           this.dispose();
    }//GEN-LAST:event_staff_detailActionPerformed

    private void dashBord_edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashBord_edit_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dashBord_edit_btnActionPerformed

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
            java.util.logging.Logger.getLogger(DashBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_book;
    private javax.swing.JButton book_available;
    private javax.swing.JButton dashBord_edit_btn;
    private javax.swing.JButton fire_staff;
    private javax.swing.JButton hire_staff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton remove_book;
    private javax.swing.JButton staff_detail;
    // End of variables declaration//GEN-END:variables
}
