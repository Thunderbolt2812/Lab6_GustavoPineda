/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_gustavopineda;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_agregar = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf_titulo = new javax.swing.JTextField();
        sp_puntuacion = new javax.swing.JSpinner();
        tf_artista = new javax.swing.JTextField();
        tf_album = new javax.swing.JTextField();
        bt_agregarR = new javax.swing.JButton();
        yc_año = new com.toedter.calendar.JYearChooser();
        jd_modificar = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bt_agregarC = new javax.swing.JButton();
        bt_modificarC = new javax.swing.JButton();
        bt_eliminarC = new javax.swing.JButton();
        bt_abrirA = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_playlist = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        bt_agregarCP = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("Titulo:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Agregra una cancion Clau!");

        jLabel4.setText("Puntuacion:");

        jLabel5.setText("Año de creacion:");

        jLabel6.setText("Artista:");

        jLabel7.setText("Album:");

        sp_puntuacion.setModel(new javax.swing.SpinnerNumberModel(3, 1, 10, 1));

        bt_agregarR.setText("Agregar Rolon");
        bt_agregarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_agregarLayout = new javax.swing.GroupLayout(jd_agregar.getContentPane());
        jd_agregar.getContentPane().setLayout(jd_agregarLayout);
        jd_agregarLayout.setHorizontalGroup(
            jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarLayout.createSequentialGroup()
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_agregarLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3))
                    .addGroup(jd_agregarLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_titulo)
                                .addComponent(sp_puntuacion, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                .addComponent(tf_artista)
                                .addComponent(tf_album))
                            .addComponent(yc_año, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_agregarLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(bt_agregarR, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jd_agregarLayout.setVerticalGroup(
            jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sp_puntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(yc_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_artista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_album, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(bt_agregarR, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jt2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Puntuacion", "Año", "Artista", "Album"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jt2);

        javax.swing.GroupLayout jd_modificarLayout = new javax.swing.GroupLayout(jd_modificar.getContentPane());
        jd_modificar.getContentPane().setLayout(jd_modificarLayout);
        jd_modificarLayout.setHorizontalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jd_modificarLayout.setVerticalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(142, 142, 142))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("PlayLists de Clau!");

        bt_agregarC.setText("Agregar Cancion");
        bt_agregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarCActionPerformed(evt);
            }
        });

        bt_modificarC.setText("Modificar Cancion");
        bt_modificarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarCActionPerformed(evt);
            }
        });

        bt_eliminarC.setText("Eliminar Cancion");
        bt_eliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarCActionPerformed(evt);
            }
        });

        bt_abrirA.setText("Abrir Archivo");
        bt_abrirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_abrirAActionPerformed(evt);
            }
        });

        ta_playlist.setColumns(20);
        ta_playlist.setRows(5);
        jScrollPane2.setViewportView(ta_playlist);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Playlist");

        bt_agregarCP.setText("Agregar a....");
        bt_agregarCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_agregarCPActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Lista de Rolones");

        jt1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Puntuacion", "Año", "Artista", "Album"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jt1);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_modificarC)
                            .addComponent(bt_agregarC, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_eliminarC, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_abrirA, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(542, 542, 542)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_agregarCP, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_agregarC)
                        .addGap(18, 18, 18)
                        .addComponent(bt_modificarC)
                        .addGap(18, 18, 18)
                        .addComponent(bt_eliminarC)
                        .addGap(18, 18, 18)
                        .addComponent(bt_abrirA))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_agregarCP)
                    .addComponent(jButton1))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_agregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarCActionPerformed
        jd_agregar.setModal(true);
        jd_agregar.pack();
        jd_agregar.setLocationRelativeTo(this);
        jd_agregar.setVisible(true);
    }//GEN-LAST:event_bt_agregarCActionPerformed

    private void bt_eliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarCActionPerformed
        if (jt1.getSelectedRow() >= 0) {
            DefaultTableModel m = (DefaultTableModel) jt1.getModel();
            m.removeRow(jt1.getSelectedRow());
            jt1.setModel(m);
        } else {
            JOptionPane.showMessageDialog(this, "Primero seleccione un elemento de la tabla");
        }
    }//GEN-LAST:event_bt_eliminarCActionPerformed

    private void bt_abrirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_abrirAActionPerformed
        File fichero;
        FileReader fr = null;
        BufferedReader br = null;
        ta_playlist.setText("");
        try {
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
            jfc.setFileFilter(filtro);
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;
                ta_playlist.setText("");
                while ((linea = br.readLine()) != null) {
                    ta_playlist.append(linea);
                    ta_playlist.append("\n");
                }
            }

        } catch (HeadlessException | IOException e) {
        }
        try {
            br.close();
            fr.close();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_bt_abrirAActionPerformed

    private void bt_agregarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarRActionPerformed
        Admin G = new Admin("./predeterminada");
        Canciones x = new Canciones(tf_titulo.getText(), (Integer) sp_puntuacion.getValue(), yc_año.getValue(), tf_artista.getText(), tf_album.getText());
        lc.add(x);
        G.getAc().add(x);
        Object[] newrow = {x.getTitulo(), x.getPuntuacion(), x.getAño(), x.getArtista(), x.getAlbum()};
        DefaultTableModel m = (DefaultTableModel) jt1.getModel();
        m.addRow(newrow);
        tf_titulo.setText("");
        tf_artista.setText("");
        tf_album.setText("");
        sp_puntuacion.setValue(1);
        jd_agregar.setVisible(false);
    }//GEN-LAST:event_bt_agregarRActionPerformed

    private void bt_modificarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificarCActionPerformed
        jd_modificar.setModal(true);
        jd_modificar.pack();
        jd_modificar.setLocationRelativeTo(this);
        jd_modificar.setVisible(true);
    }//GEN-LAST:event_bt_modificarCActionPerformed

    private void bt_agregarCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_agregarCPActionPerformed
        if (jt1.getSelectedRow() >= 0) {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto", "txt");
            jfc.addChoosableFileFilter(filtro);
            int seleccion = jfc.showSaveDialog(this);
            FileWriter fw = null;
            BufferedWriter bw = null;
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                try {
                    @SuppressWarnings("UnusedAssignment")
                    File fichero = null;
                    if (jfc.getFileFilter().getDescription().equals("Archivos de Texto")) {
                        fichero = new File(jfc.getSelectedFile().getPath() + ".txt");
                    } else {
                        fichero = jfc.getSelectedFile();
                    }
                    fw = new FileWriter(fichero);
                    bw = new BufferedWriter(fw);
                    int pos = jt1.getSelectedRow();
                    Canciones y = lc.get(pos);
                    bw.write(y.getTitulo() + ";" + y.getPuntuacion() + ";" + y.getAño() + ";" + y.getArtista() + ";" + y.getAlbum() + ";");
                    bw.newLine();
                    bw.flush();
                    JOptionPane.showMessageDialog(this, "Cancion guardada exitosamente");
                } catch (HeadlessException | IOException e) {
                }
                try {
                    bw.close();
                    fw.close();
                } catch (IOException ex) {
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Primero seleccione un elemento de la tabla");
        }

    }//GEN-LAST:event_bt_agregarCPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jt1.getSelectedRow() >= 0) {
            try {
                Admin B = new Admin("./predeterminada.txt");
                B.cargarArchivo();
                int pos = jt1.getSelectedRow();
                Canciones x = lc.get(pos);
                B.getAc().add(x);
                B.escribirArchivo();
            } catch (IOException ex) {
            }
        } else {
            JOptionPane.showMessageDialog(this, "Primero seleccione un elemento de la tabla");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_abrirA;
    private javax.swing.JButton bt_agregarC;
    private javax.swing.JButton bt_agregarCP;
    private javax.swing.JButton bt_agregarR;
    private javax.swing.JButton bt_eliminarC;
    private javax.swing.JButton bt_modificarC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JDialog jd_agregar;
    private javax.swing.JDialog jd_modificar;
    private javax.swing.JTable jt1;
    private javax.swing.JTable jt2;
    private javax.swing.JSpinner sp_puntuacion;
    private javax.swing.JTextArea ta_playlist;
    private javax.swing.JTextField tf_album;
    private javax.swing.JTextField tf_artista;
    private javax.swing.JTextField tf_titulo;
    private com.toedter.calendar.JYearChooser yc_año;
    // End of variables declaration//GEN-END:variables
    ArrayList<Canciones> lc = new ArrayList();
}
