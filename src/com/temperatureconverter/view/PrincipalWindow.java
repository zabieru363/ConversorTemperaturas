package com.temperatureconverter.view;

import com.temperatureconverter.classes.Constants;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Calendar;
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
        setResizable(false);
        setLocationRelativeTo(null);
        initComponents();
        setBounds(10, 10, 730, 800);
        // Utilizo la clase Calendar para hacer el año dinámico.
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        copyright.setText("Powered by Zabieru © - " + year);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        aplicationTitle = new javax.swing.JLabel();
        aplicationLogo = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        startBtn = new javax.swing.JButton();
        socialNetworksPanel = new javax.swing.JPanel();
        mail = new javax.swing.JLabel();
        instagram = new javax.swing.JLabel();
        twitter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
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

        copyright.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        copyright.setForeground(new java.awt.Color(255, 255, 255));

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

        socialNetworksPanel.setBackground(new java.awt.Color(51, 51, 51));
        socialNetworksPanel.setForeground(new java.awt.Color(255, 255, 255));
        socialNetworksPanel.setLayout(new java.awt.GridLayout(3, 0));

        mail.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mail.setForeground(new java.awt.Color(255, 255, 255));
        mail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/mail-logo.png"))); // NOI18N
        mail.setText("zabierujlc@gmail.com");
        socialNetworksPanel.add(mail);

        instagram.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        instagram.setForeground(new java.awt.Color(255, 255, 255));
        instagram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        instagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/insagram-logo.png"))); // NOI18N
        instagram.setText("@zabieru.exe");
        instagram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openInstagram(evt);
            }
        });
        socialNetworksPanel.add(instagram);

        twitter.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        twitter.setForeground(new java.awt.Color(255, 255, 255));
        twitter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/twitter-logo.png"))); // NOI18N
        twitter.setText("@Zabieru222");
        twitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openTwitter(evt);
            }
        });
        socialNetworksPanel.add(twitter);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aplicationTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aplicationLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(copyright))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(socialNetworksPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(startBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(aplicationTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aplicationLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyright)
                .addGap(29, 29, 29)
                .addComponent(startBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(socialNetworksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void openInstagram(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openInstagram
        try{
            Desktop.getDesktop().browse(new URI("https://www.instagram.com/zabieru.exe/"));
        }catch(IOException | URISyntaxException ex){
            System.out.println("Error. No se pudeo abrir la pagina de instagram del creador");
        }
    }//GEN-LAST:event_openInstagram

    private void openTwitter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openTwitter
        try{
            Desktop.getDesktop().browse(new URI("https://twitter.com/Zabieru222"));
        }catch(IOException | URISyntaxException ex){
            System.out.println("Error. No se pudeo abrir la pagina de twitter del creador");
        }
    }//GEN-LAST:event_openTwitter

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new PrincipalWindow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aplicationLogo;
    private javax.swing.JLabel aplicationTitle;
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel instagram;
    private javax.swing.JLabel mail;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel socialNetworksPanel;
    private javax.swing.JButton startBtn;
    private javax.swing.JLabel twitter;
    // End of variables declaration//GEN-END:variables
}