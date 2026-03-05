/**
 * Clase CentroFP
 */
public class CentroFP {
    private Alumno[] alumnos;
    private final int MAX_ALUMNOS;

    /**
     * Constructor de la clase CentroFP
     * @param maxAlumnos cantidad máxima de alumnos
     */
    public CentroFP(int maxAlumnos) {
        this.MAX_ALUMNOS = maxAlumnos;

        alumnos = new Alumno[MAX_ALUMNOS];
    }

}
