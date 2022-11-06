FRONT

//This is the main Page it will direct you to admin and user page
package example;
public class Front extends javax.swing.JFrame {
    public Front() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(null);

        label1.setFont(new java.awt.Font("Gabriola", 1, 30)); // NOI18N
        label1.setText("ONLINE BOOK STORE");
        getContentPane().add(label1);
        label1.setBounds(150, 60, 420, 60);

        button1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        button1.setLabel("USER");
        button1.setPreferredSize(new java.awt.Dimension(24, 24));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1);
        button1.setBounds(280, 180, 130, 50);

        button2.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        button2.setLabel("ADMIN");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2);
        button2.setBounds(280, 290, 130, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
             
                setVisible(false);
                User obj=new User();
                obj.setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed
    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        
                setVisible(false);
                Admin obj=new Admin();
                obj.setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed
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
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Front().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}



USER


package example;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

//import static javaapplication7.DBmain.DB_URL;
//import static javaapplication7.DBmain.PASS;
//import static javaapplication7.DBmain.USER;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class User extends javax.swing.JFrame {

    String[] cname = {"Id", "Title", "Author", "Price", "Quantity"};
    ResultSet rs, rs1;
    DefaultTableModel model1;

    public User() {
        initComponents();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(cname);
        DefaultTableModel model1 = new DefaultTableModel();
        model1.setColumnIdentifiers(cname);
        jTable2.setModel(model1);
        jTable2.setAutoResizeMode(jTable2.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setModel(model);
        jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_ALL_COLUMNS);

        try {
            Class.forName("com.mysqal.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?zeroDateTimeBehavior=convertToNull [root on Default schema]", "root", "9524426964");
            Statement stmt = conn.createStatement();
            {
                rs = stmt.executeQuery("SELECT * FROM book");

                while (rs.next()) {
                    String ex = rs.getString(1);
                    String ex1 = rs.getString(2);
                    String ex2 = rs.getString(3);
                    String ex3 = rs.getString(4);
                    String ex4 = rs.getString(5);
                    model.addRow(new Object[]{ex, ex1, ex2, ex3, ex4});
                }
                rs1 = stmt.executeQuery("SELECT Author FROM book");
                while (rs1.next()) {
                    String s = rs1.getString(1);
                    jb1.addItem(s);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jb1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel1.setText("ONLINE BOOK STORE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(197, 20, 310, 40);

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 14)); // NOI18N
        jLabel2.setText("BOOK DETAILS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 90, 110, 30);

        jTable1.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 80, 530, 100);

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 14)); // NOI18N
        jLabel3.setText("AUTHOR NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 260, 110, 30);

        jb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-add-"}));
        jb1.setToolTipText("");
        jb1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jb1ItemStateChanged(evt);
            }
        });
        getContentPane().add(jb1);
        jb1.setBounds(170, 260, 130, 30);

        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(160, 312, 530, 100);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(300, 420, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        setVisible(false);
        Front obj=new Front();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jb1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jb1ItemStateChanged

        try {
            Class.forName("com.mysqal.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?zeroDateTimeBehavior=convertToNull [root on Default schema]", "root", "9524426964");
            Statement stmt = conn.createStatement();
            {
                DefaultTableModel model1 = new DefaultTableModel();
                model1.setColumnIdentifiers(cname);
                jTable2.setModel(model1);
                jTable2.setAutoResizeMode(jTable2.AUTO_RESIZE_ALL_COLUMNS);
                int jb = jb1.getSelectedIndex();
                String title1 = jb1.getItemAt(jb);
                rs = stmt.executeQuery("SELECT * FROM books WHERE Author='" + title1 + "'");
                while (rs.next()) {
                    model1.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jb1ItemStateChanged

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> jb1;
    // End of variables declaration//GEN-END:variables
}


ADMIN


package example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Admin extends javax.swing.JFrame {
    ResultSet rs, rs1;
    int it, i1, i2;
    public Admin() {
        initComponents();
        try {
            Class.forName("com.mysqal.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?zeroDateTimeBehavior=convertToNull [root on Default schema]", "root", "9524426964");
            Statement stmt = conn.createStatement();
            {
                rs = stmt.executeQuery("SELECT Id FROM books");

                while (rs.next()) {
                    String ex = rs.getString(1);
                    id1.addItem(ex);
                }
                rs1 = stmt.executeQuery("SELECT Title FROM books");
                while (rs1.next()) {
                    String ex1 = rs1.getString(1);
                    t1.addItem(ex1);
                    t2.addItem(ex1);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        popupMenu1 = new java.awt.PopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JComboBox<>();
        id1 = new javax.swing.JComboBox<>();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Id2 = new javax.swing.JTextField();
        Author = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Title = new javax.swing.JTextField();
        Price2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        
        popupMenu1.setLabel("popupMenu1");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(750, 500));
        getContentPane().setLayout(null);
        
        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18)); // NOI18N
        jLabel1.setText("ONLINE BOOK STORE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 20, 210, 21);

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 14)); // NOI18N
        jLabel2.setText("Quantity:");
        jLabel2.setPreferredSize(new java.awt.Dimension(40, 15));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 110, 70, 20);

        jLabel4.setText("ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 170, 60, 16);

        t1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-add-"}));
        t1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                t1ItemStateChanged(evt);
            }
        });
        t1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                t1ComponentHidden(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(80, 70, 260, 22);

        t2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-add-"}));
        t2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                t2ItemStateChanged(evt);
            }
        });
        getContentPane().add(t2);
        t2.setBounds(80, 110, 260, 22);

        id1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"-add-"}));
        id1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                id1ItemStateChanged(evt);
            }
        });
        getContentPane().add(id1);
        id1.setBounds(80, 160, 220, 30);
        getContentPane().add(tf1);
        tf1.setBounds(430, 70, 110, 22);
        getContentPane().add(tf2);
        tf2.setBounds(430, 110, 110, 22);

        jButton1.setText("Update Price");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 70, 140, 22);

        jButton2.setText("Update Quantity");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(560, 110, 140, 22);

        jButton3.setText("DELETE ID");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(390, 160, 210, 30);

        jLabel7.setText("ID");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 260, 40, 16);

        jLabel8.setText("Author");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 320, 70, 16);

        jLabel9.setText("Quantity");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 380, 70, 16);
        getContentPane().add(Id2);
        Id2.setBounds(150, 250, 130, 30);
        getContentPane().add(Author);
        Author.setBounds(150, 310, 130, 30);
        getContentPane().add(Quantity);
        Quantity.setBounds(150, 370, 130, 30);

        jLabel10.setText("Title");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(300, 260, 70, 16);

        jLabel11.setText("Price");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(300, 320, 70, 16);

        jButton4.setText("Insert Book");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton4ActionPerformed(evt);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(430, 370, 220, 40);
        getContentPane().add(Title);
        Title.setBounds(380, 250, 260, 30);
        getContentPane().add(Price2);
        Price2.setBounds(380, 310, 260, 30);

        jLabel12.setFont(new java.awt.Font("Gabriola", 1, 14)); // NOI18N
        jLabel12.setText("Title");
        jLabel12.setPreferredSize(new java.awt.Dimension(40, 15));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 70, 80, 20);

        jLabel13.setFont(new java.awt.Font("Gabriola", 1, 14)); // NOI18N
        jLabel13.setText("Title");
        jLabel13.setPreferredSize(new java.awt.Dimension(40, 15));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 110, 80, 20);

        jLabel14.setFont(new java.awt.Font("Gabriola", 1, 14)); // NOI18N
        jLabel14.setText("Price:");
        jLabel14.setPreferredSize(new java.awt.Dimension(40, 15));
        getContentPane().add(jLabel14);
        jLabel14.setBounds(350, 70, 60, 20);

        jButton5.setFont(new java.awt.Font("Gabriola", 1, 10)); // NOI18N
        jButton5.setText("HOME");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(300, 420, 90, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_t1ComponentHidden

    }//GEN-LAST:event_t1ComponentHidden

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed

    }//GEN-LAST:event_t1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        setVisible(false);
        //new jf();
        //f.setVisible(false);
        Front obj = new Front();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException {//GEN-FIRST:event_jButton4ActionPerformed

        int a = Integer.parseInt(Id2.getText());
        String b = Author.getText();
        int c = Integer.parseInt(Quantity.getText());
        String d = Title.getText();
        float e = Float.parseFloat(Price2.getText());
        Id2.setText("");
        Author.setText("");
        Quantity.setText("");
        Title.setText("");
        Price2.setText("");
        try {
            Class.forName("com.mysqal.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?zeroDateTimeBehavior=convertToNull [root on Default schema]", "root", "9524426964");
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO books VALUES('" + a + "','" + d + "','" + b + "','" + e + "','" + c + "')");
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String id = id1.getItemAt(it);
        try {
            Class.forName("com.mysqal.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?zeroDateTimeBehavior=convertToNull [root on Default schema]", "root", "9524426964");
            Statement stmt = conn.createStatement();
            {
                stmt.executeUpdate("DELETE FROM books WHERE id = '" + id + "'");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void id1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_id1ItemStateChanged

        it = id1.getSelectedIndex();
    }//GEN-LAST:event_id1ItemStateChanged

    private void t1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_t1ItemStateChanged

        i1 = t1.getSelectedIndex();
    }//GEN-LAST:event_t1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        float price = Float.parseFloat(tf1.getText());
        String title = t1.getItemAt(i1);
        tf1.setText("");
        try {
            Class.forName("com.mysqal.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?zeroDateTimeBehavior=convertToNull [root on Default schema]", "root", "9524426964");
            Statement stmt = conn.createStatement();
            {
                stmt.executeUpdate("UPDATE books SET Price= '" + price + "' WHERE Title = '" + title + "'");
                System.out.println("Done");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_t2ItemStateChanged

        i2 = t2.getSelectedIndex();
    }//GEN-LAST:event_t2ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int quantity = Integer.parseInt(tf2.getText());
        String title = t2.getItemAt(i2);
        tf2.setText("");
        try {
            Class.forName("com.mysqal.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?zeroDateTimeBehavior=convertToNull [root on Default schema]", "root", "9524426964");
            Statement stmt = conn.createStatement();
            {
                stmt.executeUpdate("UPDATE books SET Quantity= '" + quantity + "' WHERE Title = '" + title + "'");
                System.out.println("Done");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Author;
    private javax.swing.JTextField Id2;
    private javax.swing.JTextField Price2;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextField Title;
    private javax.swing.JComboBox<String> id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JComboBox<String> t1;
    private javax.swing.JComboBox<String> t2;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
