/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import enums.Moneda;
import java.text.DecimalFormat;

/**
 *
 * @author maria
 */
public class ConvertirMoneda {
    public String convertirDivisa(double tipoDeCambio,double monto){
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(tipoDeCambio*monto);
    }
}
