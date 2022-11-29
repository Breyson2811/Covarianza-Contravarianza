public class Main{
  public static void main(String[] args){
  
    Animal a = new Animal("Mono");
    Persona p = new Persona("Human", 16);
    Estudiante e = new Estudiante("Estudiante", 21, 123123);
    Y y = new Y();    
    Persona p2 = new Persona("r",12);
    Animal n1 = y.foo(p2);//Animal
    Persona p1 = y.foo(p);//Persona
    SerVivo e1= y.foo(e);//Estudiante
  }
}
