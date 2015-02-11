package piedrapapeltijera;

import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * Ventana Principal del juego Piedra, Papel, Tijera.
 *
 * @author Ángel Olmedo Benítez
 * @version 1.0
 */
public class VentanaJuego extends javax.swing.JFrame {

    /**
     * CLASICO constante para indicar el modo de juego Clásico.
     */
    public static final int CLASICO = 0;
    /**
     * BIG_BANG constante para indicar el modo de juego Big Bang Theory.
     */
    public static final int BIG_BANG = 1;

    private static int apuestaUsuario = 0;
    private static int apuestaRival = 0;

    private int manoVencedora = 0;

    private int puntuacionUsuario = 0;
    private int puntuacionPC = 0;

    private String nickRival;

    private Servidor servidor;
    private Cliente cliente;

    private static Color colorTexto;

    private static int modoJuego;

    private JDialogConfiguracion jDialogConfig = new JDialogConfiguracion(this, true);

    private Random generaNum = new Random();

    private ImageIcon piedrecita = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/piedra.png"));
    private ImageIcon papelito = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/paperito.png"));
    private ImageIcon tijerita = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/tijerita.png"));
    private ImageIcon spockito = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/spockito.png"));
    private ImageIcon lagartito = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/lizardito.png"));

    private ImageIcon piedra = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/rock.png"));
    private ImageIcon papel = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/Crumpled-Paper.png"));
    private ImageIcon tijera = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/tijera.png"));
    private ImageIcon lagarto = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/lizard.png"));
    private ImageIcon spock = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/spock.png"));
    private ImageIcon vs = new ImageIcon(getClass().getResource("/piedrapapeltijera/imagenes/vs.png"));
    
   

    public VentanaJuego() {
        initComponents();

        jDialogConfig.setVisible(true);

        if (JDialogConfiguracion.getModoMultijugador() == 1) {
            servidor = new Servidor(1024);
            servidor.start();
            System.out.println("He creado Servidor");
//            servidor.enviarNick();
//            nickRival = servidor.recibirNick();
//            etiquetaNickRival.setText(nickRival);
        } else {
            if (JDialogConfiguracion.getModoMultijugador() == 2) {
                cliente = new Cliente("localhost", 1024);
                System.out.println("He creado Cliente");
//                cliente.enviarNick();
//                nickRival = cliente.recibirNick();
//                etiquetaNickRival.setText(nickRival);
            }
        }

        if(JDialogConfiguracion.isMultijugadorActivo() == false){
            etiquetaNickRival.setText("Ordenador");
        } else{
            etiquetaNickRival.setText("Rival");
        }
        
        
        setLocationRelativeTo(null);

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
        etiquetaNickRival = new javax.swing.JLabel();
        etiquetaApuestaPC = new javax.swing.JLabel();
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

        contadorVictoriasUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        contadorEmpates.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

        contadorVictoriasPC.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N

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

        etiquetaNickRival.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etiquetaApuestaPC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaNickRival, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(etiquetaApuestaPC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(etiquetaNickRival, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaApuestaPC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

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
                .addComponent(botonLeyenda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPiedraActionPerformed

        etiquetaApuestaJugador.setIcon(piedra);

        apuestaUsuario = PiedraPapelTijera.PIEDRA;
        this.controlaJugada(apuestaUsuario);

        System.out.println("Puntuacion PC en Ventana " + apuestaRival);
        System.out.println("Puntuacion Usuario en Ventana " + puntuacionUsuario);


    }//GEN-LAST:event_botonPiedraActionPerformed

    private void botonPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPapelActionPerformed

        etiquetaApuestaJugador.setIcon(papel);

        apuestaUsuario = PiedraPapelTijera.PAPEL;

        this.controlaJugada(apuestaUsuario);

        System.out.println("Puntuacion PC en Ventana " + apuestaRival);
        System.out.println("Puntuacion Usuario en Ventana " + puntuacionUsuario);

    }//GEN-LAST:event_botonPapelActionPerformed

    private void botonTijerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTijerasActionPerformed

        etiquetaApuestaJugador.setIcon(tijera);

        apuestaUsuario = PiedraPapelTijera.TIJERA;

        this.controlaJugada(apuestaUsuario);

        System.out.println("Puntuacion PC en Ventana " + apuestaRival);
        System.out.println("Puntuacion Usuario en Ventana " + puntuacionUsuario);
    }//GEN-LAST:event_botonTijerasActionPerformed

    private void botonLagartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLagartoActionPerformed

        etiquetaApuestaJugador.setIcon(lagarto);

        apuestaUsuario = PiedraPapelTijera.LAGARTO;

        this.controlaJugada(apuestaUsuario);

        System.out.println("Puntuacion PC en Ventana " + apuestaRival);
        System.out.println("Puntuacion Usuario en Ventana " + puntuacionUsuario);

    }//GEN-LAST:event_botonLagartoActionPerformed

    private void botonSpockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSpockActionPerformed

        etiquetaApuestaJugador.setIcon(spock);

        apuestaUsuario = PiedraPapelTijera.SPOCK;

        this.controlaJugada(apuestaUsuario);

        System.out.println("Puntuacion PC en Ventana " + puntuacionPC);
        System.out.println("Puntuacion Usuario en Ventana " + puntuacionUsuario);

    }//GEN-LAST:event_botonSpockActionPerformed

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
    private javax.swing.JLabel etiquetaNickRival;
    private javax.swing.JLabel etiquetaNomJugador;
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
            apuestaRival = generaNum.nextInt(3) + 1;
        } else {
            if (modoJuego == BIG_BANG) {
                apuestaRival = generaNum.nextInt(5) + 1;
            }
        }

        switch (apuestaRival) {
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
        return apuestaRival;
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

        if (JDialogConfiguracion.isMultijugadorActivo()) {
            switch (JDialogConfiguracion.getModoMultijugador()) {
                case 1:
                    // meter en do while, !servidor.cerrarConexion ? 
                    System.out.println("Apuesta Usuario: " + VentanaJuego.apuestaUsuario);
                    servidor.enviarDatos(VentanaJuego.apuestaUsuario);
                    System.out.println("Ha enviado datos");
                    //servidor.enviarNick();
                    //nickRival = servidor.recibirNick();
                    //etiquetaNickRival.setText(nickRival);
                    apuestaRival = servidor.recibirDatos();
                    switch (apuestaRival) {
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
                    break;
                case 2:
                    cliente.enviarDatos(VentanaJuego.apuestaUsuario);
                    //cliente.enviarNick();
                    //nickRival = cliente.recibirNick();
                    //etiquetaNickRival.setText(nickRival);
                    System.out.println("Ha enviado datos el cliente");
                    //cliente.start();

                    apuestaRival = cliente.recibirDatos();
                    switch (apuestaRival) {
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
                    break;
            }
        } else {
            etiquetaNickRival.setText("Ordenador");
            apuestaRival = this.generarApuestaPC();
        }

        manoVencedora = PiedraPapelTijera.vencedor(apuestaUsuario, apuestaRival);
        
        Reproductor reproductor = new Reproductor();
        reproductor.getManoVencedora(manoVencedora);

        PiedraPapelTijera.puntuar(manoVencedora);

        contadorVictoriasUsuario.setText(String.valueOf(PiedraPapelTijera.getPuntuacionUsuario()));
        contadorEmpates.setText(String.valueOf(PiedraPapelTijera.getPuntuacionEmpate()));
        contadorVictoriasPC.setText(String.valueOf(PiedraPapelTijera.getPuntuacionRival()));
        
        reproductor.start();

        if (PiedraPapelTijera.partidaAcabada()) {

            if (PiedraPapelTijera.getPuntuacionRival() > PiedraPapelTijera.getPuntuacionUsuario()) {
                JOptionPane.showMessageDialog(this, "Gana Rival");
            } else {
                if (PiedraPapelTijera.getPuntuacionRival() == PiedraPapelTijera.getPuntuacionUsuario()) {
                    JOptionPane.showMessageDialog(this, "Empate");
                } else {
                    JOptionPane.showMessageDialog(this, "Gana " + JDialogConfiguracion.getNick());
                }
            }
            PiedraPapelTijera.reiniciar();
            this.limpiarPantalla();
            this.renovarPantallaConfig();
        }
    }

    
    

}
