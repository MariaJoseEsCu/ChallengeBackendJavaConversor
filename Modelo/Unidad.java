/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author maria
 */
public class Unidad {
    private String siglas;
    private String simbolo;
    private String nombre;
    private String icono;

    public Unidad(String siglas,String simbolo, String nombre, String icono) {
        this.siglas = siglas;
        this.simbolo = simbolo;
        this.nombre = nombre;
        this.icono = icono;
    }
    public String getSiglas() {
        return siglas;
    }

    public String getSimbolo() {
        return simbolo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getIcono() {
        return icono;
    }
}
