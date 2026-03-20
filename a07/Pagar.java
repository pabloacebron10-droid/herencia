package a07;

public interface Pagar {
    double IVA= 0.21;
   
    static public void procesarPago(double importe) {
      System.out.println("Has pagado "+ importe+ " euros");  
    }

    private static void transaccion() {
      System.out.println("Operacion registrada");  
    }

    static void generarFactura(double importe) {
        transaccion();
       System.out.println("Subtotal: "+ importe);
       System.out.println("IVA: " + Pagar.IVA + " = " +Pagar.IVA * importe);
        System.out.println("Total: " + importe + Pagar.IVA*importe);
    }
}
