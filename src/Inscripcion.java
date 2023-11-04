public class Inscripcion {

    private Alumno alumno;

    private Materias materias;

    public Inscripcion(Alumno alumno, Materias materias) {
        this.alumno = alumno;
        this.materias = materias;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materias getMaterias() {
        return materias;
    }

    public Boolean aprobada(){
        return materias.puedeCursar(alumno) || !materias.tenesCorrelativas();
    }
}
