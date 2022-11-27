public class Alumno extends Persona{

  int ID;
  
  public Alumno(String nm, int age, int id){
    super(nm,age);
    ID = id;
  }

  public void show(){
    System.out.println("HELLO WORLD \n");
  }
}
