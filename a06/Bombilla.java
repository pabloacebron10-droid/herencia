package a06;

public class Bombilla implements DispositivoConectado {
   private boolean estado;
   private String red;

   Bombilla(Boolean estado, String red){
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
      this.red = tipoDeRed.equals(DispositivoConectado.tipoDeRed) && contraseña.equals(DispositivoConectado.contraseñaDeRed) ? tipoDeRed : "Desconectado";
      return this.red;
    }
    
    public void encender(){
        this.estado=true;
        System.out.println("La bombilla esta " + this.getEstado() );
    }

    public void apagar(){
        this.estado=false;
        System.out.println("La bombilla está " + this.getEstado());
    }


}
