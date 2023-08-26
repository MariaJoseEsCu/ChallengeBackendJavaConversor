/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import Modelo.ComboBoxRM;
import controlador.ConvertirMoneda;
import enums.Moneda;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author maria
 */
public class VistaMoneda extends javax.swing.JInternalFrame {

    /**
     * Creates new form VMoneda
     */
    public VistaMoneda() {
        initComponents();
        this.llenarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelOuput = new javax.swing.JLabel();
        jBoton = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();
        jCombo = new javax.swing.JComboBox<>();
        jCombo1 = new javax.swing.JComboBox<>();
        jLabelSimbolo1 = new javax.swing.JLabel();
        jLabelSimbolo2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");

        labelOuput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelOuput.setText("1.0");

        jBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/cambioDivisas.png"))); // NOI18N
        jBoton.setText("Convertir");
        jBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBoton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBoton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jBoton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonActionPerformed(evt);
            }
        });

        txtInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtInput.setText("1.0");
        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });

        jCombo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboActionPerformed(evt);
            }
        });

        jCombo1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jCombo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCombo1ActionPerformed(evt);
            }
        });

        jLabelSimbolo1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSimbolo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSimbolo1.setText("°C");

        jLabelSimbolo2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelSimbolo2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelSimbolo2.setText("°C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelSimbolo1, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                            .addComponent(jLabelSimbolo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelOuput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInput, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCombo, 0, 215, Short.MAX_VALUE)
                            .addComponent(jCombo1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jBoton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInput)
                    .addComponent(jLabelSimbolo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCombo1)
                    .addComponent(labelOuput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelSimbolo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addComponent(jBoton)
                .addGap(121, 121, 121))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputActionPerformed

    private void jBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonActionPerformed
        try {
            double input = Double.parseDouble(txtInput.getText());
            if(input>0){
            Moneda divisa1 = Moneda.valueOf(arrayMonedas.get(jCombo.getSelectedIndex()).getUnidad().getSiglas());
            String divisa2 = Moneda.valueOf(arrayMonedas.get(jCombo1.getSelectedIndex()).getUnidad().getSiglas()).toString();
            labelOuput.setText(new ConvertirMoneda().convertirDivisa(divisa1.getEquivalence(divisa2), input));
            }else{
                throw new MyException("Favor de solo ingresar numeros");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,"Favor de solo ingresar numeros");
        }catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this,"Error no se encuentra el elemento selecionado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Favor de solo ingresar numeros");
        }
    }//GEN-LAST:event_jBotonActionPerformed

    private void jComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboActionPerformed
        if (jCombo.getSelectedIndex() > 0)
            jLabelSimbolo1.setText(arrayMonedas.get(jCombo.getSelectedIndex()).getUnidad().getSimbolo());
    }//GEN-LAST:event_jComboActionPerformed

    private void jCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCombo1ActionPerformed
        if (jCombo1.getSelectedIndex() > 0)
            jLabelSimbolo2.setText(arrayMonedas.get(jCombo1.getSelectedIndex()).getUnidad().getSimbolo());
    }//GEN-LAST:event_jCombo1ActionPerformed
    ArrayList<Moneda> arrayMonedas = new ArrayList<>();
    HashMap<String, ImageIcon> elementos;

    public void llenarCombo() {
        elementos = new HashMap<>();
        for (Moneda moneda : Moneda.values()) {
            jCombo.addItem(moneda.getUnidad().getNombre());
            jCombo1.addItem(moneda.getUnidad().getNombre());
            elementos.put(moneda.getUnidad().getNombre(), this.getIcon(moneda.getUnidad().getIcono()));
            arrayMonedas.add(moneda);
        }
        ComboBoxRM render = new ComboBoxRM(elementos);
        jCombo.setRenderer(render);
        jCombo1.setRenderer(render);
        jLabelSimbolo1.setText(arrayMonedas.get(jCombo.getSelectedIndex()).getUnidad().getSimbolo());
        jLabelSimbolo2.setText(arrayMonedas.get(jCombo1.getSelectedIndex()).getUnidad().getSimbolo());
    }

    public ImageIcon getIcon(String path) {
        return new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBoton;
    private javax.swing.JComboBox<String> jCombo;
    private javax.swing.JComboBox<String> jCombo1;
    private javax.swing.JLabel jLabelSimbolo1;
    private javax.swing.JLabel jLabelSimbolo2;
    private javax.swing.JLabel labelOuput;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables

    private static class MyException extends Exception {

        private MyException(String favor_de_solo_ingresar_numeros) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        public String MyException(String mensaje) {
            return mensaje;
        }
    }
}
