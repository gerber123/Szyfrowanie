/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marci
 */
public class Szyfryzacja extends javax.swing.JFrame {

    /**
     * Creates new form Szyfryzacja
     */
    public static String zaszyfrowane;
    public static String zaszyfrowane1;
    public Szyfryzacja() {
        initComponents();
        this.setTitle("Zabawny ciąg");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tekst = new javax.swing.JTextArea();
        zamien = new javax.swing.JButton();
        odszyfruj = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(15, 15, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N

        tekst.setBackground(new java.awt.Color(0, 218, 66));
        tekst.setColumns(20);
        tekst.setFont(new java.awt.Font("DialogInput", 0, 12)); // NOI18N
        tekst.setLineWrap(true);
        tekst.setRows(5);
        tekst.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.black));
        jScrollPane1.setViewportView(tekst);

        zamien.setBackground(new java.awt.Color(255, 73, 57));
        zamien.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        zamien.setText("Zaszyfruj");
        zamien.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.magenta, java.awt.Color.blue));
        zamien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zamienActionPerformed(evt);
            }
        });

        odszyfruj.setBackground(new java.awt.Color(51, 119, 63));
        odszyfruj.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        odszyfruj.setText("Odszyfruj");
        odszyfruj.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.magenta, java.awt.Color.blue));
        odszyfruj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odszyfrujActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 204, 102));
        jLabel1.setFont(new java.awt.Font("Dubai Medium", 0, 36)); // NOI18N
        jLabel1.setText("Szyfr to Tylko zabawa");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.gray));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setText("Odblokuj przyciski !");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.magenta, java.awt.Color.blue));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(zamien, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(odszyfruj, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(314, 314, 314))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {odszyfruj, zamien});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zamien, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odszyfruj))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {odszyfruj, zamien});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zamienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zamienActionPerformed
        int a = 0;
        a+=1;
                zaszyfrowane = Zaszyfruj.zmiennik(tekst.getText());
                tekst.replaceRange(zaszyfrowane, 0, tekst.getText().length());
                odszyfruj.setEnabled(true);
                zamien.setEnabled(false);
//                tekst.replaceRange(a+"", tekst.getText().length(), tekst.getText().length());
    }//GEN-LAST:event_zamienActionPerformed

    private void odszyfrujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odszyfrujActionPerformed
        zaszyfrowane1 = Odszyfruj.zmiennik(tekst.getText());
                tekst.replaceRange(zaszyfrowane1, 0, tekst.getText().length());
                odszyfruj.setEnabled(false);
                zamien.setEnabled(true);
                
    }//GEN-LAST:event_odszyfrujActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        zamien.setEnabled(true);
        odszyfruj.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Szyfryzacja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Szyfryzacja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Szyfryzacja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Szyfryzacja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Szyfryzacja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton odszyfruj;
    private javax.swing.JTextArea tekst;
    private javax.swing.JButton zamien;
    // End of variables declaration//GEN-END:variables
}
