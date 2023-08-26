/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enums;

import Modelo.Unidad;
import java.util.HashMap;

/**
 *
 * @author maria
 */
public enum Temperatura {
     F(new Unidad("F","°F", "Fahrenheit", "../recursos/fahrenheit.png"),
        new HashMap<>() {{
            put("F", 1.0);
            put("C", -17.22);
            put("K", 255.93);
        }}),C(new Unidad("C","°C", "Celsius", "../recursos/celsius.png"),
        new HashMap<>() {{
            put("F", 33.8);
            put("C", 1.0);
            put("K", 274.15);
        }}), K(new Unidad("K","°K", "Kelvin", "../recursos/kelvin.png"),
        new HashMap<>() {{
            put("F", -457.87);
            put("C", -272.15);
            put("K", 1.0);
    }});
        
    private HashMap<String, Double> equivalences;
    private Unidad unidad;
       private Temperatura(Unidad unidad, HashMap<String, Double> equivalences){
        this.unidad = unidad;
        this.equivalences = equivalences;
    }

    public Unidad getUnidad() {
        return unidad;
    }
    
    public double getEquivalence(String divisa) {
          return this.equivalences.get(divisa);
    }
}
