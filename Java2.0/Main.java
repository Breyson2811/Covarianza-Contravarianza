public class Main{
  public static void main(String[] args){
  
    SerVivo a = new Animal("Mono");
    SerVivo p = new Persona("Human", 16);
    SerVivo e = new Estudiante("Estudiante", 21, 123123);
    Y y = new Y();    
    
    y.foo(a);//Animal
    y.foo(p);//Persona
    y.foo(e);//Estudiante
  }
}
