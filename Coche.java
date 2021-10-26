class Coche{
  //sección de atributos
  String color;
  String marca;
  int puertas;
  int ano;
  int potencia;
  boolean automatico;
  Persona piloto;
  Persona copiloto;
  Persona pasajero1;
  Persona pasajero2;

  //Sección de constructores
  public Coche (){}

    public Coche(String marca, int ano, String color, int puertas, boolean automatico, int potencia, Persona piloto, Persona copiloto, Persona pasajero1, Persona pasajero2){
    this.marca=marca;
    this.ano=ano;
    this.color=color;
    this.puertas=puertas;
    this.automatico=automatico;
    this.potencia=potencia;
    this.piloto=piloto;
    this.copiloto=copiloto;
    this.pasajero1=pasajero1;
    this.pasajero2=pasajero2;
  }
   public Coche(String marca, int ano, String color, int puertas, boolean automatico, int potencia, String nombre, String nombre1, String nombre2, String nombre3){
    this.marca=marca;
    this.ano=ano;
    this.color=color;
    this.puertas=puertas;
    this.automatico=automatico;
    this.potencia=potencia;
    piloto=new Persona();
    this.piloto.setNombre(nombre);
    copiloto=new Persona();
    this.copiloto.setNombre(nombre);
    pasajero1=new Persona();
    this.pasajero1.setNombre(nombre);
    pasajero2=new Persona();
    this.pasajero2.setNombre(nombre);
  }

  //sección de métodos
    public Persona getPiloto(){
      return piloto;
  }
  public void setPiloto(Persona piloto){
    this.piloto=piloto;
  }
  public Persona getCopiloto(){
      return copiloto;
  }
  public void setCopiloto(Persona copiloto){
    this.copiloto=copiloto;
  }

  public Persona getPasajero1(){
      return pasajero1;
  }
  public void setPasajero1(Persona pasajero1){
    this.pasajero1=pasajero1;
  }
 public Persona getPasajero2(){
      return pasajero2;
  }
  public void setPasajero2(Persona pasajero2){
    this.pasajero2=pasajero2;
  }
  @Override
  public String toString(){
    return "coche{"+"piloto"+piloto+" copiloto"+copiloto+" Pasajero 1"+pasajero1+" Pasajero2="+pasajero2+"}";
  }
}