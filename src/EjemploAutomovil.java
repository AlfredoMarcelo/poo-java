public class EjemploAutomovil {
  public static void main(String[] args) {

    Automovil subaru = new Automovil();
    subaru.asignarFabricante("Subaru");
    subaru.asignarModelo("Impreza");
    subaru.asignarCilindrada(2.0);
    subaru.asignarColor("blanco");

    Automovil mazda = new Automovil();
    mazda.asignarFabricante("Mazda");
    mazda.asignarModelo("BT-30");
    mazda.asignarCilindrada(3.0);
    mazda.asignarColor("Verde");

      //Ambos metodos imprimian desde la clase, mala practica
    //subaru.detalle(); //anteriormente imprimia en la cls, porque el metodo lo hacia
    //mazda.detalle();  //anteriormente imprimia en la cls, porque el metodo lo hacia

      //Ahora cuando los metodos retornan, se debe usar el sout para verlos en esta clase
    System.out.println("mazda.fabricante = " + mazda.leerFabricante());

    System.out.println(subaru.verDetalle());
    System.out.println(mazda.verDetalle());
    System.out.println(subaru.acelerar(5000));
    System.out.println(subaru.frenar());

    System.out.println(mazda.acelerarFrenar(4000));

    System.out.println("\nkilometros por litro " + subaru.calcularConsumo(300, 0.75f));
    System.out.println("\nkilometros por litro " + subaru.calcularConsumo(300, 60));





  }
}
