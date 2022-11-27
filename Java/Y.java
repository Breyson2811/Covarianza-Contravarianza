public class Y extends X{

  @Override
  public Alumno foo(Persona p){
    p.cantar();
    return p;
  }
}
