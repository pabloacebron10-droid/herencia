package a06;

public interface DispositivoConectado {
    String tipoDeRed= "Wi-fi 7";
    String contraseñaDeRed= "1234";

    void encender();
    void apagar();
    String conectar(String tipoDeRed, String contraseña);
    String getEstado();
    String getRed();
    default void mostrarInformacion(){
        System.out.println("Tipo de dispositivo: " + this.getClass().getSimpleName());
        System.out.println("Estado del dipositivo: " + this.getEstado());
        System.out.println("Conexión: " + this.getRed());
    }
}
