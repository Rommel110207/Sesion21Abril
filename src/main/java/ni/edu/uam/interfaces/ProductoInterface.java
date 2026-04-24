package ni.edu.uam.interfaces;

import ni.edu.uam.modelos.Producto;

import java.util.List;

public interface ProductoInterface
{
    public void agregarProductos(String nombre, double precio, int cantidad);


    public List<Producto> obtenerProductos();
    public boolean eliminarProductos(String nombre);

    public boolean editarProductos(String nombre, double precio, int cantidad);

    public boolean buscarProductos(String nombre, int cantidad, double precio);









}
