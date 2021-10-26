public class Fecha{
  private int dia;
  private int mes;
  private int anio;

  public Fecha(){
    
  }
  public Fecha(int dia, int mes, int anio){
    this.dia=dia;
    this.mes=mes;
    this.anio=anio;
  }
  public int getDia(){
    return dia;
  }
  public void setDia(int dia){
    if(dia>31||dia<1){
      System.out.println("Ingresa un dia correcto");
    }else{this.dia=dia;
    }
  }
  public int getMes(){
    return mes;
  }
  public void setMes(int mes){
    if(mes<1||mes>12){
      System.out.println("Ingresa un mes correcto");

    }else{
      this.mes=mes;
    }
   
  }
   public int getAnio(){
      return anio;

    }
    public void setAnio(int anio){
      if(anio>2021||anio<1900){
        System.out.println("Ingresa un año válido");
      }else{
        this.anio=anio;
      }
    }
    @Override
    public String toString(){
        return "Fecha{Dia= "+dia+" Mes= "+mes+" Año= "+anio+"}";
    }
}