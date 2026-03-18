package a06;

public class Televisor implements DispositivoConectado {
   private boolean estado;
   private String red;

   Televisor(Boolean estado, String red){
    this.estado= estado;
    this.red=red;
   }

   public String getEstado(){
    return estado ? "Encendida" : "Apagada";
   }

   public String getRed() {
       return red;
   }

   public String conectar(String tipoDeRed, String contraseña){
    System.out.println("Buscando actualizaciones firmware...");
      this.red = tipoDeRed.equals(DispositivoConectado.tipoDeRed) && contraseña.equals(DispositivoConectado.contraseñaDeRed) ? tipoDeRed : "Desconectado";
      return this.red;
    }
    
    public void encender(){
        this.estado=true;
        System.out.println("El televisor esta " + this.getEstado() );
    }

    public void apagar(){
        this.estado=false;
        System.out.println("El televisor está " + this.getEstado());
    }
}

