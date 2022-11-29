public class Animal implements SerVivo{

  String raza;
  
  public Animal(String r){
    raza = r;
  }
  @Override
  public void comer(){ 
    System.out.println("GRRRRRRRR");
  }
}
