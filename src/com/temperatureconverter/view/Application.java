package com.temperatureconverter.view;

import javax.swing.JFrame;
import com.temperatureconverter.classes.Constants;
import com.temperatureconverter.classes.Converter;
import java.awt.Image;
import java.util.Map;
import java.util.function.Function;
import javax.swing.ImageIcon;

/**
 * Clase que crea la ventana principal de la aplicación.
 * @author Zabieru
 * @version 1.0
 */
public final class Application extends JFrame {

    private static final double CELSIUS_LIMIT = -273.15;
    private static final double FAHRENHEIT_LIMIT = -459.67;

    private final Map<String, Function<Double, Double>> CONVERSION_MAP = Map.of(
        "Celsius-Fahrenheit", Converter::c2f,
        "Fahrenheit-Celsius", Converter::f2c,
        "Celsius-Kelvin", Converter::c2k,
        "Kelvin-Celsius", Converter::k2c,
        "Fahrenheit-Kelvin", Converter::f2k,
        "Kelvin-Fahrenheit", Converter::k2f
    );

    /**
     * Crea la ventana de la aplicación.
     */
    public Application() {
        setTitle("Conversor de temperaturas");
        setResizable(false);
        setLocationRelativeTo(null);
        initComponents();
        Image icon = new ImageIcon(getClass().getResource("/resources/favicon.png")).getImage();
        setIconImage(icon);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(153, 153, 153));
        mainPanel.setForeground(new java.awt.Color(255, 255, 255));
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

        systemDegreesSelector.setBackground(new java.awt.Color(51, 51, 51));
        systemDegreesSelector.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        systemDegreesSelector.setForeground(new java.awt.Color(255, 255, 255));

        toLbl.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        toLbl.setText("A:");

        systemDegreesSelectorTo.setBackground(new java.awt.Color(51, 51, 51));
        systemDegreesSelectorTo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        systemDegreesSelectorTo.setForeground(new java.awt.Color(255, 255, 255));

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

        convertBtn.setBackground(new java.awt.Color(51, 51, 51));
        convertBtn.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        convertBtn.setForeground(new java.awt.Color(255, 255, 255));
        convertBtn.setText("Convertir");
        convertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convert(evt);
            }
        });

        resultField.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

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

        closeAppBtn.setBackground(new java.awt.Color(51, 51, 51));
        closeAppBtn.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        closeAppBtn.setForeground(new java.awt.Color(255, 255, 255));
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
        
        if(response == 0) System.exit(0);
    }

    /**
     * Método que muestra una ventana de confirmación
     * para salir de la aplicación pero al cerrar la ventana.
     * @param evt El evento, en este caso al hacer clic en la X.
     */
    private void close(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_close
        Integer response = Constants.close();
        if(response == 0) System.exit(0);
    }

    /**
     * Comprueba si los datos introducidos son válidos. Si no lo son,
     * devuelve el mensaje de error correspondiente.
     * @param degrees La cantidad de grados introducida por el usuario.
     * @param from El sistema de grados de origen.
     * @param to El sistema de grados de destino.
     * @return Un mensaje de error si los datos no son válidos o "" si los
     * datos son correctos.
     */
    private String getErrorMessage(String degrees, String from, String to) {
        var errorMessage = "";

        if(degrees.isEmpty()) errorMessage = "No se ha especificado una cantidad de grados.";
        else if (degrees.contains(",")) errorMessage = "Debes utilizar el . en vez de la , para expresar decimales.";
        else if (!degrees.matches("-?\\d+(\\.\\d+)?")) errorMessage = "La cantidad de grados debe ser un número válido.";
        else if (from.equals(to)) errorMessage = "El sistema de grados de origen y destino no puede ser el mismo.";
        else if (from.equals("Kelvin") && Double.parseDouble(degrees) < 0)
            errorMessage = "La temperatura en Kelvin no puede ser negativa.";
        else if (from.equals("Celsius") && Double.parseDouble(degrees) < CELSIUS_LIMIT)
            errorMessage = "La temperatura en Celsius no puede ser menor a -273.15.";
        else if (from.equals("Fahrenheit") && Double.parseDouble(degrees) < FAHRENHEIT_LIMIT)
            errorMessage = "La temperatura en Fahrenheit no puede ser menor a -459.67.";

        return errorMessage;
    }

    /**
     * Método que controla las acciones de los jcomboboxes
     * al pulsar el botón.
     * @param evt El evento, en este caso al hacer clic en el botón.
     */
    private void convert(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convert
        var degreesValue = degrees.getText();
        var from = systemDegreesSelector.getSelectedItem().toString();
        var to = systemDegreesSelectorTo.getSelectedItem().toString();
        var errorMessage = getErrorMessage(degreesValue, from, to);

        if(!errorMessage.isEmpty())
            Constants.showError(errorMessage);
        else{
            var key = from + "-" + to;

            Double result = CONVERSION_MAP.containsKey(key) ?
                CONVERSION_MAP.get(key).apply(Double.parseDouble(degreesValue)) : null;

            if (result != null) resultField.setText(result + "º" + to.charAt(0));
        }
    }

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
