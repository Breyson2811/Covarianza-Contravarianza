public class Estudiante extends Persona implements SerVivo{
  int dni;
    
  public Estudiante(String n, int ed, int dni){
      super(n,ed);
  }
    
  @Override
  public void comer() {
      System.out.println("Estudiante comiendo");
  }
}
