/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.text.DecimalFormat;

/**
 *
 * @author maria
 */
public class ConvertirTemperatura {
        public String convertirTemperatura(double escala,double valor){
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(escala*valor);
    }
}
