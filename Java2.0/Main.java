public class Main{
  public static void main(String[] args){
  
    Animal a = new Animal("Mono");
    Persona p = new Persona("Human", 16);
    Estudiante e = new Estudiante("Estudiante", 21, 123123);

    a.comer();
    p.comer();
    e.comer();
  }
}
