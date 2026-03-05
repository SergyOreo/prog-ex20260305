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

    /**
     * Busca un alumno en la lista de alumnos dado su identificador
     * @param id identificador del alumno a buscar
     * @return Alumno solicitado, null si no esta en la lista
     */
    public Alumno buscarAlumno(int id){
        boolean seguirBuscando = true;
        Alumno alumno = null;

        for (int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++) {
            if (alumnos[i] != null &&  alumnos[i].getId() == id) {
                seguirBuscando = false;
                alumno = alumnos[i];
            }
        }

        return alumno;
    }

    /**
     * Busca el primer hueco libre dentro de la lista de alumnos
     * @return posicion del hueco libre, -1 si no hay hueco
     */
    private int buscarPrimerHuecoLibre(){
        boolean seguirBuscando = true;
        int huecoLibre = -1;

        for (int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++) {
            if (alumnos[i] == null){
                seguirBuscando = false;
                huecoLibre = i;
            }
        }

        return huecoLibre;
    }
}
