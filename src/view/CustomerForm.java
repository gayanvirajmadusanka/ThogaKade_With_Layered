/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CustomerController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Customer;

/**
 *
 * @author Acer
 */
public class CustomerForm extends javax.swing.JFrame {

    /**
     * Creates new form CustomerForm
     */
    public CustomerForm() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        getAllCustomers();
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
        cusIdTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cusNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cusAddressTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cusSalaryTextField = new javax.swing.JTextField();
        serachCustomerCustomer = new javax.swing.JButton();
        addCustomerButton = new javax.swing.JButton();
        deleteCustomerButton = new javax.swing.JButton();
        updateCustomerButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTbl = new javax.swing.JTable();
        viewCustomerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Form");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Customer Form");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Customer ID          :");

        cusIdTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cusIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusIdTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Customer Name    :");

        cusNameTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Customer Address:");

        cusAddressTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Customer Salary    :");

        cusSalaryTextField.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        serachCustomerCustomer.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        serachCustomerCustomer.setText("Search");
        serachCustomerCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serachCustomerCustomerActionPerformed(evt);
            }
        });

        addCustomerButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addCustomerButton.setText("Add");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        deleteCustomerButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        deleteCustomerButton.setText("Delete");
        deleteCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustomerButtonActionPerformed(evt);
            }
        });

        updateCustomerButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        updateCustomerButton.setText("Update");
        updateCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustomerButtonActionPerformed(evt);
            }
        });

        customerTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Address", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerTbl);

        viewCustomerButton.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        viewCustomerButton.setText("View Customers");
        viewCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCustomerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cusIdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(cusNameTextField)
                            .addComponent(cusAddressTextField)
                            .addComponent(cusSalaryTextField))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(serachCustomerCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(viewCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cusIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cusNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cusAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cusSalaryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serachCustomerCustomer)
                    .addComponent(deleteCustomerButton)
                    .addComponent(addCustomerButton)
                    .addComponent(updateCustomerButton))
                .addGap(4, 4, 4)
                .addComponent(viewCustomerButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void serachCustomerCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serachCustomerCustomerActionPerformed

        try {
            String customerId = cusIdTextField.getText();

            CustomerController customerController = new CustomerController();
            Customer customer = customerController.searchCustomer(customerId);

            if (customer == null) {
                JOptionPane.showMessageDialog(rootPane, "No customer found in " + customerId);
                clearAllTextFields();
            } else {

                cusIdTextField.setText(customer.getId());
                cusNameTextField.setText(customer.getName());
                cusAddressTextField.setText(customer.getAddress());
                cusSalaryTextField.setText(Double.toString(customer.getSalary()));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        getAllCustomers();
    }//GEN-LAST:event_serachCustomerCustomerActionPerformed

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButtonActionPerformed

        try {
            String customerName = cusNameTextField.getText();
            String customerId = cusIdTextField.getText();
            String customerAddress = cusAddressTextField.getText();
            double customerSalary = Double.parseDouble(cusSalaryTextField.getText());

            Customer customer = new Customer(customerId, customerName, customerAddress, customerSalary);
            CustomerController customerController = new CustomerController();
            boolean isAdded = customerController.addCustomer(customer);

            if (isAdded) {
                JOptionPane.showMessageDialog(rootPane, "Customer Added");
                clearAllTextFields();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Customer is not added");
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        getAllCustomers();
    }//GEN-LAST:event_addCustomerButtonActionPerformed

    private void deleteCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustomerButtonActionPerformed

        try {
            String customerId = cusIdTextField.getText();

            if (customerId.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Please insert customer ID");
            } else {

                CustomerController customerController = new CustomerController();
                boolean isDeleted = customerController.deleteCustomer(customerId);
                if (isDeleted) {
                    JOptionPane.showMessageDialog(rootPane, "Customer is Deleted");
                    cusIdTextField.setText("");
                    cusNameTextField.setText("");
                    cusAddressTextField.setText("");
                    cusSalaryTextField.setText("");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Customer is  not Deleted");
                    clearAllTextFields();
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        getAllCustomers();
    }//GEN-LAST:event_deleteCustomerButtonActionPerformed

    private void updateCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustomerButtonActionPerformed

        String customerId = cusIdTextField.getText();

        try {
            String customerName = cusNameTextField.getText();
            String customerAddress = cusAddressTextField.getText();
            double customerSalary = Double.parseDouble(cusSalaryTextField.getText());

            Customer customer = new Customer(customerId, customerName, customerAddress, customerSalary);
            CustomerController customerController = new CustomerController();
            boolean isUpdated = customerController.updateCustomer(customer);

            if (isUpdated) {
                JOptionPane.showMessageDialog(rootPane, "Customer Updated");
                clearAllTextFields();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Customer is not updated");
            }

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "System Error");
        }
        getAllCustomers();
    }//GEN-LAST:event_updateCustomerButtonActionPerformed

    private void viewCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCustomerButtonActionPerformed
        // TODO add your handling code here:
        getAllCustomers();
    }//GEN-LAST:event_viewCustomerButtonActionPerformed

    private void cusIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusIdTextFieldActionPerformed
        serachCustomerCustomerActionPerformed(evt);
    }//GEN-LAST:event_cusIdTextFieldActionPerformed
    private void clearAllTextFields() {
        cusIdTextField.setText("");
        cusNameTextField.setText("");
        cusAddressTextField.setText("");
        cusSalaryTextField.setText("");
    }

    public void getAllCustomers() {

        try {
            DefaultTableModel dtm = (DefaultTableModel) customerTbl.getModel();

            CustomerController customerController = new CustomerController();
            ArrayList<Customer> allCustomers;
            allCustomers = customerController.viewCustomer();
            dtm.setRowCount(0);

            for (Customer c : allCustomers) {
                Object row[] = {c.getId(), c.getName(), c.getAddress(), c.getSalary()};
                dtm.addRow(row);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(CustomerForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JTextField cusAddressTextField;
    private javax.swing.JTextField cusIdTextField;
    private javax.swing.JTextField cusNameTextField;
    private javax.swing.JTextField cusSalaryTextField;
    private javax.swing.JTable customerTbl;
    private javax.swing.JButton deleteCustomerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton serachCustomerCustomer;
    private javax.swing.JButton updateCustomerButton;
    private javax.swing.JButton viewCustomerButton;
    // End of variables declaration//GEN-END:variables
}
