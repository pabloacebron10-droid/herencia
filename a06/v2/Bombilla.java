package a06.v2;

public class Bombilla extends Dispositivo {

    public Bombilla(boolean estado, String red) {
        super(estado, red);
    }

    @Override
    public void encender() {
        estado = true;
        System.out.println("La bombilla está " + getEstado());
    }

    @Override
    public void apagar() {
        estado = false;
        System.out.println("La bombilla está " + getEstado());
    }
}


