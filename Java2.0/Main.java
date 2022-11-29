public class Main{
  public static void main(String[] args){
  
    Animal a = new Animal("Mono");
    Persona p = new Persona("Human", 16);
    Estudiante e = new Estudiante("Estudiante", 21, 123123);
    Y y = new Y();    
    
    Animal n1 = y.foo(a);//Animal
    Persona p1 = y.foo(p);//Persona
    Estudiante e1= y.foo(e);//Estudiante
  }
}
