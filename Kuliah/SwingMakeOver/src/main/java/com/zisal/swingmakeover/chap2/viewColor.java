/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * viewColor.java
 *
 * Created on Jan 28, 2012, 11:20:42 AM
 */
package com.zisal.swingmakeover.chap2;

/**
 *
 * @author fauzi
 */
public class viewColor extends javax.swing.JFrame {

    /** Creates new form viewColor */
    public viewColor() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bikinBackgroundGradient1 = new com.zisal.swingmakeover.chap2.bikinBackgroundGradient();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout bikinBackgroundGradient1Layout = new javax.swing.GroupLayout(bikinBackgroundGradient1);
        bikinBackgroundGradient1.setLayout(bikinBackgroundGradient1Layout);
        bikinBackgroundGradient1Layout.setHorizontalGroup(
            bikinBackgroundGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        bikinBackgroundGradient1Layout.setVerticalGroup(
            bikinBackgroundGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(bikinBackgroundGradient1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new viewColor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.zisal.swingmakeover.chap2.bikinBackgroundGradient bikinBackgroundGradient1;
    // End of variables declaration//GEN-END:variables
}
