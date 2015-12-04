
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // Atributo que guarda el nombre del borrachuzco
    private String nombre;
    // Atributo que nos guardara el nivel de alcohol en sangre
    private float nivel;
    // Atributo que guardara el limite maximo de alcohol en sangre del bebedor
    private float limite;

    /**
     * Constructor para crear un bebedor
     */
    public Bebedor(String nombre, float limite){
        this.nombre = nombre;
        this.nivel = 0;
        this.limite = limite;
    }

    /**
     * Metodo para dar un copazo a el borrachuzco
     */
    public void darCopazo(Cubata copazo){
        if(nivel<limite){
            nivel = nivel + copazo.tieneXGrados();
        }
        else{
            System.out.println("Estoy servido!");
        }
    }

    /**
     * Metodo para comprobar el nivel de alcohol en sangre del borrachuzco
     */
    public float compruebaNivel(){
        return nivel;
    }

    /**
     * Metodo para hacer una pregunta al borrachuzco, dependiendo de si contiene o no su nombre
     * te lo dira gritando, si su nivel de alcohol en sangre es menor que su limite, te respondera
     * con si o no dependiendo de si es par o no el numero de caracteres de la pregunta.
     * Finalmente si su nivel de alcohol en sangre es mayor que su nivel te devolvera tu pregunta
     * en mayuscul
     */
    public String preguntaAlBorrachuzco(String hazTuPregunta){
        String respuesta="";
        if((hazTuPregunta.contains(nombre)) || (nivel > limite)){
            respuesta = hazTuPregunta.toUpperCase();
        }
        else{
            if(hazTuPregunta.length() % 2 == 0){
                respuesta = "Si";
            }
            else{
                respuesta = "No";
            }

        }
        return respuesta;
    }
}
