/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.dev.taxi.view;

import java.util.List;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class OpcionesFrame extends javax.swing.JFrame {

    private String[] datosTaxis;
    private String[] datosPersonas;
    private Boolean cerrar = false;
    private Inicio inicioFrame;
    private String elementoSeleccionado;
    /**
     * Creates new form OpcionesFrame
     */
    public OpcionesFrame(List<String> datosTaxisList, List<String> datosPersonasList, Inicio inicio) {
        datosTaxis = datosTaxisList.toArray(new String[0]);
        datosPersonas = datosPersonasList.toArray(new String[0]);
        inicioFrame = inicio;
        initComponents();
    }

    public Boolean getCerrar() {
        return cerrar;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        grupoTaxis = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        confirmar = new javax.swing.JButton();
        grupoPersonas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        grupoTaxis.setModel(new javax.swing.DefaultComboBoxModel<>(datosTaxis));
        grupoTaxis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grupoTaxisActionPerformed(evt);
            }
        });

        jLabel1.setText("Personas");

        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        grupoPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(datosPersonas));

        jLabel2.setText("Taxis");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(confirmar)
                    .addComponent(grupoTaxis, 0, 94, Short.MAX_VALUE)
                    .addComponent(grupoPersonas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grupoTaxis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grupoPersonas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmar)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
       elementoSeleccionado = (String) grupoTaxis.getSelectedItem();
       String elementoSelecPersona = (String) grupoPersonas.getSelectedItem();
       inicioFrame.ejecutarSimulador(elementoSeleccionado,elementoSelecPersona);
       this.dispose();
    }//GEN-LAST:event_confirmarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       
    }//GEN-LAST:event_formWindowClosing

    private void grupoTaxisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grupoTaxisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grupoTaxisActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton confirmar;
    private javax.swing.JComboBox<String> grupoPersonas;
    private javax.swing.JComboBox<String> grupoTaxis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
