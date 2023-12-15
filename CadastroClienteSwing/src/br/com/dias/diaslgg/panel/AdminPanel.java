/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.dias.diaslgg.panel;

import br.com.dias.diaslgg.dao.UserDAO;
import br.com.dias.diaslgg.dao.UserSetDAO;
import br.com.dias.diaslgg.domain.User;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luis.dias
 */
public class AdminPanel extends javax.swing.JFrame {
    
    private DefaultTableModel usersTable = new DefaultTableModel();
    private UserDAO userDAO = new UserSetDAO();

    /**
     * Creates new form AdminPanel
     */
    public AdminPanel() {
        initComponents();
        initCustomComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        jLabelName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jLabelCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        jButtonRemove = new javax.swing.JButton();
        jLabelUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabelPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabelAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabelAddressNumber = new javax.swing.JLabel();
        txtAddressNumber = new javax.swing.JTextField();
        jLabelCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabelCountryState = new javax.swing.JLabel();
        txtCountryState = new javax.swing.JTextField();
        jLabelPrivileges = new javax.swing.JLabel();
        jButtonClearFields = new javax.swing.JButton();
        jComboBoxPrivileges = new javax.swing.JComboBox<>();
        jButtonEdit = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItemLogout = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelName.setText("Name");

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jLabelCpf.setText("CPF:");

        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        UsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UsersTable);

        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jLabelUsername.setText("Username");

        jLabelPassword.setText("Password");

        jLabelPhone.setText("Phone");

        jLabelAddress.setText("Address");

        jLabelAddressNumber.setText("Address Number");

        jLabelCity.setText("City");

        jLabelCountryState.setText("Country State");

        jLabelPrivileges.setText("Privileges");

        jButtonClearFields.setText("Clear Fields");
        jButtonClearFields.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearFieldsActionPerformed(evt);
            }
        });

        jComboBoxPrivileges.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "User", "Admin" }));

        jButtonEdit.setText("Edit");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jMenu1.setText("Options");

        MenuItemLogout.setText("Logout");
        MenuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemLogout);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCountryState)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCountryState))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelAddressNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAddressNumber))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelUsername)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPhone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAddress))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelPrivileges)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxPrivileges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSave)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRemove)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonClearFields)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEdit)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSearch)
                        .addGap(174, 174, 174)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelUsername)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPhone)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAddressNumber)
                            .addComponent(txtAddressNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCountryState)
                            .addComponent(txtCountryState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCpf)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCity)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPrivileges)
                            .addComponent(jComboBoxPrivileges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRemove)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonClearFields)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemLogoutActionPerformed
        int result = JOptionPane.
                showConfirmDialog(this,
                        "Do you want to logout?", "Logout",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
        
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_MenuItemLogoutActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        String name = txtName.getText();
        String cpf = txtCpf.getText();
        String address = txtAddress.getText();
        String addressNumber = txtAddressNumber.getText();
        String city = txtCity.getText();
        String countryState = txtCountryState.getText();
        String password = txtPassword.getText();
        String phone = txtPhone.getText();
        String username = txtUsername.getText();
        String privileges = jComboBoxPrivileges.getSelectedItem().toString();
        
        if (!isValid(name, cpf, address, addressNumber,
                city, countryState, password, phone,
                username)) {
            JOptionPane.showMessageDialog(null,
                    "A required field was not filled", "Error",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        User user = new User(username, password, name, cpf, phone,
                address, addressNumber, city, countryState, privileges);
        
        Boolean isSignedUp = this.userDAO.signup(user);
        
        if (isSignedUp) {
            usersTable.addRow(new Object[]{user.getName(), user.getCpf(),
            user.getUsername(), user.getPassword(), user.getPhone(),
            user.getAddress(), user.getAddressNumber(), user.getCity(),
            user.getCountryState(), user.getPrivileges()});
            clearFields();
        } else {
            JOptionPane.showMessageDialog(null,
                    "User is already registered", "Information",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
        //think of some validation of fields
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void UsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersTableMouseClicked
        int selectedRow = UsersTable.getSelectedRow();
        Long cpf = (Long) UsersTable.getValueAt(selectedRow, 1);
        
        User user = this.userDAO.check(cpf);
        
        txtName.setText(user.getName());
        txtCpf.setText(user.getCpf().toString());
        txtAddress.setText(user.getAddress());
        txtAddressNumber.setText(user.getAddressNumber().toString());
        txtCity.setText(user.getCity());
        txtCountryState.setText(user.getCountryState());
        txtPassword.setText(user.getPassword());
        txtPhone.setText(user.getPhone().toString());
        txtUsername.setText(user.getUsername());
        jComboBoxPrivileges.setSelectedItem(user.getPrivileges());
    }//GEN-LAST:event_UsersTableMouseClicked

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        int selectedRow = UsersTable.getSelectedRow();
        
        if (selectedRow >= 0) {
            int result = JOptionPane.showConfirmDialog(this,
                    "Do you really want to remove this user?",
                    "Atention",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            
            if (result == JOptionPane.YES_OPTION) {
                Long cpf = (Long) UsersTable.getValueAt(selectedRow, 1);
                this.userDAO.delete(cpf);
                usersTable.removeRow(selectedRow);
                
                JOptionPane.showMessageDialog(null,
                        "User removed successfully", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
                clearFields();
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "No user selected", "Error",
                    JOptionPane.INFORMATION_MESSAGE);
        }
                
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonClearFieldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearFieldsActionPerformed
        clearFields();
    }//GEN-LAST:event_jButtonClearFieldsActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        if (!isValid(txtCpf.getText())) {
            JOptionPane.showMessageDialog(null,
                    "CPF is a required field", "Error",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        Long cpf = Long.valueOf(txtCpf.getText().trim());
        User user = this.userDAO.check(cpf);
        
        if (user != null) {
            Integer rowCount = UsersTable.getRowCount();
            Integer rowNumber = null;
            for (Integer row = 0; row < rowCount; row++) {
                String test = UsersTable.getValueAt(row, 1).toString();
                if (test.equals(user.getCpf().toString())) {
                    rowNumber = row;
                    
                }

            }
            
            if (!user.getName().equals(txtName.getText())
                    && !"".equals(txtName.getText())) {
                user.setName(txtName.getText());
                UsersTable.setValueAt(user.getName(),
                        rowNumber, 0);
                
            }                
            
            if (!user.getUsername().equals(txtUsername.getText())
                    && !"".equals(txtUsername.getText())) {
                user.setUsername(txtUsername.getText());
                UsersTable.setValueAt(user.getUsername(),
                        rowNumber, 2);
            }                
            
            if (!user.getPassword().equals(txtPassword.getText())
                    && !"".equals(txtPassword.getText())) {
                user.setPassword(txtPassword.getText());
                UsersTable.setValueAt(user.getPassword(),
                        rowNumber, 3);
            }                
                        
            if (!user.getPhone().toString().equals(txtPhone.getText())
                    && !"".equals(txtPhone.getText())) {
                user.setPhone(Long.valueOf(txtPhone.getText().trim()));
                UsersTable.setValueAt(user.getPhone(),
                        rowNumber, 4);
            }                
            
            if (!user.getAddress().equals(txtAddress.getText())
                    && !"".equals(txtAddress.getText())) {
                user.setAddress(txtAddress.getText());
                UsersTable.setValueAt(user.getAddress(),
                        rowNumber, 5);
            }                
            
            if (!user.getAddressNumber().toString().
                    equals(txtAddressNumber.getText())
                    && !"".equals(txtAddressNumber.getText())) {
                    user.setAddressNumber(Integer.
                        valueOf(txtAddressNumber.getText().trim()));
                    UsersTable.setValueAt(user.getAddressNumber(),
                        rowNumber, 6);
            }                
            
            if (!user.getCity().equals(txtCity.getText())
                    && !"".equals(txtCity.getText())) {
                user.setCity(txtCity.getText());
                UsersTable.setValueAt(user.getCity(),
                        rowNumber, 7);
            }                
            
            if (!user.getCountryState().
                    equals(txtCountryState.getText())
                    && !"".equals(txtCountryState.getText())) {
                    user.setCountryState(txtCountryState.getText());
                    UsersTable.setValueAt(user.getCountryState(),
                        rowNumber, 8);
            }
            
            if (!user.getPrivileges().
                    equals(jComboBoxPrivileges.
                            getSelectedItem().toString())
                    && !"".equals(jComboBoxPrivileges.
                            getSelectedItem().toString())) {
                user.setPrivileges(jComboBoxPrivileges.
                        getSelectedItem().toString());
                UsersTable.setValueAt(user.getPrivileges(),
                        rowNumber, 9);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "CPF not found", "Error",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        
        clearFields();
                
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        if (!isValid(txtCpf.getText())) {
            JOptionPane.showMessageDialog(null,
                    "CPF is a required field", "Error",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        Long cpf = Long.valueOf(txtCpf.getText().trim());
        User user = this.userDAO.check(cpf);
        
        if (user != null) {
            txtName.setText(user.getName());
            txtCpf.setText(user.getCpf().toString());
            txtAddress.setText(user.getAddress());
            txtAddressNumber.setText(user.getAddressNumber().toString());
            txtCity.setText(user.getCity());
            txtCountryState.setText(user.getCountryState());
            txtPassword.setText(user.getPassword());
            txtPhone.setText(user.getPhone().toString());
            txtUsername.setText(user.getUsername());
            jComboBoxPrivileges.setSelectedItem(user.getPrivileges());
            
            
        } else {
            JOptionPane.showMessageDialog(null,
                    "CPF not found", "Error",
                    JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemLogout;
    private javax.swing.JTable UsersTable;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.JButton jButtonClearFields;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxPrivileges;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelAddressNumber;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelCountryState;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelPrivileges;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAddressNumber;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCountryState;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
    
    private void initCustomComponents() {
        usersTable.addColumn("Name");
        usersTable.addColumn("CPF");
        usersTable.addColumn("Username");
        usersTable.addColumn("Password");
        usersTable.addColumn("Phone");
        usersTable.addColumn("Address");
        usersTable.addColumn("Address Number");
        usersTable.addColumn("City");
        usersTable.addColumn("Country State");
        usersTable.addColumn("Privileges");
                
        UsersTable.setModel(usersTable);
    }
    
    private void clearFields() {
        txtName.setText("");
        txtCpf.setText("");
        txtAddress.setText("");
        txtAddressNumber.setText("");
        txtCity.setText("");
        txtCountryState.setText("");
        txtPassword.setText("");
        txtPhone.setText("");
        txtUsername.setText("");
        jComboBoxPrivileges.setSelectedItem("None");
    }
    
    private Boolean isValid(String ...fields) {
        return Arrays.stream(fields).
                allMatch(s -> Objects.nonNull(s) && !s.trim().isEmpty());
    }

}
