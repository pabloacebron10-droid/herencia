package a01_a02_a03;

public class HoraExacta extends Hora {

        /*A partir de la clase Hora implementar la clase HoraExacta, que incluye en la hora los segundos.
    Además de los métodos heredados de Hora, dispondrá de:
    • HoraExacta(hora, minuto, segundo) -> que construye un objeto con los datos pasados
    como parámetros.
    • boolean setSegundos(valor) -> que asigna, si está comprendido entre 0 y 59, el valor
    indicado a los segundos.
    • void inc() -> que incrementa la hora en un segundo (utiliza @Override).
    • toString(), que devuelve un String con la representación de la hora exacta (utiliza
    @Override).
    */
    
    private int segundo;

    HoraExacta(int hora, int minuto, int segundos){
        super(hora, minuto);
        this.segundo= segundos;
    }

    public boolean setSegundo(int valor){
         boolean pudoModificar= false;
        if(valor>=0 && valor<60){
            this.segundo= valor;
            pudoModificar= true;    
        }
        return pudoModificar;
    }

    @Override
    public void inc(){
        if (this.getMinuto() == 59) {
            this.segundo= 0;
            super.inc();
        }else {
            this.segundo++;
        } 
    }

    @Override
    public String toString(){
        return super.toString() + " y " + this.segundo + " segundos";
    }

        /*3. Añadir a la clase HoraExacta un método que compare si dos horas (la invocante y otra pasada
    como parámetro de entrada al método) son iguales o distintas.
    */
    @Override
    public boolean equals(Object otraHora){
        HoraExacta horaComparar = (HoraExacta) otraHora;
        boolean sonIguales= false;
        if(this.getHora()==horaComparar.getHora() && this.getMinuto()== horaComparar.getMinuto() && this.segundo== horaComparar.segundo){
            sonIguales= true;
        }
        return sonIguales;
    }
}
