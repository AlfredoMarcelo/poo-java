public class EjemploAutomovil {
  public static void main(String[] args) {

    Automovil subaru = new Automovil("Subaru", "Impreza", "blanco", 2.0, 40);
    System.out.println(subaru.toString());
    subaru.setModelo("Alfredo");          // así se actualiza un valor individual del objeto
    System.out.println(subaru.toString());

    Automovil mazda = new Automovil("Mazda", "BT-30", "Verde", 3.0, 60);


    Automovil nissan = new Automovil("Nissan", "Note", "Gris", 1.5,50);





  }
}
