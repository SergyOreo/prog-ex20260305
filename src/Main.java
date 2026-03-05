public class Main  {
    public static void main(String[] args) {
        CentroFP uax;
        Alumno alumno1;
        Alumno alumno2;
        Alumno alumno3;

        uax = new CentroFP(20);

        alumno1 = new Alumno(1, "Nombre 1", "Titulo 1", 18);
        alumno2 = new Alumno(2, "Nombre 2", "Titulo 2", 19);
        alumno3 = new Alumno(3, "Nombre 3", "Titulo 3", 20);

        uax.registrarAlumno(alumno1);
        uax.registrarAlumno(alumno2);
        uax.registrarAlumno(alumno3);

        System.out.println(uax.mostrarAlumnos());
        System.out.println("Total de alumnos: " + uax.contarAlumnos());

        System.out.println(uax.buscarAlumno(1));
        System.out.println(uax.buscarAlumno(9));
    }
}
