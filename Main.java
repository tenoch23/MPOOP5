public class Main {
  public static void main(String[] args) {
Circulo circulo1=new Circulo();
System.out.println(circulo1);
circulo1.setRadio(1.5f);
System.out.println(circulo1);
  float var=-3.5f;
  circulo1.setRadio(var);
  System.out.println(circulo1);
  System.out.println("##################Composicion#############");
  Persona persona1= new Persona();
  System.out.println(persona1);
  persona1.setNombre("Tenoch");
  persona1.setApellido("Montes");
  Fecha fecha1=new Fecha(2,1,2021);
  persona1.setFNacimiento(fecha1);
  System.out.println(persona1);
  System.out.println("###########Composicion Carro#########");
  Coche coche1= new Coche();
  Persona persona2=new Persona();
  persona2.setNombre("Pablo");
  Persona persona3=new Persona();
  persona3.setNombre("Martin");
  Persona persona4=new Persona();
  persona4.setNombre("Emiliano");
  coche1.setPiloto(persona1);
   coche1.setCopiloto(persona2);
  coche1.setPasajero1(persona3);
   coche1.setPasajero2(persona4);
   System.out.println(coche1);
  }
}