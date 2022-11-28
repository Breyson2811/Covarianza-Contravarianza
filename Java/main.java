class Main{
  public static void main(String[] args){
    Persona p = new Persona("Pedro", 19);
    p.cantar();
    Alumno a  = new Alumno("Jose", 14, 123);
    a.show();
    Y y = new Y();
    System.out.println("-----------");
    //Cantante  c = y.foo(c);
    y.foo(a);
    y.foo(p);
  }
} 
