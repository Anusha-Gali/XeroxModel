/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.MarketingManagerWorkArea;

import MarketingManagement.MarketingPersonProfile;
import TheBusiness.Business.Business;
import javax.swing.JPanel;

/**
 *
 * @author Bhagya
 */
public class CustomerManageMarketingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerManageMarketingJPanel
     */
    JPanel workArea;
    Business business;
    MarketingPersonProfile mpp; 
    public CustomerManageMarketingJPanel(JPanel workArea, Business business, MarketingPersonProfile mpp) {
        initComponents();
        this.workArea = workArea;
        this.business = business;
        this.mpp = mpp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCustomerName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboBoxSalesPerson = new javax.swing.JComboBox<>();
        comboBoxSelectBundle = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer:");

        comboBoxSalesPerson.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        comboBoxSalesPerson.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Sales Person", "SalesPerson 1", "SalesPerson 2", "SalesPerson 3", "SalesPerson 4", "SalesPerson 5", "SalesPerson 6", "SalesPerson 7", "SalesPerson 8", "SalesPerson 9", "SalesPerson 10", "SalesPerson 11", "SalesPerson 12" }));

        comboBoxSelectBundle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        comboBoxSelectBundle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Bundle", "1. B2B - High End - Ad", "2. B2B - Mid Cap - Ad", "3. B2B - Low end - Ad", "4. B2B - High End - Tv", "5. B2B - Mid Cap - Tv", "6. B2B - Low end - Tv", "7. B2B - High End - Web", "8. B2B - Mid Cap - Web", "9. B2B - Low end - Web ", "10. B2B - High End - Radio ", "11. B2B - Mid Cap - Radio ", "12. B2B - Low end - Radio", "13. Teen - High End - Ad ", "14. Teen - Mid Cap - Ad", "15. Teen - Low End - Ad", "16. Teen - High End - Tv ", "17. Teen - Mid Cap - Tv ", "18. Teen - Low End - Tv", "19. Teen - High End - Web", "20. Teen - Mid Cap - Web ", "21. Teen - Low End - Web", "22. Teen - High End - Radio", "23. Teen - Mid Cap - Radio", "24. Teen - Low End - Radio", "25. College Students - High End - Ad", "26. College Students - Mid Cap - Ad ", "27. College Students - Low End - Ad", "28. College Students - High End - Tv", "29. College Students - Mid Cap - Tv ", "30. College Students - Low End - Tv ", "31. College Students - High End - Web", "32. College Students - Mid Cap - Web ", "33. College Students - Low End - Web", "34. College Students - High End - Radio", "35. College Students - Mid Cap - Radio", "36. College Students - Low End - Radio ", "37. Millenial - High End - Ad ", "38. Millenial - Mid Cap - Ad ", "39. Millenial - Low End - Ad ", "40. Millenial - High End - Tv", "41. Millenial - Mid Cap - Tv ", "42. Millenial - Low End - Tv ", "43. Millenial - High End - Web", "44. Millenial - Mid Cap - Web ", "45. Millenial - Low End - Web ", "46. Millenial - High End - Radio", "47. Millenial - Mid Cap - Radio ", "48. Millenial - Low End - Radio", "49. Senior - High End - Web", "50. Senior - High End - TV ", "51. Senior - High End - Radio ", "52. Senior -  High End - Ad ", "53. Senior -  Mid Cap - Web ", "54. Senior - Mid Cap - TV ", "55. Senior - Mid Cap - Radio", "56. Senior -  Mid Cap - Ad ", "57. Senior - Lower End - Web", "58. Senior - Lower End - TV ", "59. Senior - Lower End - Radio", "60. Senior - Lower End - Ad ", "61. Genz - High End - Web", "62. Genz - High End - TV", "63. Genz - High End - Radio", "64. Genz -  High End - Ad", "65. Genz -  Mid Cap - Web", "66. Genz - Mid Cap - TV ", "67. Genz - Mid Cap - Radio", "68. Genz -  Mid Cap - Ad", "69. Genz - Lower End - Web", "70. Genz - Lower End - TV ", "71. Genz - Lower End - Radio", "72. Genz - Lower End - Ad" }));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setText("Transfer Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBoxSalesPerson, 0, 156, Short.MAX_VALUE)
                    .addComponent(txtCustomerName))
                .addGap(225, 225, 225)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxSelectBundle, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(437, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {comboBoxSalesPerson, comboBoxSelectBundle});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxSalesPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSelectBundle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141)
                .addComponent(jButton1)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboBoxSalesPerson, comboBoxSelectBundle});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String selectedSalesPerson = (String)comboBoxSalesPerson.getSelectedItem();
        String selectedSelectBundle = (String)comboBoxSelectBundle.getSelectedItem();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxSalesPerson;
    private javax.swing.JComboBox<String> comboBoxSelectBundle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtCustomerName;
    // End of variables declaration//GEN-END:variables
}