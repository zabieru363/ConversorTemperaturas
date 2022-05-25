package com.temperatureconverter.view;

import javax.swing.JFrame;

/**
 * @author Zabieru
 * @version 1.0
 */
public class Application extends JFrame {

    /**
     * Crea la ventana de la aplicación.
     */
    public Application() {
        setResizable(false);
        setLocationRelativeTo(null);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        mainPanel = new javax.swing.JPanel();
        enterDegreesPanel = new javax.swing.JPanel();
        degreesLbl = new javax.swing.JLabel();
        degrees = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.GridLayout(4, 0));

        degreesLbl.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        degreesLbl.setText("Cantidad de grados a convertir");

        degrees.setToolTipText("La cantidad de grados a convertir");

        javax.swing.GroupLayout enterDegreesPanelLayout = new javax.swing.GroupLayout(enterDegreesPanel);
        enterDegreesPanel.setLayout(enterDegreesPanelLayout);
        enterDegreesPanelLayout.setHorizontalGroup(
            enterDegreesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterDegreesPanelLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(enterDegreesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(degreesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(degrees, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156))
        );
        enterDegreesPanelLayout.setVerticalGroup(
            enterDegreesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterDegreesPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(degreesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(degrees, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        mainPanel.add(enterDegreesPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField degrees;
    private javax.swing.JLabel degreesLbl;
    private javax.swing.JPanel enterDegreesPanel;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
