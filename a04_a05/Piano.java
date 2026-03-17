package a04_a05;

import java.util.Arrays;

public class Piano extends Instrumento {
    /*5. Crear la clase Piano heredando de la clase abstracta Instrumento.
• Esta clase deberá implementar el método abstracto interpretar() mostrando por consola
las notas musicales según las interprete.
 */
    private String marca;
    private String modelo;

    Piano(String marca, String modelo, Nota [] melodia){
        super(melodia);
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    void interpretar() {
        System.out.println(Arrays.toString(this.getMelodia()));
        
    }

}
