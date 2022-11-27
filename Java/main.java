class Main{
  public static void main(String[] args){
    Persona p = new Persona("Pedro", 19);
    p.cantar();
    Alumno a  = new Alumno("Jose", 14, 123);
    a.show();

    Y y = new Y();
    y.foo(p);
    System.out.println("aaaa");
    y.foo(a);
  }
} 
