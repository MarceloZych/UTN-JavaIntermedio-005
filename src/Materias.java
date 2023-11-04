import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Materias {

    private String nombre;
    private Set<Materias> correlativas;

    public Materias(String nombre, Set<Materias> correlativas) {
        this.nombre = nombre;

        this.correlativas = new HashSet<>(correlativas);
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Materias> getCorrelativas() {
        return correlativas;
    }

    public Boolean puedeCursar( Alumno alumno){
        return this.correlativas.stream()
                .allMatch(correlativas -> alumno.correlativaAprobada(correlativas));
    }

    public Boolean tenesCorrelativas(){
        return !correlativas.isEmpty();
    }

}
