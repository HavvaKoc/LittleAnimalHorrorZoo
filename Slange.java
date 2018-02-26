public class Slange{
//attibuter
private String name = "";
private String yell = "";

private int x;
private int y;
   
//constucktor uden parametre
public Slange(){
   name = "Slange";
   x = x;
   y = y;
   yell = "";
   
}
//construcktor med parametre
public Slange(String name, String yell, int x, int y){
   
   this.name = name;
   this.yell = yell;
   this.x = x;
   this.y = y;  
   
   }
// set metode

public void setSlange(String name, int x, int y, String yell){
   name = name;
   x = x;
   y = y;
   yell = yell;

} 
 
public void SlangeInfo(){
   System.out.println("name\t" + name);
   System.out.println("x\t" + x);
   System.out.println("y\t" + y);
   System.out.println("yell\t" + yell);
}
   public void yell(){
      System.out.println("Ahhrr I'm eating you Ha,Ha");
   }
  public void tell(){
      System.out.println("I Am the " + name + " and i am standing on square " + x + "," + y);
   }
   
   public void setX(int dx){
      x = dx;
   }
   
   public void setY(int dy){
      y = dy;
}
}