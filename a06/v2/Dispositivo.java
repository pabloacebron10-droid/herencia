package a06.v2;

public abstract class Dispositivo implements DispositivoConectado {
    protected boolean estado;
    protected String red;

    Dispositivo(boolean estado, String red) {
        this.estado = estado;
        this.red = red;
    }

    public String getEstado() {
        return estado ? "Encendida" : "Apagada";
    }

    public String getRed() {
        return red;
    }

    public void encender() {
        estado = true;
        System.out.println("El dispositivo está " + getEstado());
    }

    public void apagar() {
        estado = false;
        System.out.println("El dispositivo está " + getEstado());
    }

    public String conectar(String tipoDeRed, String contraseña) {
        if (tipoDeRed.equals(DispositivoConectado.tipoDeRed) &&
            contraseña.equals(DispositivoConectado.contraseñaDeRed)) {
            this.red = tipoDeRed;
        } else {
            this.red = "Desconectado";
            System.out.println("No se pudo conectar. Red o contraseña incorrecta.");
        }
        return this.red;
    }
}

