package a06.v2;

public class Televisor extends Dispositivo {

    public Televisor(boolean estado, String red) {
        super(estado, red);
    }

    @Override
    public String conectar(String tipoDeRed, String contraseña) {
        System.out.println("Buscando actualizaciones firmware...");
        return super.conectar(tipoDeRed, contraseña);
    }

    @Override
    public void encender() {
        estado = true;
        System.out.println("El televisor está " + getEstado());
    }

    @Override
    public void apagar() {
        estado = false;
        System.out.println("El televisor está " + getEstado());
    }
}

