
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gulam
 */
public class Borrow_books_bage extends javax.swing.JFrame {

    /**
     * Creates new form Borrow_books_bage
     */
    public String userDash_id;
    public Borrow_books_bage(String id_) {
        this.userDash_id = id_;
        initComponents();
    }
    public Borrow_books_bage() {
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
        jLabel2 = new javax.swing.JLabel();
        book_n_val = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        b_n_var = new javax.swing.JLabel();
        no_of_days = new javax.swing.JTextField();
        u_l_var = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Borrow Book");

        btn1.setText("Search");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setText("ok");
        btn2.setEnabled(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        b_n_var.setText("book_name");

        u_l_var.setText("User_name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(book_n_val, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(u_l_var, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b_n_var, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(no_of_days, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(book_n_val, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(no_of_days, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_n_var, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(u_l_var, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:

    String url = "jdbc:mysql://localhost/library_db";
    String user = "root";
    String pwd = "";
    String find_word = book_n_val.getText().toUpperCase();

    String query = "SELECT name FROM books WHERE name = ?";

    try (Connection conn = DriverManager.getConnection(url, user, pwd);
         PreparedStatement pstmt = conn.prepareStatement(query)) {

        pstmt.setString(1, find_word);

        ResultSet rs = pstmt.executeQuery();
        boolean found = false;
        
        //  HEAD FIRST JAVA 
        while (rs.next()) {
            String name = rs.getString("name");
            JOptionPane.showMessageDialog(this, "This book is aviable:- "+name);
//            model.addRow(new Object[]{ name});  
            found = true;
        }
        if (found) {
            u_l_var.setText(userDash_id);
            b_n_var.setText(find_word);
            btn2.setEnabled(true); // Enable btn2 when book is found
        } else {
            JOptionPane.showMessageDialog(this, "Sorry, book not found. try to find it on find books page it has better seo ");
            btn2.setEnabled(false); // Ensure btn2 remains disabled
        }
        
        
        rs.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
        btn2.setEnabled(false);
    }

    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
     String url = "jdbc:mysql://localhost/library_db";
    String user = "root";
    String pwd = "";

    // Insert query for borrow_books_tb
    String query = "INSERT INTO borrow_books_tb (user_name, book_name, day_left, due_amt) VALUES (?, ?, ?, ?)";

    // Update query to decrease book copies
    String updateQuery = "UPDATE books SET copies = copies - 1 WHERE name = ? AND copies > 0";

    String user_name = u_l_var.getText().toUpperCase();
    String book_name = b_n_var.getText().toUpperCase();
    int days = Integer.parseInt(no_of_days.getText());

    if (days > 14) {
        JOptionPane.showMessageDialog(this, "More than 14 days is not allowed. Auto-set to 14 days.");
        days = 14;
    }

    int due = 0;

    try (Connection conn = DriverManager.getConnection(url, user, pwd);
         PreparedStatement stm = conn.prepareStatement(query);
         PreparedStatement updateStm = conn.prepareStatement(updateQuery)) {

        // Insert borrow record
        stm.setString(1, user_name);
        stm.setString(2, book_name);
        stm.setInt(3, days);
        stm.setInt(4, due);

        int rows = stm.executeUpdate();
        
        if (rows > 0) {
            // Update book copies
            updateStm.setString(1, book_name);
            int updatedRows = updateStm.executeUpdate();

            if (updatedRows > 0) {
                JOptionPane.showMessageDialog(this, "One Book Borrowed! Copies updated.");
            } else {
                JOptionPane.showMessageDialog(this, "Book borrowed, but copies were not updated (possibly 0 left).");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Failed to borrow the book.");
        }

        u_l_var.setText(null);
        b_n_var.setText(null);
        no_of_days.setText(null);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
    }
    }//GEN-LAST:event_btn2ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Borrow_books_bage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Borrow_books_bage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Borrow_books_bage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Borrow_books_bage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Borrow_books_bage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b_n_var;
    private javax.swing.JTextField book_n_val;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField no_of_days;
    private javax.swing.JLabel u_l_var;
    // End of variables declaration//GEN-END:variables
}
