/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.Component;
import java.util.HashMap;
import java.util.Hashtable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author maria
 */
public class ComboBoxRM extends JLabel implements ListCellRenderer{
    
    HashMap<String, ImageIcon> elementos;
    ImageIcon imgDefaulta= new ImageIcon(this.getClass().getResource("../recursos/default.png"));

    public ComboBoxRM(HashMap<String, ImageIcon> elementos) {
        this.elementos = elementos;
    }
    
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        if(elementos.get(value)==null){
            setIcon(imgDefaulta);
        }else{
            setIcon(elementos.get(value));
        }
        setText(value.toString());
        return this;
    }
}
