
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gulam
 */
public class Return_book extends javax.swing.JFrame {

    /**
     * Creates new form Return_book
     */
    public String id_var;
    public Return_book(String id) {
        this.id_var = id;
        initComponents();
    }
    public Return_book() {
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
        tf1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Return Book");

        tf1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tf1.setText("HEAD FIRST JAVA");
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 49, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    String url = "jdbc:mysql://localhost/library_db";
    String user = "root";
    String pwd = "";
    String find_word = tf1.getText().toUpperCase();

    String queryChack = "SELECT name FROM books WHERE name = ?";
    try (Connection conn = DriverManager.getConnection(url, user, pwd);
         PreparedStatement pstmt = conn.prepareStatement(queryChack)) {

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
            System.out.println(id_var);
            
            //globle variable for sending data{
//                    StringBuilder user_name_var_globle = null;
//                  StringBuilder book_name_var_globle= null;
//                  int day_left_var_globle = 0;
//                  int due_amt_var_globle= 0;
//                                             }
            
            
            // 1) Fetch data for the borrowed book
            String query_GetData = "SELECT * FROM borrow_books_tb WHERE user_name = ? AND book_name = ?";
            try (Connection conn_GetData = DriverManager.getConnection(url, user, pwd);
                 PreparedStatement pstmt_GetData = conn_GetData.prepareStatement(query_GetData)) {

                pstmt_GetData.setString(1, id_var);
                pstmt_GetData.setString(2, find_word);
                ResultSet rs_GetData = pstmt_GetData.executeQuery();

                if (rs_GetData.next()) { // Check if any data is found
                    String user_name_var = rs_GetData.getString("user_name");
                    String book_name_var = rs_GetData.getString("book_name");
                    int day_left_var = rs_GetData.getInt("day_left");
                    int due_amt_var = rs_GetData.getInt("due_amt");
                    
//                    //assigin values to globle variable {
//                    user_name_var_globle = new StringBuilder(user_name_var);
//                    book_name_var_globle = new StringBuilder(book_name_var);
//                    day_left_var_globle = day_left_var;
//                    due_amt_var_globle = due_amt_var;
//                    //}
                    
                    // Display the data
                    System.out.println(" user_name-> " + user_name_var +
                                       ",\nbook_name-> " + book_name_var +
                                       ",\nday_left-> " + day_left_var +
                                       ",\namt_due-> " + due_amt_var + ". ");
                        
                        //  2)Sending data to other table  {
                        try {
                            // 2. Create the PreparedStatement
                            String querySend = "INSERT INTO `return_books_tb` (`user_name`, `book_name`, `day_left`, `duw_amt`) VALUES (?, ?, ?, ?)";
                            
                            Connection conn_sendData = DriverManager.getConnection(url, user, pwd);
                            PreparedStatement pstmt_sendData = conn_sendData.prepareStatement(querySend);

                            // 3. Set the parameters
                            pstmt_sendData.setString(1, user_name_var); // User name
                            pstmt_sendData.setString(2, book_name_var); // Book name
                            pstmt_sendData.setInt(3, day_left_var);     // Days left
                            pstmt_sendData.setDouble(4, due_amt_var);   // Due amount

                            // 4. Execute the query
                            int rowsAffected = pstmt_sendData.executeUpdate();

                            if (rowsAffected > 0) {
                                System.out.println("Record inserted successfully.");
                            } else {
                                System.out.println("Failed to insert record.");
                            }

                        } catch (Exception e) {
                            System.err.println("sending error: " + e.getMessage());
                        }                        
                        //}  
                        
                        // 3) Increase Copies count 
                        try {
                            
                            String queryUpdate = "UPDATE books SET copies = copies + 1 WHERE name = ? ";
//                                                      
                            Connection conn_Update = DriverManager.getConnection(url, user, pwd);
                            PreparedStatement pstmt_Update = conn_Update.prepareStatement(queryUpdate);

                            // 3. Set the parameters
                            pstmt_Update.setString(1, book_name_var); 

                            // 4. Execute the query
                            int rowsAffected = pstmt_Update.executeUpdate();

                            if (rowsAffected > 0) {
                                System.out.println("Record Updated successfully.");
                            } else {
                                System.out.println("Failed to Updated record.");
                            }

                        } catch (Exception e) {
                            System.err.println("Update error: " + e.getMessage());
                        }                        
                        //}  
                        
                        //4)Delete from borrow books {
                            try {
                            
                            String queryDelete = "DELETE FROM borrow_books_tb WHERE user_name = ? AND book_name = ? AND day_left = ? AND due_amt = ? ORDER BY day_left ASC LIMIT 1";

//                          String queryDelete = " DELETE FROM `borrow_books_tb` WHERE user_name = ? AND book_name = ? AND day_left = ? AND due_amt = ? ";                                                    
                            Connection conn_Delete = DriverManager.getConnection(url, user, pwd);
                            PreparedStatement pstmt_Delete = conn_Delete.prepareStatement(queryDelete);

                            // 3. Set the parameters
                            pstmt_Delete.setString(1, user_name_var); 
                            pstmt_Delete.setString(2, book_name_var); 
                            pstmt_Delete.setInt(3, day_left_var); 
                            pstmt_Delete.setInt(4, due_amt_var); 

                            // 4. Execute the query
                            int rowsAffected = pstmt_Delete.executeUpdate();

                            if (rowsAffected > 0 && rowsAffected <=1) {
                                System.out.println("Record Deleted from borreded books successfully.");
                            }else if(rowsAffected <=2){
                                System.out.println("mansully add record because 2 recordes deleted=> "+user_name_var+" "+book_name_var+" "+day_left_var+" "+due_amt_var+" ");
                            }else {
                                System.out.println("Failed to delte record.");
                                System.out.println("mansully delete record => "+user_name_var+" "+book_name_var+" "+day_left_var+" "+due_amt_var+" ");
                            }

                        } catch (Exception e) {
                            System.err.println("delete error: " + e.getMessage());
                        }  
                        //}
                        
                } else {
                    JOptionPane.showMessageDialog(this, "No borrowing data found for this user and book.");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error in fetching borrow data: " + e.getMessage());
            }
            
        } else {
            JOptionPane.showMessageDialog(this, "Sorry, book not found. Try searching on the Find Books page.");
        }
        
        
        rs.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
//        btn2.setEnabled(false);
    }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

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
            java.util.logging.Logger.getLogger(Return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Return_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tf1;
    // End of variables declaration//GEN-END:variables
}
