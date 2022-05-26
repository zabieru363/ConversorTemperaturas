package com.temperatureconverter.view;

import javax.swing.JFrame;
import com.temperatureconverter.classes.Constants;

/**
 * Clase que crea la ventana principal de la aplicación.
 * @author Zabieru
 * @version 1.0
 */
public final class Application extends JFrame {

    /**
     * Crea la ventana de la aplicación.
     */
    public Application() {
        setTitle("Conversor de temperaturas");
        setResizable(false);
        setLocationRelativeTo(null);
        initComponents();
        fillComboBox();
    }
    
    /**
     * Rellena los 2 jcombobox que hay en la aplicación
     */
    private void fillComboBox(){
        for(String system : Constants.DEGREES_SYSTEMS){
            systemDegreesSelector.addItem(system);
        }
        
        for(String system : Constants.DEGREES_SYSTEMS){
            systemDegreesSelectorTo.addItem(system);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        enterDegreesPanel = new javax.swing.JPanel();
        degreesLbl = new javax.swing.JLabel();
        degrees = new javax.swing.JTextField();
        changeDegreesSystemPanel = new javax.swing.JPanel();
        nowLbl = new javax.swing.JLabel();
        systemDegreesSelector = new javax.swing.JComboBox<>();
        toLbl = new javax.swing.JLabel();
        systemDegreesSelectorTo = new javax.swing.JComboBox<>();
        buttonsPanel = new javax.swing.JPanel();
        convertBtn = new javax.swing.JButton();
        resultField = new javax.swing.JTextField();

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

        nowLbl.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        nowLbl.setText("De:");

        systemDegreesSelector.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        toLbl.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        toLbl.setText("A:");

        systemDegreesSelectorTo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        javax.swing.GroupLayout changeDegreesSystemPanelLayout = new javax.swing.GroupLayout(changeDegreesSystemPanel);
        changeDegreesSystemPanel.setLayout(changeDegreesSystemPanelLayout);
        changeDegreesSystemPanelLayout.setHorizontalGroup(
            changeDegreesSystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeDegreesSystemPanelLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(changeDegreesSystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(changeDegreesSystemPanelLayout.createSequentialGroup()
                        .addComponent(toLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(systemDegreesSelectorTo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(changeDegreesSystemPanelLayout.createSequentialGroup()
                        .addComponent(nowLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(systemDegreesSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        changeDegreesSystemPanelLayout.setVerticalGroup(
            changeDegreesSystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changeDegreesSystemPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(changeDegreesSystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nowLbl)
                    .addComponent(systemDegreesSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(changeDegreesSystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toLbl)
                    .addComponent(systemDegreesSelectorTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        mainPanel.add(changeDegreesSystemPanel);

        convertBtn.setText("Convertir");

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(convertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(convertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultField, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(buttonsPanel);

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
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JPanel changeDegreesSystemPanel;
    private javax.swing.JButton convertBtn;
    private javax.swing.JTextField degrees;
    private javax.swing.JLabel degreesLbl;
    private javax.swing.JPanel enterDegreesPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nowLbl;
    private javax.swing.JTextField resultField;
    private javax.swing.JComboBox<String> systemDegreesSelector;
    private javax.swing.JComboBox<String> systemDegreesSelectorTo;
    private javax.swing.JLabel toLbl;
    // End of variables declaration//GEN-END:variables
}
