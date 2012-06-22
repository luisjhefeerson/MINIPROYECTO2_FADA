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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import logica.Poligono;

/**
 * Class description
 *
 *
 * @version Enter version here..., 01.06.12
 * @author Enter your name here...
 */
public class MainFrame extends javax.swing.JFrame {

    Poligono poligono;

    /**
     * Constructs ...
     *
     */
    public MainFrame() {
        
        initComponents();
    }

    /**
     * Method description
     *
     */
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
        jPanelGraphiclView = new javax.swing.JPanel();
        jButtonBorrar = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMICargarTablero = new javax.swing.JMenuItem();
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
        jLabelLogo.setBounds(50, 10, 58, 80);
        jPanelPrincipal.add(jSeparator1);
        jSeparator1.setBounds(0, 95, 900, 5);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelPrincipal.add(jSeparator2);
        jSeparator2.setBounds(300, 105, 5, 480);

        jLabelTitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("FUNDAMENTOS DE ANÁLISIS Y DISEÑO DE ALGORITMOS");
        jPanelPrincipal.add(jLabelTitulo);
        jLabelTitulo.setBounds(90, 0, 808, 30);

        jLabelSubtitulo.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelSubtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubtitulo.setText("MINIPROYECTO 2 - PROGRAMACIÓN DINÁMICA Y VORAZ");
        jPanelPrincipal.add(jLabelSubtitulo);
        jLabelSubtitulo.setBounds(90, 20, 808, 30);

        jLabelSubtitulo1.setFont(new java.awt.Font("Trebuchet MS", 1, 50)); // NOI18N
        jLabelSubtitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubtitulo1.setText("TRIANGULACIÓN DE POLINOMIOS");
        jPanelPrincipal.add(jLabelSubtitulo1);
        jLabelSubtitulo1.setBounds(90, 45, 808, 50);

        jLabelTextView.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelTextView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTextView.setText("VISTA TEXTO");
        jPanelPrincipal.add(jLabelTextView);
        jLabelTextView.setBounds(0, 105, 320, 30);

        jLabelgraphicalview.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabelgraphicalview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelgraphicalview.setText("VISTA GRAFICA");
        jPanelPrincipal.add(jLabelgraphicalview);
        jLabelgraphicalview.setBounds(410, 105, 490, 30);

        jTextArea.setColumns(20);
        jTextArea.setEditable(false);
        jTextArea.setRows(5);
        jScrollPaneTextView.setViewportView(jTextArea);

        jPanelPrincipal.add(jScrollPaneTextView);
        jScrollPaneTextView.setBounds(10, 145, 280, 380);

        jScrollPanelGraphView.setBackground(new java.awt.Color(242, 240, 240));

        jPanelGraphiclView.setLayout(null);
        jScrollPanelGraphView.setViewportView(jPanelGraphiclView);

        jPanelPrincipal.add(jScrollPanelGraphView);
        jScrollPanelGraphView.setBounds(415, 145, 480, 380);

        jButtonBorrar.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonBorrar);
        jButtonBorrar.setBounds(310, 270, 100, 31);

        getContentPane().add(jPanelPrincipal);
        jPanelPrincipal.setBounds(0, 0, 900, 600);

        jMenuArchivo.setText("Archivo");

        jMICargarTablero.setText("Cargar Poligono");
        jMICargarTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICargarTableroActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMICargarTablero);

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

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-910)/2, (screenSize.height-565)/2, 910, 565);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method description
     *
     *
     * @param evt
     */
    private void jMISalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMISalirActionPerformed

    /**
     * Method description
     *
     *
     * @param evt
     */
    private void jMIAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIAcercaDeActionPerformed

        // <editor-fold defaultstate="collapsed" desc="jMIAcercaDeActionPerformed()">
        String acercaDe = "FUNDAMENTOS DE ANÁLISIS Y DISEÑO DE ALGORITMOS\n"
                + "MINIPROYECTO 1: SOLUCIÓN PARA UN JUEGO DE LÓGICA: AKARI\n" + "\n"
                + "ARCHIVO: MainFrame.java\n" + "\n" + "FECHA:\n" + "\n" + "AUTORES:\n"
                + "    Marx Arturo Arias - 0840247-3743\n" + "    marxarturoariasescobar@gmail.com\n" + "\n"
                + "    Luis Jeferson Gallardo - \n" + "    luisjhefeerson@gmail.com\n" + "\n"
                + "    Fidel Herney Palacios - 0832691-3743\n" + "    herney400@gmail.com\n" + "\n"
                + "    James Andrés Payan - 0957150-2711\n" + "    jamespayan@gmail.com\n" + "\n"
                + "    Gustavo Adolfo Rodriguez - 0932979-3743\n" + "    gustalibreros@gmail.com\n" + "\n"
                + "ESCUELA DE INGENIERIA DE SISTEMAS Y COMPUTACION\n" + "UNIVERSIDAD DEL VALLE";

        JOptionPane.showMessageDialog(this, acercaDe, "Acerda de", JOptionPane.INFORMATION_MESSAGE);

        // </editor-fold>
    }//GEN-LAST:event_jMIAcercaDeActionPerformed

    /**
     * Method description
     *
     *
     * @param evt
     */
    private void jMICargarTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICargarTableroActionPerformed
        JFileChooser selectorArchivo = new JFileChooser("./tests/");

        selectorArchivo.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int resultado = selectorArchivo.showOpenDialog(this);

        if (resultado != JFileChooser.CANCEL_OPTION) {
            File selectedFile = selectorArchivo.getSelectedFile();
            Poligono poligono = new Poligono();
            
            if (poligono.loadFromFile(selectedFile)) {
                
                jTextArea.setText(poligono.getTextoEnArchivo());
                GraficarPoligono.poligono(jPanelGraphiclView.getGraphics(), 0, 0, poligono.getCx(), poligono.getCy());
            } else {
                JOptionPane.showMessageDialog(this, "El archivo no pudo ser procesado", "Formato no Valido",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jMICargarTableroActionPerformed

    /**
     * Method description
     *
     *
     * @param evt
     */
    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed

        int[] Cx= new int [5];
        int[] Cy= new int [5];
        Cx[0]=30;
        Cx[1]=10;
        Cx[2]=45;
        Cx[3]=90;
        Cx[4]=70;
        Cy[0]=20;
        Cy[1]=50;
        Cy[2]=70;
        Cy[3]=45;
        Cy[4]=30;
        
        GraficarPoligono.poligono(jPanelGraphiclView.getGraphics(), 0, 0, Cx, Cy);
        
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    /**
     * Method description
     *
     *
     * @param evt
     */
    

    /**
     * Method description
     *
     */
    
    /**
     * Method description
     *
     *
     * @param args
     */
    public static void main(String args[]) {

//        Vertice[] vertices = new Vertice[7];
//
//        vertices[0] = new Vertice(0, 0, 10);
//        vertices[1] = new Vertice(1, 0, 20);
//        vertices[2] = new Vertice(2, 8, 26);
//        vertices[3] = new Vertice(3, 15, 26);
//        vertices[4] = new Vertice(4, 27, 21);
//        vertices[5] = new Vertice(5, 22, 12);
//        vertices[6] = new Vertice(6, 10, 0);
//
//        Poligono                    poligono     = new Poligono(vertices, 7);
//        TrianguladorMinimalDinamico triangulador = new TrianguladorMinimalDinamico(poligono);
//
//        System.out.print("Costo de triangulacion Minimal: " + triangulador.calcularTriangulacion(0, 7));
        
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
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelSubtitulo;
    private javax.swing.JLabel jLabelSubtitulo1;
    private javax.swing.JLabel jLabelTextView;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelgraphicalview;
    private javax.swing.JMenuItem jMIAcercaDe;
    private javax.swing.JMenuItem jMICargarTablero;
    private javax.swing.JMenuItem jMISalir;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanelGraphiclView;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPaneTextView;
    private javax.swing.JScrollPane jScrollPanelGraphView;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea;
    // End of variables declaration//GEN-END:variables
}
