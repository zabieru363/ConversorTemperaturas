package com.temperatureconverter.view;

import javax.swing.JFrame;
import com.temperatureconverter.classes.Constants;
import com.temperatureconverter.classes.Converter;

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
        otherActionsPanel = new javax.swing.JPanel();
        closeAppBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close(evt);
            }
        });

        mainPanel.setLayout(new java.awt.GridLayout(4, 0));

        degreesLbl.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        degreesLbl.setText("Cantidad de grados a convertir");

        degrees.setToolTipText("La cantidad de grados a convertir");

        javax.swing.GroupLayout enterDegreesPanelLayout = new javax.swing.GroupLayout(enterDegreesPanel);
        enterDegreesPanel.setLayout(enterDegreesPanelLayout);
        enterDegreesPanelLayout.setHorizontalGroup(
            enterDegreesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterDegreesPanelLayout.createSequentialGroup()
                .addGroup(enterDegreesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(enterDegreesPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(degrees, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, enterDegreesPanelLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(degreesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
        convertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convert(evt);
            }
        });

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

        closeAppBtn.setText("Salir de la aplicación");
        closeAppBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeApplication(evt);
            }
        });

        javax.swing.GroupLayout otherActionsPanelLayout = new javax.swing.GroupLayout(otherActionsPanel);
        otherActionsPanel.setLayout(otherActionsPanelLayout);
        otherActionsPanelLayout.setHorizontalGroup(
            otherActionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherActionsPanelLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(closeAppBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
        );
        otherActionsPanelLayout.setVerticalGroup(
            otherActionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherActionsPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(closeAppBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        mainPanel.add(otherActionsPanel);

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

    /**
     * Método que muestra una ventana de confirmación
     * para salir de la aplicación, al pulsar el botón
     * salir de la aplicación.
     * @param evt El evento, en este caso en hacer clic en el botón.
     */
    private void closeApplication(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeApplication
        Integer response = Constants.close();
        
        if(response == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_closeApplication

    /**
     * Método que muestra una ventana de confirmación
     * para salir de la aplicación pero al cerrar la ventana.
     * @param evt El evento, en este caso al hacer clic en la X.
     */
    private void close(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_close
        Integer response = Constants.close();
        
        if(response == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_close

    /**
     * Método que controla las acciones de los jcomboboxes
     * al pulsar el botón.
     * @param evt El evento, en este caso al hacer clic en el botón.
     */
    private void convert(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convert
        double result;

        if(degrees.getText().isEmpty()){
            Constants.showError("No se ha especificado una cantidad de grados.");
        }else{
            if(degrees.getText().contains(",")){
                Constants.showError("Debes utilizar el . en vez de la , para expresar decimales.");
            }else{
                if(systemDegreesSelector.getSelectedItem() == "Celsius"
                   && systemDegreesSelectorTo.getSelectedItem() == "Fahrenheit"){
                    // De Celsius a Fahrenheit.
                    result = Converter.c2f(Double.parseDouble(degrees.getText()));
                    resultField.setText(String.valueOf(result + "ºF"));
                }
                
                if(systemDegreesSelector.getSelectedItem() == "Fahrenheit"
                && systemDegreesSelectorTo.getSelectedItem() == "Celsius"){
                    // De Fahrenheit a Celsius.
                    result = Converter.f2c(Double.parseDouble(degrees.getText()));
                    resultField.setText(String.valueOf(result + "ºC"));
                }
                
                if(systemDegreesSelector.getSelectedItem() == "Celsius"
                && systemDegreesSelectorTo.getSelectedItem() == "Kelvin"){
                    // De Celsius a Kelvin.
                    result = Converter.c2k(Double.parseDouble(degrees.getText()));
                    resultField.setText(String.valueOf(result + "ºK"));
                }
            }
        }
    }//GEN-LAST:event_convert

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JPanel changeDegreesSystemPanel;
    private javax.swing.JButton closeAppBtn;
    private javax.swing.JButton convertBtn;
    private javax.swing.JTextField degrees;
    private javax.swing.JLabel degreesLbl;
    private javax.swing.JPanel enterDegreesPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nowLbl;
    private javax.swing.JPanel otherActionsPanel;
    private javax.swing.JTextField resultField;
    private javax.swing.JComboBox<String> systemDegreesSelector;
    private javax.swing.JComboBox<String> systemDegreesSelectorTo;
    private javax.swing.JLabel toLbl;
    // End of variables declaration//GEN-END:variables
}
