import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Alumno
        Set<Materias> materiasAprobadas = new HashSet<>();
        Alumno alumno1 = new Alumno("Jorge", materiasAprobadas);

        //Materias
        Materias materia1 = new Materias("Algoritmos y Estructuras de Datos", new HashSet<>());
        Materias materia2 = new Materias("Paradigmas de Programación", new HashSet<>());
        Materias materia3 = new Materias("Diseño de Sistemas", new HashSet<>());

        //Agregamos correlativas
        materia2.getCorrelativas().add(materia1);
        materia3.getCorrelativas().add(materia2);

        //Materia a inscribirse del alumno1
        materiasAprobadas.add(materia1);

        //Inscricion a materia1
        Inscripcion inscripcion1 = new Inscripcion(alumno1, materia3);


        //Imprimir por consola el resultado
        System.out.println("Alumno: " + alumno1.getNombre());
        System.out.println("Materias aprovadas: " + alumno1.matAprobadaToString(alumno1.getMateriasAprobadas()));
        System.out.println("Materia de la inscripción: " + inscripcion1.getMaterias().getNombre());
        System.out.println("Inscripción aprobada: " + inscripcion1.aprobada());

    }

}