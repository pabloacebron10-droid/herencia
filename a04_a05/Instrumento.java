package a04_a05;

import java.util.Arrays;

public abstract class Instrumento {
    /*4. Crear la clase abstracta Instrumento, que almacena en una tabla las notas musicales de una
melodía (dentro de una misma octava).
• EI método add() añade nuevas notas musicales.
• La clase también dispone del método abstracto interpretar() que, en cada subclase que
herede de Instrumento, deberá implementarse.
• Utilizar enumerados para definir las notas musicales (Nota.java) */

    private Nota [] melodia;
    
    Instrumento(Nota [] melodia){
        this.melodia= melodia;
    }

    public Nota[] getMelodia() {
        return melodia;
    }

    public void setMelodia(Nota[] melodia) {
        this.melodia = melodia;
    }

    public Nota[] add(Nota[] listaDeNotas){
        this.melodia = Arrays.copyOf(this.melodia, this.melodia.length + listaDeNotas.length);

        for(int i = this.melodia.length- listaDeNotas.length; i< this.melodia.length; i++){
            this.melodia[i]= listaDeNotas[i-(this.melodia.length- listaDeNotas.length)];
        }
        return this.melodia;
    }

    abstract void interpretar();
}
