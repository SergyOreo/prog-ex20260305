/**
 * Clase Alumno
 */
public class Alumno {
    private int id;
    private String nombre;
    private String tituloFP;
    private int edad;

    /**
     * Constructor de clase Alumno
     * @param id identificador
     * @param nombre nombre de alumno
     * @param tituloFP titulacion en el que está matriculado
     * @param edad edad del alumno
     */
    public Alumno(int id, String nombre, String tituloFP, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.tituloFP = tituloFP;
        this.edad = edad;
    }

    /**
     * Devuelve el identificador del alumno
     * @return int id
     */
    public int getId() {
        return id;
    }

    /**
     * Devuelve el nombre del alumno
     * @return String nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el titulo del alumno
     * @return String titulo
     */
    public String getTituloFP() {
        return tituloFP;
    }

    /**
     * Devuelve la edad del alumno
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Devuelve los atributos del alumno en cadena de texto
     * @return String del alumno y sus atributos
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Alumno{");
        sb.append(String.format("id = %d; ", id));
        sb.append(String.format("nombre = %s; ", nombre));
        sb.append(String.format("tituloFP = %s; ", tituloFP));
        sb.append(String.format("edad = %d", edad));
        sb.append("}");

        return sb.toString();
    }
}
