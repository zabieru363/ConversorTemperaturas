package com.temperatureconverter.view;

import javax.swing.JFrame;

/**
 * @author Zabieru
 * @version 1.0
 */
public class PrincipalWindow extends JFrame {

    /**
     * Inicia los componentes de la ventana principal
     * de la aplicación.
     */
    public PrincipalWindow() {
        setSize(800,500);
        setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        aplicationTitle = new javax.swing.JLabel();
        aplicationLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Temperaturas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mainPanel.setLayout(new java.awt.GridLayout(3, 1));

        aplicationTitle.setFont(new java.awt.Font("Bookman Old Style", 0, 36)); // NOI18N
        aplicationTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aplicationTitle.setText("Conversor de temperaturas");
        mainPanel.add(aplicationTitle);

        aplicationLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aplicationLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/termometro.png"))); // NOI18N
        mainPanel.add(aplicationLogo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PrincipalWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aplicationLogo;
    private javax.swing.JLabel aplicationTitle;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}