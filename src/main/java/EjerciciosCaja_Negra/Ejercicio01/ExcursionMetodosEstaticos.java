package EjerciciosCaja_Negra.Ejercicio01;

public class ExcursionMetodosEstaticos {
    public static double calcularPrecioAlumno(int numeroAlumno){
        if (numeroAlumno >= 100){
            return 65;
        } else if (numeroAlumno >= 50 && numeroAlumno < 100){
            return 70;
        } else if (numeroAlumno >= 30 && numeroAlumno < 50){
            return 95;
        }else {
            return 4000/numeroAlumno;
        }
    }
    public static double calcularCosteExcursion(int numeroAlumnos){
        if ( numeroAlumnos >= 100){
            return 65 * numeroAlumnos;
        } else if (numeroAlumnos >=50 && numeroAlumnos < 100){
            return 70 * numeroAlumnos;
        } else if (numeroAlumnos >= 30 && numeroAlumnos < 50){
            return 95 * numeroAlumnos;
        }else {
            return 4000;
        }
    }
}
