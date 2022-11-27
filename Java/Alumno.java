public class Alumno extends Persona implements Cantante{

  int ID;
  
  public Alumno(String nm, int age, int id){
    super(nm,age);
    ID = id;
  }

  public void show(){
    System.out.println("HELLO WORLD \n");
  }
}
