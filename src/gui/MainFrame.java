//*************************************************************
// FUNDAMENTOS DE ANÁLISIS Y DISEÑO DE ALGORITMOS
// MINIPROYECTO 2 - FADA: PROGRAMACIÓN DINÁMICA Y VORAZ:
//                        TRIANGULACIÓN DE POLÍGONOS
//
// WEB PAGE: http://gustalibreros.github.com/MINIPROYECTO2_FADA
//
// FECHA INICIACION: JUNIO DE 2012
//
// ARCHIVO: MainFrame.java
//
// FECHA:  22.06.12
//
// AUTORES:
//     Marx Arturo Arias - 0840247-3743
//     marxarturoariasescobar@gmail.com
//
//     Luis Jeferson Gallardo - 0843805-2711
//     luisjhefeerson@gmail.com
//
//     Fidel Herney Palacios - 0832691-3743
//     herney400@gmail.com
//
//     Gustavo Adolfo Rodriguez - 0932979-3743    
//     gustalibreros@gmail.com
//
// ESCUELA DE INGENIERIA DE SISTEMAS Y COMPUTACION
// UNIVERSIDAD DEL VALLE
//*************************************************************
package gui;

import java.io.File;
import java.text.DecimalFormat;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import logica.Poligono;
import logica.TrianguladorMinimalDinamico;
import logica.TrianguladorMinimalVoraz;

public class MainFrame extends javax.swing.JFrame {

    private Poligono poligono;
    private PanelGraphiclView jPanelGraphiclView;
    double zoomFactor;
    private final DecimalFormat df;
    private TrianguladorMinimalDinamico trianDinamico;
    private TrianguladorMinimalVoraz trianVoraz;

    public MainFrame() {

        initComponents();
        df = new DecimalFormat("#.#####");
        zoomFactor = 1;
        jPanelGraphiclView = new PanelGraphiclView();
        jPanelGraphiclView.setLayout(null);
        jScrollPanelGraphView.setViewportView(jPanelGraphiclView);
        trianDinamico = null;
        trianVoraz = null;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabelLogo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelSubtitulo = new javax.swing.JLabel();
        jLabelSubtitulo1 = new javax.swing.JLabel();
        jLabelTextView = new javax.swing.JLabel();
        jLabelgraphicalview = new javax.swing.JLabel();
        jScrollPaneTextView = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jScrollPanelGraphView = new javax.swing.JScrollPane();
        jSeparator3 = new javax.swing.JSeparator();
        jLabelTextView1 = new javax.swing.JLabel();
        jButtonDinamico = new javax.swing.JButton();
        jLabelResultado = new javax.swing.JLabel();
        jButtonLoad = new javax.swing.JButton();
        jLabelZomm = new javax.swing.JLabel();
        jButtonVoraz = new javax.swing.JButton();
        jButtonZoomMenos = new javax.swing.JButton();
        jButtonZoomMas = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMISalir = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMIAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MINIPROYECTO 1 - FADA");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanelPrincipal.setLayout(null);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/UNIVALLE.jpg"))); // NOI18N
        jPanelPrincipal.add(jLabelLogo);
        jLabelLogo.setBounds(10, 10, 58, 80);
        jPanelPrincipal.add(jSeparator1);
        jSeparator1.setBounds(0, 100, 400, 5);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelPrincipal.add(jSeparator2);
        jSeparator2.setBounds(400, 0, 2, 600);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("FUNDAMENTOS DE ANÁLISIS Y DISEÑO DE ALGORITMOS");
        jPanelPrincipal.add(jLabelTitulo);
        jLabelTitulo.setBounds(70, 10, 330, 20);

        jLabelSubtitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabelSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubtitulo.setText("MINIPROYECTO 2 - PROGRAMACIÓN DINÁMICA Y VORAZ");
        jPanelPrincipal.add(jLabelSubtitulo);
        jLabelSubtitulo.setBounds(70, 30, 330, 20);

        jLabelSubtitulo1.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabelSubtitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubtitulo1.setText("TRIANGULACIÓN DE POLIGONOS");
        jPanelPrincipal.add(jLabelSubtitulo1);
        jLabelSubtitulo1.setBounds(70, 55, 330, 30);

        jLabelTextView.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelTextView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTextView.setText("VISTA TEXTO");
        jPanelPrincipal.add(jLabelTextView);
        jLabelTextView.setBounds(200, 110, 200, 30);

        jLabelgraphicalview.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelgraphicalview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelgraphicalview.setText("VISTA GRAFICA");
        jPanelPrincipal.add(jLabelgraphicalview);
        jLabelgraphicalview.setBounds(400, 10, 600, 30);

        jScrollPaneTextView.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea.setColumns(20);
        jTextArea.setEditable(false);
        jTextArea.setRows(5);
        jScrollPaneTextView.setViewportView(jTextArea);

        jPanelPrincipal.add(jScrollPaneTextView);
        jScrollPaneTextView.setBounds(220, 150, 160, 420);

        jScrollPanelGraphView.setBackground(new java.awt.Color(242, 240, 240));
        jPanelPrincipal.add(jScrollPanelGraphView);
        jScrollPanelGraphView.setBounds(420, 50, 560, 490);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelPrincipal.add(jSeparator3);
        jSeparator3.setBounds(200, 100, 2, 500);

        jLabelTextView1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelTextView1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTextView1.setText("OPCIONES");
        jPanelPrincipal.add(jLabelTextView1);
        jLabelTextView1.setBounds(0, 110, 200, 30);

        jButtonDinamico.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        jButtonDinamico.setText("Dinamico");
        jButtonDinamico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDinamicoActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonDinamico);
        jButtonDinamico.setBounds(20, 330, 160, 40);

        jLabelResultado.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabelResultado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelResultado.setText("RESULTADO TRIANGULACION MINIMAL:");
        jPanelPrincipal.add(jLabelResultado);
        jLabelResultado.setBounds(420, 550, 560, 30);

        jButtonLoad.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        jButtonLoad.setText("Cargar Poligono");
        jButtonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonLoad);
        jButtonLoad.setBounds(20, 150, 160, 40);

        jLabelZomm.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jLabelZomm.setText("ZOOM:");
        jPanelPrincipal.add(jLabelZomm);
        jLabelZomm.setBounds(20, 230, 100, 19);

        jButtonVoraz.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        jButtonVoraz.setText("Voraz");
        jButtonVoraz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVorazActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonVoraz);
        jButtonVoraz.setBounds(20, 400, 160, 40);

        jButtonZoomMenos.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jButtonZoomMenos.setText("-");
        jButtonZoomMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZoomMenosActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonZoomMenos);
        jButtonZoomMenos.setBounds(50, 260, 45, 45);

        jButtonZoomMas.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jButtonZoomMas.setText("+");
        jButtonZoomMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZoomMasActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonZoomMas);
        jButtonZoomMas.setBounds(110, 260, 45, 45);

        jButtonGuardar.setFont(new java.awt.Font("Trebuchet MS", 0, 17)); // NOI18N
        jButtonGuardar.setText("Guardar Solucion");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonGuardar);
        jButtonGuardar.setBounds(20, 530, 160, 40);

        getContentPane().add(jPanelPrincipal);
        jPanelPrincipal.setBounds(0, 0, 1000, 600);

        jMenuArchivo.setText("Archivo");

        jMISalir.setText("Salir");
        jMISalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMISalir);

        jMenuBar.add(jMenuArchivo);

        jMenuAyuda.setText("Ayuda");

        jMIAcercaDe.setText("Acerca de");
        jMIAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIAcercaDeActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jMIAcercaDe);

        jMenuBar.add(jMenuAyuda);

        setJMenuBar(jMenuBar);

        setBounds(0, 0, 1010, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void jMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMISalirActionPerformed

    private void jMIAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAcercaDeActionPerformed
        // <editor-fold defaultstate="collapsed" desc="jMIAcercaDeActionPerformed()">
        String acercaDe = " FUNDAMENTOS DE ANÁLISIS Y DISEÑO DE ALGORITMOS"
                + "\n MINIPROYECTO 2 - FADA: PROGRAMACIÓN DINÁMICA Y VORAZ:"
                + "\n                        TRIANGULACIÓN DE POLÍGONOS"
                + "\n"
                + "\n WEB PAGE: http://gustalibreros.github.com/MINIPROYECTO2_FADA"
                + "\n"
                + "\n FECHA INICIACION: JUNIO DE 2012"
                + "\n"
                + "\n AUTORES:"
                + "\n     Marx Arturo Arias - 0840247-3743"
                + "\n     marxarturoariasescobar@gmail.com"
                + "\n"
                + "\n     Luis Jeferson Gallardo - 0843805-2711"
                + "\n     luisjhefeerson@gmail.com"
                + "\n"
                + "\n     Fidel Herney Palacios - 0832691-3743"
                + "\n     herney400@gmail.com"
                + "\n"
                + "\n     Gustavo Adolfo Rodriguez - 0932979-3743    "
                + "\n     gustalibreros@gmail.com"
                + "\n"
                + "\n ESCUELA DE INGENIERIA DE SISTEMAS Y COMPUTACION"
                + "\n UNIVERSIDAD DEL VALLE";

        JOptionPane.showMessageDialog(this, acercaDe, "Acerda de", JOptionPane.INFORMATION_MESSAGE);

        // </editor-fold>
    }//GEN-LAST:event_jMIAcercaDeActionPerformed

    private void jButtonDinamicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDinamicoActionPerformed

        if (poligono != null) {
            trianVoraz = null;
            trianDinamico = new TrianguladorMinimalDinamico(poligono);
            jLabelResultado.setText("RESULTADO TRIANGULACION MINIMAL: " + df.format(trianDinamico.calcularTriangulacion(0, poligono.npoints)));
            trianDinamico.construirSolucionOptima(0, poligono.npoints);
            jPanelGraphiclView.setMatrizCuerdas(trianDinamico.getMatrizCuerdas());
            jPanelGraphiclView.repaint();
        }


    }//GEN-LAST:event_jButtonDinamicoActionPerformed

    private void jButtonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadActionPerformed

        JFileChooser selectorArchivo = new JFileChooser("./pruebas/");
        selectorArchivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int resultado = selectorArchivo.showOpenDialog(this);

        if (resultado != JFileChooser.CANCEL_OPTION) {

            File selectedFile = selectorArchivo.getSelectedFile();
            poligono = new Poligono();

            if (poligono.loadFromFile(selectedFile)) {

                jTextArea.setText(poligono.getTextoEnArchivo());
                zoomFactor = 1;
                graficarPoligono();
                jLabelResultado.setText("RESULTADO TRIANGULACION MINIMAL: ");
                jPanelGraphiclView.setMatrizCuerdas(null);

            } else {
                JOptionPane.showMessageDialog(this, "El archivo no pudo ser procesado", "Formato no Valido",
                        JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_jButtonLoadActionPerformed

    private void jButtonVorazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVorazActionPerformed

        if (poligono != null) {
            trianDinamico = null;
            trianVoraz = new TrianguladorMinimalVoraz(poligono);
            jLabelResultado.setText("RESULTADO TRIANGULACION MINIMAL: " + df.format(trianVoraz.calcularTriangulacion(0, poligono.npoints)));
            trianVoraz.construirSolucionOptima(0, poligono.npoints);
            jPanelGraphiclView.setMatrizCuerdas(trianVoraz.getMatrizCuerdas());
            jPanelGraphiclView.repaint();
        }

    }//GEN-LAST:event_jButtonVorazActionPerformed

    private void jButtonZoomMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZoomMenosActionPerformed


        if (trianDinamico != null || trianVoraz != null) {
            if (zoomFactor > 1) {
                zoomFactor -= 0.5;
            } else if (zoomFactor > 0) {
                zoomFactor = zoomFactor - 0.1;
            }
            poligono.escalarAWT(zoomFactor);
            graficarPoligono();
        }

    }//GEN-LAST:event_jButtonZoomMenosActionPerformed

    private void jButtonZoomMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZoomMasActionPerformed

        if (trianDinamico != null || trianVoraz != null) {
            if (zoomFactor >= 1) {
                zoomFactor += 0.5;
            } else {
                zoomFactor = zoomFactor + 0.1;
            }
            poligono.escalarAWT(zoomFactor);
            graficarPoligono();
        }

    }//GEN-LAST:event_jButtonZoomMasActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        if (poligono != null && (trianDinamico != null || trianVoraz != null)) {
            JFileChooser selectorArchivo = new JFileChooser("./pruebas/");
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");

            selectorArchivo.setFileFilter(filter);
            selectorArchivo.setFileSelectionMode(JFileChooser.FILES_ONLY);

            int resultado = selectorArchivo.showSaveDialog(this);

            if (resultado != JFileChooser.CANCEL_OPTION) {
                File selectedFile = new File(selectorArchivo.getSelectedFile().getAbsolutePath() + ".txt");

                if (trianDinamico != null && trianVoraz == null) {
                    trianDinamico.saveToFile(selectedFile);
                }
                if (trianDinamico == null && trianVoraz != null) {
                    trianVoraz.saveToFile(selectedFile);
                }

            }
        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void graficarPoligono() {

        int initialX = (jPanelGraphiclView.getWidth() - poligono.getWidth()) / 2;
        int initialY = (jPanelGraphiclView.getHeight() - poligono.getHeight()) / 2;

        for (int i = 0; i < poligono.getNpoints(); i++) {
            poligono.getYpoints()[i] = poligono.getYpoints()[i] + initialY;
            poligono.getXpoints()[i] = poligono.getXpoints()[i] + initialX;
        }

        jPanelGraphiclView.setPoligono(poligono);
        jPanelGraphiclView.repaint();
    }

    public static void main(String args[]) {

        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">

        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // </editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDinamico;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonLoad;
    private javax.swing.JButton jButtonVoraz;
    private javax.swing.JButton jButtonZoomMas;
    private javax.swing.JButton jButtonZoomMenos;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JLabel jLabelSubtitulo;
    private javax.swing.JLabel jLabelSubtitulo1;
    private javax.swing.JLabel jLabelTextView;
    private javax.swing.JLabel jLabelTextView1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelZomm;
    private javax.swing.JLabel jLabelgraphicalview;
    private javax.swing.JMenuItem jMIAcercaDe;
    private javax.swing.JMenuItem jMISalir;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPaneTextView;
    private javax.swing.JScrollPane jScrollPanelGraphView;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea;
    // End of variables declaration//GEN-END:variables
}
