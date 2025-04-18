/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tutoria.pkg2;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xdele
 */
public class BuscarEliminarMascotas extends javax.swing.JFrame {

    /**
     * Creates new form Buscar
     */
    
    private String tipo;
    
    public BuscarEliminarMascotas(String tipo) {
        initComponents();
        if(!tipo.equals("Eliminar")){
            setTitle("Buscar por " + tipo);
        
            etiquetaTitulo.setText("Buscar por " + tipo);
            etiquetaCampo.setText("Ingrese " + tipo + ":");
        } else {
            setTitle("Eliminar Mascota por Nombre");
        
            etiquetaTitulo.setText("Eliminar por nombre");
            etiquetaCampo.setText("Ingrese Nombre:");
        }
        this.tipo = tipo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaCampo = new javax.swing.JLabel();
        campo = new javax.swing.JTextField();
        boton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar por ");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        etiquetaTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        etiquetaCampo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        etiquetaCampo.setText("jLabel2");

        campo.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        boton.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        boton.setText("Buscar");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(etiquetaCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(boton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(etiquetaTitulo)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCampo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(boton)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
        // TODO add your handling code here:
        String texto = campo.getText();
        
        boolean encontrado = false;
        
        // Modificar para buscar en la base de datos
        if(tipo.equals("Nombre")){
            for(Mascota mascota : Tutoria2.mascotas){
                if(mascota.getNombre().equals(texto)){
                    encontrado = true;
                    JOptionPane.showMessageDialog(null, "Nombre: " + mascota.getNombre() 
                            + "\nEspecie: " + mascota.getEspecie()
                            + "\nRaza: " + mascota.getRaza()
                            + "\nEdad: " + mascota.getEdad()
                            + "\nNombre del Dueño: " + mascota.getDueno().getNombre()
                            + "\nTeléfono del Dueño: " + mascota.getDueno().getTelefono()
                            , "Mascota encontrada", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else if(tipo.equals("Especie")){
            for(Mascota mascota : Tutoria2.mascotas){
                if(mascota.getEspecie().equals(texto)){
                    encontrado = true;
                    JOptionPane.showMessageDialog(null, "Nombre: " + mascota.getNombre() 
                            + "\nEspecie: " + mascota.getEspecie()
                            + "\nRaza: " + mascota.getRaza()
                            + "\nEdad: " + mascota.getEdad() + " años"
                            + "\nNombre del Dueño: " + mascota.getDueno().getNombre()
                            + "\nTeléfono del Dueño: " + mascota.getDueno().getTelefono()
                            , "Mascota encontrada", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else if(tipo.equals("Eliminar")){
            for (int fila = 0; fila < Tutoria2.mascotas.size(); fila++) {
                Mascota mascota = Tutoria2.mascotas.get(fila);
                if(mascota.getNombre().equals(texto)){
                    encontrado = true;
                    int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea eliminar a la siguiente Mascota:\nNombre - " + mascota.getNombre()
                                                                        + "\nEspecie - " + mascota.getEspecie()
                                                                        + "\nRaza - " + mascota.getEspecie()
                                                                        + "\nEdad - " + mascota.getEdad()
                                                                        + "\nNombre del dueño - " + mascota.getDueno().getNombre()
                                                                        + "\nTeléfono del dueño - " + mascota.getDueno().getTelefono()
                                                                        , "¿Eliminar Mascota?", JOptionPane.WARNING_MESSAGE);
                    if(respuesta == JOptionPane.YES_OPTION){
                        Tutoria2.mascotas.remove(fila);

                        DefaultTableModel modelo = (DefaultTableModel) EliminarMascotas.table.getModel();
                        modelo.removeRow(fila);
                        modelo.fireTableDataChanged();
                    }
                }
                
            }
            
        }
        if(!encontrado){
            String mensaje = (tipo.equals("Nombre") || tipo.equals("Eliminar"))? "el Nombre" : "la Especie";
            JOptionPane.showMessageDialog(null, "No se encontro ninguna mascota con " + mensaje + ": " + texto, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_botonActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JTextField campo;
    private javax.swing.JLabel etiquetaCampo;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
