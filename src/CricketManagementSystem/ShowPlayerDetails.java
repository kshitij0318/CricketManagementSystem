package CricketManagementSystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ShowPlayerDetails extends javax.swing.JFrame {

    /**
     * Creates new form       */
    public ShowPlayerDetails() {
	initComponents();
	userLoad();
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
        jSeparator2 = new javax.swing.JSeparator();
        printData = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlayer = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        nationality_search = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        reset3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        jLabel1.setText("ALL PLAYER DETAILS");

        printData.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        printData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/print.png"))); // NOI18N
        printData.setText("Print");
        printData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printDataActionPerformed(evt);
            }
        });

        close.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit application.png"))); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        tblPlayer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblPlayer.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        tblPlayer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLAYER ID", "NAME", "Date of Birth", "Bowling Type", "Batting Type", "Nationaity", "Country ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPlayer);

        jInternalFrame1.setVisible(true);

        nationality_search.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        search.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Search.png"))); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Please Enter Required Details");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Nationality");

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(nationality_search, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(search)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26))))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nationality_search, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(search)
                .addGap(25, 25, 25))
        );

        reset3.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        reset3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reset.png"))); // NOI18N
        reset3.setText("Reset");
        reset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(printData, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(227, 227, 227)
                                .addComponent(reset3)
                                .addGap(213, 213, 213)
                                .addComponent(close)
                                .addGap(98, 98, 98))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(430, 430, 430))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printData)
                    .addComponent(close)
                    .addComponent(reset3))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel d;

    public void userLoad() {
	int count;
	try {
	    Connection con = ConnectionProvider.getConnection();
	    pst = con.prepareStatement("select * from players1");
	    rs = pst.executeQuery();

	    ResultSetMetaData rsd = rs.getMetaData();
	    count = rsd.getColumnCount();
	    d = (DefaultTableModel) tblPlayer.getModel();
	    d.setRowCount(0);
	    while (rs.next()) {
		Vector v2 = new Vector();
		for (int i = 1; i <= count; i++) {
		    v2.add(rs.getString("Player ID"));
		    v2.add(rs.getString("Name"));
		    v2.add(rs.getString("dob"));
		    v2.add(rs.getString("Bowling"));
		    v2.add(rs.getString("Batting"));
		    v2.add(rs.getString("Nationality"));
		    v2.add(rs.getString("country_id"));
		}
		d.addRow(v2);
	    }
	} catch (SQLException ex) {
	    Logger.getLogger(ShowPlayerDetails.class.getName()).log(Level.SEVERE, null, ex);
	}
    }
    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
	this.dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void printDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printDataActionPerformed
	try {
	    tblPlayer.print();
	} catch (Exception e) {
	}
    }//GEN-LAST:event_printDataActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String nationalityToSearch = nationality_search.getText(); // Assuming year_search is a JTextField where user inputs the year to search
        
        // Check if inputs are not empty
        if (nationalityToSearch.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide nationality to search.");
            return; // Exit the method if inputs are empty
        }

        try {
            Connection con = ConnectionProvider.getConnection();
            // Prepare the SQL statement with placeholders
            String sql = "SELECT * FROM Players1 WHERE `Nationality` = ?";
            PreparedStatement pst = con.prepareStatement(sql);

            // Set parameters for the prepared statement
            pst.setString(1, nationalityToSearch);

            // Execute the query
            ResultSet rs = pst.executeQuery();

            // Check if any matches were found
            boolean nationalityFound = false;

            DefaultTableModel model = (DefaultTableModel) tblPlayer.getModel();
            model.setRowCount(0); // Clear previous data from the table

            while (rs.next()) {
                // Match found, retrieve match details
                nationalityFound = true;
                int playerID = rs.getInt("Player ID");
                String name = rs.getString("Name");
                String dob = rs.getString("dob");
                String bowling = rs.getString("Bowling");
                String batting = rs.getString("Batting");
                String nationality = rs.getString("Nationality");
                int country_id = rs.getInt("country_id");

                // Add the match details to the table
                model.addRow(new Object[]{playerID, name, dob, bowling, batting, nationality, country_id});
            }

            if (!nationalityFound) {
                JOptionPane.showMessageDialog(this, "No players found for the given criteria.");
            } else {
                JOptionPane.showMessageDialog(this, "Player details successfully found.");
            }

            // Close the database connection
            con.close();
        } catch (SQLException ex) {
            // Handle database related errors
            JOptionPane.showMessageDialog(this, "Error: Failed to fetch or save data to the database.");
        }
    }//GEN-LAST:event_searchActionPerformed
    public void refreshTable() {
    userLoad();
}
    private void reset3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset3ActionPerformed
        nationality_search.setText("");
        userLoad();
    }//GEN-LAST:event_reset3ActionPerformed

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
	    java.util.logging.Logger.getLogger(ShowPlayerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(ShowPlayerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(ShowPlayerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(ShowPlayerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new ShowPlayerDetails().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField nationality_search;
    private javax.swing.JButton printData;
    private javax.swing.JButton reset3;
    private javax.swing.JButton search;
    private javax.swing.JTable tblPlayer;
    // End of variables declaration//GEN-END:variables
}
