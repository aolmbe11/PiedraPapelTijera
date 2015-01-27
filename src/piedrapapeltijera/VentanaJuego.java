package piedrapapeltijera;

import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javazoom.jl.player.Player;

public class VentanaJuego extends javax.swing.JFrame {

    public static final int CLASICO = 0;
    public static final int BIG_BANG = 1;

    private int apuestaUsuario = 0;
    private int apuestaPC = 0;

    private int manoVencedora = 0;

    private int puntuacionUsuario = 0;
    private int puntuacionPC = 0;

    public int getApuestaUsuario() {
        return apuestaUsuario;
    }

    public int getApuestaPC() {
       return apuestaPC;
    }

    private static Color colorTexto;

    private static int modoJuego;

    JDialogConfiguracion jDialogConfig = new JDialogConfiguracion(this, true);

    Random generaNum = new Random();

    ImageIcon piedrecita = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/piedra.png"));
    ImageIcon papelito = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/paperito.png"));
    ImageIcon tijerita = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/tijerita.png"));
    ImageIcon spockito = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/spockito.png"));
    ImageIcon lagartito = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/lizardito.png"));

    ImageIcon piedra = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/rock.png"));
    ImageIcon papel = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/Crumpled-Paper.png"));
    ImageIcon tijera = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/tijera.png"));
    ImageIcon lagarto = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/lizard.png"));
    ImageIcon spock = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/spock.png"));
    ImageIcon vs = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/vs.png"));

    public VentanaJuego() {
        initComponents();

        setLocationRelativeTo(null);

        jDialogConfig.setVisible(true);

        colorTexto = JDialogConfiguracion.getColorSeleccionado();

        contadorVictoriasUsuario.setForeground(colorTexto);
        contadorEmpates.setForeground(colorTexto);
        contadorVictoriasPC.setForeground(colorTexto);

        modoJuego = JDialogConfiguracion.getModoJuego();

        switch (modoJuego) {
            case 0:
                botonLagarto.setVisible(false);
                botonSpock.setVisible(false);
                break;
            case 1:
                botonLagarto.setVisible(true);
                botonSpock.setVisible(true);
                break;
        }

        etiquetaNomJugador.setText(JDialogConfiguracion.getNick());

        botonPiedra.setIcon(piedrecita);
        botonPapel.setIcon(papelito);
        botonTijeras.setIcon(tijerita);
        botonSpock.setIcon(spockito);
        botonLagarto.setIcon(lagartito);

        etiquetaVS.setIcon(vs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiquetaNomJugador = new javax.swing.JLabel();
        botonPiedra = new javax.swing.JButton();
        botonPapel = new javax.swing.JButton();
        botonTijeras = new javax.swing.JButton();
        botonSpock = new javax.swing.JButton();
        botonLagarto = new javax.swing.JButton();
        etiquetaApuestaJugador = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        etiquetaVS = new javax.swing.JLabel();
        contadorVictoriasUsuario = new javax.swing.JLabel();
        contadorVictoriasUsuario1 = new javax.swing.JLabel();
        contadorEmpates = new javax.swing.JLabel();
        contadorVictoriasPC = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        etiquetaOrdenador = new javax.swing.JLabel();
        etiquetaApuestaPC = new javax.swing.JLabel();
        botonConfig = new javax.swing.JButton();
        botonLeyenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        etiquetaNomJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaNomJugador.setToolTipText("");

        botonPiedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/lizardito.png"))); // NOI18N
        botonPiedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPiedraActionPerformed(evt);
            }
        });

        botonPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/lizardito.png"))); // NOI18N
        botonPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPapelActionPerformed(evt);
            }
        });

        botonTijeras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/lizardito.png"))); // NOI18N
        botonTijeras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTijerasActionPerformed(evt);
            }
        });

        botonSpock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/lizardito.png"))); // NOI18N
        botonSpock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSpockActionPerformed(evt);
            }
        });

        botonLagarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/lizardito.png"))); // NOI18N
        botonLagarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLagartoActionPerformed(evt);
            }
        });

        etiquetaApuestaJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaNomJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonPiedra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonPapel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonTijeras))
                    .addComponent(etiquetaApuestaJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonLagarto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonSpock)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(etiquetaNomJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPiedra)
                    .addComponent(botonPapel)
                    .addComponent(botonTijeras))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonLagarto)
                    .addComponent(botonSpock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiquetaApuestaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(257, 327));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText(" Victorias");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Empates");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Victorias");

        etiquetaVS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        contadorVictoriasUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        contadorEmpates.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        contadorVictoriasPC.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(contadorVictoriasUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(contadorVictoriasUsuario1, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(contadorEmpates, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel2)))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(contadorVictoriasPC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(etiquetaVS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(contadorVictoriasUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(contadorVictoriasPC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contadorVictoriasUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contadorEmpates, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaVS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(257, 327));

        etiquetaOrdenador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaOrdenador.setText("Ordenador");

        etiquetaApuestaPC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaOrdenador, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(etiquetaApuestaPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(etiquetaOrdenador, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaApuestaPC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        botonConfig.setText("Config");
        botonConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfigActionPerformed(evt);
            }
        });

        botonLeyenda.setText("Leyenda");
        botonLeyenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLeyendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonConfig)
                        .addGap(18, 18, 18)
                        .addComponent(botonLeyenda)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonConfig)
                    .addComponent(botonLeyenda))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPiedraActionPerformed

        etiquetaApuestaJugador.setIcon(piedra);

        apuestaUsuario = PiedraPapelTijera.PIEDRA;

        // Crear método para repetir en el resto de los botones. Hay que pasarle la apuesta del usuario
        // por parámetros, y genera la apuesta del pc, calcula el vencedor, muestra los datos, 
        // reinicia la partida y limpia la pantalla.
        this.controlaJugada(apuestaUsuario);

        System.out.println("Puntuacion PC en Ventana " + puntuacionPC);
        System.out.println("Puntuacion Usuario en Ventana " + puntuacionUsuario);


    }//GEN-LAST:event_botonPiedraActionPerformed

    private void botonPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPapelActionPerformed

        etiquetaApuestaJugador.setIcon(papel);

        apuestaUsuario = PiedraPapelTijera.PAPEL;

        this.controlaJugada(apuestaUsuario);

        System.out.println("Puntuacion PC en Ventana " + puntuacionPC);
        System.out.println("Puntuacion Usuario en Ventana " + puntuacionUsuario);

    }//GEN-LAST:event_botonPapelActionPerformed

    private void botonTijerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTijerasActionPerformed

        etiquetaApuestaJugador.setIcon(tijera);

        apuestaUsuario = PiedraPapelTijera.TIJERA;

        this.controlaJugada(apuestaUsuario);

        System.out.println("Puntuacion PC en Ventana " + puntuacionPC);
        System.out.println("Puntuacion Usuario en Ventana " + puntuacionUsuario);
    }//GEN-LAST:event_botonTijerasActionPerformed

    private void botonLagartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLagartoActionPerformed

        etiquetaApuestaJugador.setIcon(lagarto);

        apuestaUsuario = PiedraPapelTijera.LAGARTO;

        this.controlaJugada(apuestaUsuario);

        System.out.println("Puntuacion PC en Ventana " + puntuacionPC);
        System.out.println("Puntuacion Usuario en Ventana " + puntuacionUsuario);

    }//GEN-LAST:event_botonLagartoActionPerformed

    private void botonSpockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSpockActionPerformed

        etiquetaApuestaJugador.setIcon(spock);

        apuestaUsuario = PiedraPapelTijera.SPOCK;

        apuestaPC = this.generarApuestaPC();

        this.controlaJugada(apuestaUsuario);

        System.out.println("Puntuacion PC en Ventana " + puntuacionPC);
        System.out.println("Puntuacion Usuario en Ventana " + puntuacionUsuario);

    }//GEN-LAST:event_botonSpockActionPerformed

    private void botonConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfigActionPerformed
        jDialogConfig.setVisible(true);
        modoJuego = JDialogConfiguracion.getModoJuego();
        switch (modoJuego) {
            case 0:
                botonLagarto.setVisible(false);
                botonSpock.setVisible(false);
                break;
            case 1:
                botonLagarto.setVisible(true);
                botonSpock.setVisible(true);
                break;
        }

        colorTexto = JDialogConfiguracion.getColorSeleccionado();

        contadorVictoriasUsuario.setForeground(colorTexto);
        contadorEmpates.setForeground(colorTexto);
        contadorVictoriasPC.setForeground(colorTexto);

    }//GEN-LAST:event_botonConfigActionPerformed

    private void botonLeyendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLeyendaActionPerformed

        ImageIcon leyenda = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/leyenda.png"));
        JOptionPane.showMessageDialog(this, null, "Leyenda", JOptionPane.PLAIN_MESSAGE, leyenda);
    }//GEN-LAST:event_botonLeyendaActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaJuego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConfig;
    private javax.swing.JButton botonLagarto;
    private javax.swing.JButton botonLeyenda;
    private javax.swing.JButton botonPapel;
    private javax.swing.JButton botonPiedra;
    private javax.swing.JButton botonSpock;
    private javax.swing.JButton botonTijeras;
    private javax.swing.JLabel contadorEmpates;
    private javax.swing.JLabel contadorVictoriasPC;
    private javax.swing.JLabel contadorVictoriasUsuario;
    private javax.swing.JLabel contadorVictoriasUsuario1;
    private javax.swing.JLabel etiquetaApuestaJugador;
    private javax.swing.JLabel etiquetaApuestaPC;
    private javax.swing.JLabel etiquetaNomJugador;
    private javax.swing.JLabel etiquetaOrdenador;
    private javax.swing.JLabel etiquetaVS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    private int generarApuestaPC() {

        if (modoJuego == CLASICO) {
            apuestaPC = generaNum.nextInt(3) + 1;
        } else {
            if (modoJuego == BIG_BANG) {
                apuestaPC = generaNum.nextInt(5) + 1;
            }
        }

        switch (apuestaPC) {
            case 1:
                etiquetaApuestaPC.setIcon(piedra);
                break;
            case 2:
                etiquetaApuestaPC.setIcon(papel);
                break;
            case 3:
                etiquetaApuestaPC.setIcon(tijera);
                break;
            case 4:
                etiquetaApuestaPC.setIcon(lagarto);
                break;
            case 5:
                etiquetaApuestaPC.setIcon(spock);
                break;
        }
        return apuestaPC;
    }

    private void limpiarPantalla() {

        etiquetaNomJugador.setText(JDialogConfiguracion.getNick());
        jDialogConfig.limpiaNick();
        contadorEmpates.setText("");
        contadorVictoriasPC.setText("");
        contadorVictoriasUsuario.setText("");
        etiquetaApuestaJugador.setIcon(null);
        etiquetaApuestaPC.setIcon(null);
    }

    private void renovarPantallaConfig() {
        jDialogConfig.setVisible(true);

        colorTexto = JDialogConfiguracion.getColorSeleccionado();

        contadorVictoriasUsuario.setForeground(colorTexto);
        contadorEmpates.setForeground(colorTexto);
        contadorVictoriasPC.setForeground(colorTexto);

        modoJuego = JDialogConfiguracion.getModoJuego();

        switch (modoJuego) {
            case 0:
                botonLagarto.setVisible(false);
                botonSpock.setVisible(false);
                break;
            case 1:
                botonLagarto.setVisible(true);
                botonSpock.setVisible(true);
                break;
        }

        etiquetaNomJugador.setText(JDialogConfiguracion.getNick());
    }

    private void controlaJugada(int apuestaUsuario) {

        apuestaPC = this.generarApuestaPC();

        manoVencedora = PiedraPapelTijera.vencedor(apuestaUsuario, apuestaPC);

        PiedraPapelTijera.puntuar(manoVencedora);
   
        contadorVictoriasUsuario.setText(String.valueOf(PiedraPapelTijera.getPuntuacionUsuario()));
        contadorEmpates.setText(String.valueOf(PiedraPapelTijera.getPuntuacionEmpate()));
        contadorVictoriasPC.setText(String.valueOf(PiedraPapelTijera.getPuntuacionPC()));
        
        this.sonidoGanador();

        if (PiedraPapelTijera.partidaAcabada()) {

            if (PiedraPapelTijera.getPuntuacionPC() > PiedraPapelTijera.getPuntuacionUsuario()) {
                JOptionPane.showMessageDialog(this, "Gana PC");
            } else {
                if (PiedraPapelTijera.getPuntuacionPC() == PiedraPapelTijera.getPuntuacionUsuario()) {
                    JOptionPane.showMessageDialog(this, "Empate");
                } else {
                    JOptionPane.showMessageDialog(this, "Gana " + JDialogConfiguracion.getNick());
                }
            }
            PiedraPapelTijera.reiniciar();
            // método limpiar pantalla?
            this.limpiarPantalla();

            // Método renovar pantallaConfig.
            this.renovarPantallaConfig();
        }
    }

    private void sonidoGanador() {
        switch (manoVencedora) {
            case PiedraPapelTijera.PIEDRA:
                try {
                    Player player = new Player(getClass().getResourceAsStream("/piedrapapeltijera/sonidos/piedra.mp3"));
                    player.play();
                    player.close();
                } catch (Exception e) {
                    System.out.println("Error al reproducir el audio");
                }
                break;
            case PiedraPapelTijera.PAPEL:
                try {
                    Player player = new Player(getClass().getResourceAsStream("/piedrapapeltijera/sonidos/paper-rustle-5.mp3"));
                    player.play();
                    player.close();
                } catch (Exception e) {
                    System.out.println("Error al reproducir el audio");
                }
                break;
            case PiedraPapelTijera.TIJERA:
                try {
                    Player player = new Player(getClass().getResourceAsStream("/piedrapapeltijera/sonidos/salamisound-1020102-paper-scissors-office.mp3"));
                    player.play();
                    player.close();
                } catch (Exception e) {
                    System.out.println("Error al reproducir el audio");
                }
                break;
            case PiedraPapelTijera.LAGARTO:
                try {
                    Player player = new Player(getClass().getResourceAsStream("/piedrapapeltijera/sonidos/Velociraptor Call-SoundBible.com-1782075819.mp3"));
                    player.play();
                    player.close();
                } catch (Exception e) {
                    System.out.println("Error al reproducir el audio");
                }
                break;
            case PiedraPapelTijera.SPOCK:
                try {
                    Player player = new Player(getClass().getResourceAsStream("/piedrapapeltijera/sonidos/Spock_Checkmate.mp3"));
                    player.play();
                    player.close();
                } catch (Exception e) {
                    System.out.println("Error al reproducir el audio");
                }
                break;
        }
    }

}
