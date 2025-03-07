
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
    import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gulam
 */
public class User_Books_Aviable extends javax.swing.JFrame {

    /**
     * Creates new form User_Books_Aviable
     */
    public User_Books_Aviable() {
        initComponents();
         BackgroundPanel bgPanel = new BackgroundPanel(); 
        setContentPane(bgPanel);
        
        GridBagLayout layout = new GridBagLayout();
        getContentPane().setLayout(layout);

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.CENTER;  // Align to top

        c.insets = new Insets(30, 0, 0, 0);
        c.weightx = 1.0;
        c.weighty = 1.0;

        getContentPane().add(jPanel1, c);

        setExtendedState(JFrame.MAXIMIZED_BOTH); // Maximize the window
        this.getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBackground(new Color(255, 255, 255)); // white bg
        jPanel1.setBorder(new LineBorder(new java.awt.Color(0,0,0,0), 1, true));
        
        for (Component btns : jPanel1.getComponents()) {
            if (btns instanceof JButton) {
                JButton btn = (JButton) btns;
                btn.setBackground(new java.awt.Color(10, 46, 161));
                btn.setForeground(Color.WHITE);
                btn.setBorderPainted(false); // Removes border effect
                btn.setContentAreaFilled(false); // Removes lighting effect
                btn.setOpaque(true);
            }
        }
        for (Component inpts : jPanel1.getComponents()) {
            if (inpts instanceof JTextField) {
                JTextField txt = (JTextField) inpts;
                txt.setBackground(new java.awt.Color(213, 213, 245));
                txt.setForeground(Color.BLACK);
                txt.setOpaque(true); // Makes background solid

                Border simpleBorder = BorderFactory.createLineBorder(new java.awt.Color(213, 213, 245), 1, true);
                txt.setBorder(simpleBorder);
            }
        }
        for (Component labs : jPanel1.getComponents()) {
            if (labs instanceof JLabel) { // Assuming 'labels' is a JLabel
                JLabel txt = (JLabel) labs;
                txt.setForeground(Color.BLACK);
                txt.setBackground(new Color(0, 0, 0, 0));
                txt.setOpaque(true); // Makes background solid

            }
        }
        // tables things are here
//        customizeTable();

    }
    


//private void customizeTable() {
//    // Remove default Metal look and feel
//    try {
//        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//
//    JTableHeader header = table.getTableHeader();
//    
//    // Header: Dark Blue Background, White Text
//    header.setFont(new Font("Segoe UI", Font.BOLD, 14));
//    header.setBackground(new Color(10, 46, 161)); // Dark Blue
//    header.setForeground(Color.WHITE);
//    header.setOpaque(true);
//
//    table.setFont(new Font("Segoe UI", Font.PLAIN, 14));
//    table.setRowHeight(30);
//    table.setShowGrid(false);
//    table.setIntercellSpacing(new Dimension(0, 0));
//
//    // Custom renderer for alternate row colors (including "COPIES" column)
//    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
//        @Override
//        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//            Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//            
//            // Alternate row colors for all columns
//            if (!isSelected) {
//                if (row % 2 == 0) {
//                    cell.setBackground(new Color(220, 220, 255)); // Light Blue
//                } else {
//                    cell.setBackground(Color.WHITE);
//                }
//                cell.setForeground(Color.BLACK);
//            } else {
//                // Selection color (Dark Blue)
//                cell.setBackground(new Color(10, 46, 161));
//                cell.setForeground(Color.WHITE);
//            }
//            
//            return cell;
//        }
//    };
//
//    // Apply renderer to all columns (Fixing "COPIES" column issue)
//    for (int i = 0; i < table.getColumnCount(); i++) {
//        table.getColumnModel().getColumn(i).setCellRenderer(renderer);
//    }
//
//    // Set column width
//    TableColumnModel columnModel = table.getColumnModel();
//    columnModel.getColumn(0).setPreferredWidth(100);
//    columnModel.getColumn(1).setPreferredWidth(200);
//    columnModel.getColumn(2).setPreferredWidth(150);
//    columnModel.getColumn(3).setPreferredWidth(80);
//
//    // Center align "COPIES" column
//    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
//    centerRenderer.setHorizontalAlignment(JLabel.CENTER);
//    table.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
//}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("See Books");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Books Copyes more than 5 are shown Here");

        table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "JONRA", "NAME", "AUTHOR", "COPIES"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User DashBord Page");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model= (DefaultTableModel)table.getModel();
       String url="jdbc:mysql://localhost/library_db";
       String user="root";
       String pwd= "";
//       SELECT * FROM `books` WHERE copies>5
       String query= "SELECT * FROM books WHERE copies>5 ;";
       try
       {
           Connection conn= DriverManager.getConnection(url,user,pwd);
           Statement stm=conn.createStatement();
           ResultSet rs= stm.executeQuery(query);
           while(rs.next())
           {
//               String bookid=rs.getString("book_id");
               String category=rs.getString("category");
               String name=rs.getString("name"); 
               String author=rs.getString("author");
               int copies=rs.getInt("copies");
               
//             model is feeding the table with data 1 by 1 ;mvc type thing.
               model.addRow(new Object[] {category,name,author,copies}); 
           }
           rs.close();
           stm.close(); 
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this,e.getMessage()); 
       }  
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(User_Books_Aviable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Books_Aviable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Books_Aviable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Books_Aviable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Books_Aviable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
