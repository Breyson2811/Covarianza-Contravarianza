public class Persona implements Cantante{

  String nombre;
  int edad;

  public Persona (String nm, int age){
    nombre = nm;
    edad = age;
  }

  public void cantar(){
    System.out.println("LA LA LA ... ");
  }
}
