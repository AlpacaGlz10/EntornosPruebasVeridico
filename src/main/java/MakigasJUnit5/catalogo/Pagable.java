package MakigasJUnit5.catalogo;

import MakigasJUnit5.Pago.PagoException;
import MakigasJUnit5.Pago.ProveedorPagos;

public interface Pagable {
    void pagar(ProveedorPagos pagos) throws PagoException;


}
