package com.temperatureconverter.view;

import com.temperatureconverter.classes.Constants;
import javax.swing.JFrame;

/**
 * Clase main que ejecuta la ventana inicial de la aplicación.
 * @author Zabieru
 * @version 1.0
 */
public final class PrincipalWindow extends JFrame {

    /**
     * Constructor que crea la ventana principal.
     */
    public PrincipalWindow() {
        setSize(800,500);
        setResizable(false);
        setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        aplicationTitle = new javax.swing.JLabel();
        aplicationLogo = new javax.swing.JLabel();
        startBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor de Temperaturas");
        setBackground(new java.awt.Color(51, 51, 51));
        setBounds(new java.awt.Rectangle(0, 0, 500, 800));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(51, 51, 51));

        aplicationTitle.setFont(new java.awt.Font("Bookman Old Style", 0, 36)); // NOI18N
        aplicationTitle.setForeground(new java.awt.Color(255, 255, 255));
        aplicationTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aplicationTitle.setText("Conversor de temperaturas");

        aplicationLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aplicationLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/termometro.png"))); // NOI18N

        startBtn.setBackground(new java.awt.Color(102, 102, 102));
        startBtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        startBtn.setForeground(new java.awt.Color(255, 255, 255));
        startBtn.setText("Iniciar");
        startBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startApplication(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aplicationTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(aplicationLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGap(184, 184, 184)
                            .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(aplicationTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aplicationLogo)
                .addGap(57, 57, 57)
                .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
     * Método que activa el evento del botón iniciar
     * y llama al constructor de la ventana principal de
     * la aplicación.
     * @param evt El evento de acción. En este caso al hacer
     * clic en el botón.
     */
    private void startApplication(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startApplication
        Application app = new Application();
        app.setVisible(true);
        dispose();
    }//GEN-LAST:event_startApplication

    private void close(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_close
        Integer response = Constants.close();
        
        if(response == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_close

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PrincipalWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aplicationLogo;
    private javax.swing.JLabel aplicationTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton startBtn;
    // End of variables declaration//GEN-END:variables
}