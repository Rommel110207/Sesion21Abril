package ni.edu.uam.servicios;

import ni.edu.uam.interfaces.ProductoInterface;
import ni.edu.uam.modelos.Producto;

import java.util.ArrayList;
import java.util.List;


public class ProductoServicio implements ProductoInterface
{

    private List<Producto> productos;

    public ProductoServicio() {
        this.productos = new ArrayList<>();
    }

    @Override
    public void agregarProductos(String nombre, double precio, int cantidad) {

        this.productos.add(new Producto(nombre, cantidad, precio));

    }

    @Override
    public java.util.List<Producto> obtenerProductos() {
        return productos;
    }

    public double getMonto()
    {
        double total=0; double monto=0;
        for (Producto producto : productos) {
            total= producto.getCantidad()*producto.getPrecio();

            monto+=total;


        }
        return monto;

    }

    public StringBuilder getFactura()
    {
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Factura: ");
        mensaje.append("\n");
        for (Producto prod : productos)
        {
            mensaje.append(prod.getNombre());
            mensaje.append("|");
            mensaje.append(prod.getPrecio());
            mensaje.append("|");
            mensaje.append(prod.getCantidad());
            mensaje.append("|");
            mensaje.append(prod.getPrecio()*prod.getCantidad());
            mensaje.append("|");





        }
        return mensaje;

    }





}
