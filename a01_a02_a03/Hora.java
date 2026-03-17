package a01_a02_a03;

public class Hora {

        /*Diseñar la clase Hora, que representa un instante de tiempo compuesto por la hora (de 0 a 23) y
    los minutos. Dispone de los métodos:

    • Hora(hora, minuto) -> que construye un objeto con los datos pasados como parámetros.
    • void inc() -> que incrementa la hora en un minuto.
    • boolean setMinutos(valor) -> que asigna un valor, si es válido, a los minutos. Devuelve
    true o false según haya sido posible modificar los minutos o no.
    • boolean setHora(valor), que asigna un valor, si está comprendido entre 0 y 23, a la hora.
    Devuelve true o false según haya sido posible cambiar la hora o no.
    • toString(), que devuelve un String con la representación de la hora (utiliza @Override). */

    private int hora;
    private int minuto;

    Hora(int hora, int minuto){
        this.hora= hora;
        this.minuto= minuto;
    }

    public void inc(){
        if(this.minuto == 59){
            this.minuto=0;
            this.hora= this.hora == 23 ? 0 :  this.hora++;
        }else{
            this.minuto++;
        } 
    }

    public boolean setMinutos(int valor){
        boolean pudoModificar= false;
        if(valor>=0 && valor<60){
            this.minuto= valor;
            pudoModificar= true;    
        }
        return pudoModificar;
    }

    public boolean setHora(int valor){
        boolean pudoModificar= false;
        if(valor>=0 && valor<24){
            this.hora= valor;
            pudoModificar= true;    
        }
        return pudoModificar;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    @Override
    public String toString(){
        return "Son las "+ this.hora + " horas y "+ minuto + " minutos";
    }


 
}
