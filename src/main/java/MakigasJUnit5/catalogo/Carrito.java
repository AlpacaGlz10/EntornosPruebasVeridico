package MakigasJUnit5.catalogo;

public interface Carrito {
    void agregar(Producto p);
    int cantidad();
    int total();

}