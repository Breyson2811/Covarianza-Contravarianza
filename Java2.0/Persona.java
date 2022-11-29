public class Persona extends Animal implements SerVivo{

  int edad;

  public Persona(String nm,int age){
    super(nm);
    edad = age;
  }
  @Override
  public void comer(){
    System.out.println("Persona Comiendo");
  }
}
