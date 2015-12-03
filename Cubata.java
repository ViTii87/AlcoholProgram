
/**
 * Write a description of class Cubata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cubata
{
   // Atributo de la clase String que guardara el nombre de la copa
   private String nombre;
   // Atributo que nos permite guardar los grados de la copa
   private float grados;
   
   /**
    * Contructor que nos permite crear una copa con un nombre y los grados pasador por parametros.
    */
   public Cubata(String nombre, float grados){
       this.nombre = nombre;
       this.grados = grados;
   }
   
   /**
    * Metodo que devuelve los grados de un copazo.
    */
   public float tieneXGrados(){
       return grados;
   }
}
