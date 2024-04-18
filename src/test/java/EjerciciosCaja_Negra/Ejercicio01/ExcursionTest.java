package EjerciciosCaja_Negra.Ejercicio01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcursionTest {
    Excursion e;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @DisplayName("Precio alumno: 100 alumnos")
    void calcularPrecioAlumno() {
        e = new Excursion(100); // instancio el objeto excursion con 100 almnos
        assertEquals(65,e.calcularPrecioAlumno());
    }
    @Test
    @DisplayName("Pecio alumno: 50 alumnos")
    void calcularPrecioAlumno2(){
        e = new Excursion(50);
        assertEquals(70,e.calcularPrecioAlumno());
    }
    @Test
    @DisplayName("Pecio alumno: 30 alumnos")
    void calcularPrecioAlumno3(){
        e = new Excursion(30);
        assertEquals(95,e.calcularPrecioAlumno());
    }
    @Test
    @DisplayName("precio alumno: 29 alumnos")
    void calcularPrecioAlumno4() {
        e = new Excursion(29);
        assertEquals(4000/29, e.calcularPrecioAlumno());
    }

    @Test
    @DisplayName("total: 100 alumnos")
    void calcularCosteExcursio() {
        e = new Excursion(100);
        assertEquals(6500,e.calcularCosteExcursio());
    }
    @Test
    @DisplayName("total: 50 alumnos")
    void calcularCosteExcursion2() {
        e = new Excursion(50);
        assertEquals(3500, e.calcularCosteExcursio());
    }
    @Test
    @DisplayName("total: 30 alumnos")
    void calcularCosteExcursion3() {
        e = new Excursion(30);
        assertEquals(2850, e.calcularCosteExcursio());
    }
    @Test
    @DisplayName("total: 29 alumnos")
    void calcularCosteExcursion4() {
        e = new Excursion(29);
        assertEquals(4000, e.calcularCosteExcursio());
    }

}