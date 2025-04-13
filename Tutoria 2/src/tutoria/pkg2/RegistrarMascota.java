/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tutoria.pkg2;

import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author xdele
 */
public class RegistrarMascota extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarMascota
     */
    public RegistrarMascota() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoEspecie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoRaza = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoEdad = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        campoNombreDueno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoTelefonoDueno = new javax.swing.JSpinner();
        button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrar Mascotas");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Mascotas");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("Nombre de la Mascota:");

        campoNombre.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        campoNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Especie:");

        campoEspecie.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        campoEspecie.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("Raza:");

        campoRaza.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        campoRaza.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Edad:");

        campoEdad.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setText("Nombre del Dueño:");

        campoNombreDueno.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        campoNombreDueno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setText("Teléfono del Dueño:");

        campoTelefonoDueno.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        button.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        button.setText("Registrar Mascota");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campoNombreDueno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campoTelefonoDueno, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoEspecie, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(campoEdad)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(403, 403, 403)
                        .addComponent(button)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(campoEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(campoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoNombreDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(campoTelefonoDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(button)
                .addGap(47, 47, 47))
        );

        campoEdad.setModel(new SpinnerNumberModel(0, 0, 300, 1));
        campoTelefonoDueno.setModel(new SpinnerNumberModel(11111111, 11111111, 99999999, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        // TODO add your handling code here:
        boolean huboError = false;
        
        String nombre = campoNombre.getText();
        if(nombre.length() == 0){
            huboError = true;
            JOptionPane.showMessageDialog(null, "El nombre de la mascota no puede estar vacio.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        String especie = campoEspecie.getText();
        if(especie.length() == 0){
            huboError = true;
            JOptionPane.showMessageDialog(null, "La especie de la mascota no puede estar vacia.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        String raza = campoRaza.getText();
        if(raza.length() == 0){
            huboError = true;
            JOptionPane.showMessageDialog(null, "La raza de la mascota no puede estar vacia.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        int edad = (int) campoEdad.getValue();
        
        String nombreDueno = campoNombreDueno.getText();
        if(nombreDueno.length() == 0){
            huboError = true;
            JOptionPane.showMessageDialog(null, "El nombre del dueño de la mascota no puede estar vacio.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        int telefonoDueno = (int) campoTelefonoDueno.getValue();
        if(telefonoDueno == 11111111){
            huboError = true;
            JOptionPane.showMessageDialog(null, "Se debe modificar el número de teléfono del dueño.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        if(!huboError){
            Dueno dueno = new Dueno(nombreDueno, telefonoDueno);
            Mascota mascota = new Mascota(nombre, especie, raza, edad, dueno);
            
            for(Mascota pet : Tutoria2.mascotas){
                if(mascota.getNombre().equals(pet.getNombre()) && mascota.getEspecie().equals(pet.getEspecie()) 
                    && mascota.getRaza().equals(pet.getRaza()) && mascota.getEdad() == pet.getEdad() 
                    && mascota.getDueno().getNombre().equals(pet.getDueno().getNombre())
                    && mascota.getDueno().getTelefono() == pet.getDueno().getTelefono()){
                    JOptionPane.showMessageDialog(null, "No se puede agregar la misma mascota.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            
            // Modificar para agregar mascota a la base de datos
            Tutoria2.mascotas.add(mascota);
            
            JOptionPane.showMessageDialog(null, "Se ha registrado correctamente la mascota.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JSpinner campoEdad;
    private javax.swing.JTextField campoEspecie;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoNombreDueno;
    private javax.swing.JTextField campoRaza;
    private javax.swing.JSpinner campoTelefonoDueno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
