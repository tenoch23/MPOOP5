public class Circulo{
  private float radio;

  public Circulo(){}
  public float perimetro(){
    return radio*(float) Math.PI*2;
  }

  public float area(){
    return (float) Math.PI *(radio*radio);
  }

  public float getRadio(){
    return radio;
  }

  public void setRadio(float radio){
    if (radio<0) {
      this.radio=Math.abs(radio);
    } else {
      this.radio=radio;
    }
    
  }
  @Override
   public String toString(){
     return "Circulo{Radio= "+radio+"}";
   }
}