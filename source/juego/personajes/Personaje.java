package juego.personajes;

public class Personaje {

    /*Clase para la creación de personajes*/
    //Finalidad -> practicar de forma muy sencilla la programación
    //orienata a obejetos, los paquetes, visibilidad, etc...
    //a una escala muy sencilla e ir incrementando el nivel, si procede

    //Valores de Instancia
    public String nombre;
    public String [] elemento;
    public int edad;
    public String region;
    

    public Personaje(String nombre, String [] elemento, int edad, String region){
        this.nombre = nombre;
        this.elemento = elemento;
        //Este sera el array {" ", "Fuego", "Agua", "Viento", "Tierra", "Luz" , "Oscuridad"}
        this.edad = edad;
        this.region = region;
    }
        
}