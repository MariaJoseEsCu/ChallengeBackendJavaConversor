package enums;

import Modelo.Unidad;
import java.util.HashMap;

/**
 *
 * @author maria
 */
public enum Moneda {
    MXN(new Unidad("MXN", "$", "Peso Mexicano", "../recursos/mxn.png"),
        new HashMap<>() {{
            put("MXN", 1.0);
            put("USD", 0.059);
            put("EUR", 0.054);
            put("GBP", 0.046);
            put("JPY", 8.51);
            put("KRW", 78.23);
    }}), USD(new Unidad("USD", "$", "Dólar estadounidense", "../recursos/usd.png"),
        new HashMap<>() {{
            put("MXN", 17.01);
            put("USD", 1.0);
            put("EUR", 0.91);
            put("GBP", 0.79);
            put("JPY", 144.73);
            put("KRW", 1330.60);
        }}),EUR(new Unidad("EUR", "€", "Euro", "../recursos/eur.png"),
        new HashMap<>() {{
            put("MXN", 18.63);
            put("USD", 1.10);
            put("EUR", 1.0);
            put("GBP", 0.86);
            put("JPY", 158.56);
            put("KRW", 1458.27);
    }}), GBP(new Unidad("GBP", "£", "Libra esterlina", "../recursos/gbp.png"),
        new HashMap<>() {{
            put("MXN", 21.59);
            put("USD", 1.27);
            put("EUR", 1.16);
            put("GBP", 1.0);
            put("JPY", 183.85);
            put("KRW", 1689.60);
        }}), JPY(new Unidad("JPY", "¥", "Yen japonés", "../recursos/jpy.png"),
        new HashMap<>() {{
            put("MXN", 0.12);
            put("USD", 0.0069);
            put("EUR", 0.0063);
            put("GBP", 0.0054);
            put("JPY", 1.0);
            put("KRW", 9.19);
        }}), KRW(new Unidad("KRW", "₩", "Won surcoreano", "../recursos/krw.png"),
        new HashMap<>() {{
            put("MXN", 0.013);
            put("USD", 0.00075);
            put("EUR", 0.00069);
            put("GBP", 0.00059);
            put("JPY", 0.11);
            put("KRW", 1.0);
        }});
        
        
    private HashMap<String, Double> equivalences;
    private Unidad unidad;
       private Moneda(Unidad unidad, HashMap<String, Double> equivalences){
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
