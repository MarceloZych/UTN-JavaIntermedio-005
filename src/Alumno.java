import java.util.Set;

public class Alumno {

    //Atributos
    private String nombre;
    private Set<Materias> materiasAprobadas;
    //Constructor
    public Alumno(String nombre, Set<Materias> materasAprobadas) {
        this.nombre = nombre;
        this.materiasAprobadas = materasAprobadas;
    }
    //Metodos para devolver un nombre y un Set<> de materias aprobadas
    public String getNombre() {
        return nombre;
    }

    public Set<Materias> getMateriasAprobadas() {
        return materiasAprobadas;
    }
    // Metodo que agrega una materia de tipo Materias en la lista de materias aprobadas
    public void addMateria( Materias materias){
        materiasAprobadas.add(materias);
    }

    // Metodo que compara la materia a la que se quiere inscribir con una lista de materias
    // aprobadas, si la contiene devuelve true y se puede inscrbir en la materia
    public Boolean correlativaAprobada(Materias materias){
        return materiasAprobadas.contains(materias);
    }

    //Metodo para devolver las materias en forma de String
    public String matAprobadaToString(Set<Materias> materias){

        StringBuilder materiaToString = new StringBuilder();

        for(Materias materias1 : materiasAprobadas){
            materiaToString.append(materias1.getNombre()).append(", ");
        }

        return materiaToString.toString();
    }
}
