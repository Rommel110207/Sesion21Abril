import ni.edu.uam.modelos.Producto;
import ni.edu.uam.servicios.ProductoServicio;

import javax.swing.*;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main()
    {
        ProductoServicio productos = new ProductoServicio();
        /*Scanner teclado = new Scanner(System.in);


        double monto =0 , total=0;

        System.out.println("Ingrese el nombre del producto");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la cantidad del producto");
        int cantidad = teclado.nextInt();
        System.out.println("Ingrese el precio del producto");
        double precio = teclado.nextDouble();
        teclado.nextLine();



        System.out.println("Factura");
        System.out.println("Producto: "+nombre);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Precio: "+precio);

         System.out.println("Total pagar "+ cantidad*precio);*/

        String menu= "Jaguar Coffee \n1. Agregar\n2. Ver\n3. Salir\n Opción ";
        String nombre, precio, cantidad, opcion= "0";

        do {
            try
            {
                opcion = JOptionPane.showInputDialog(null, menu);

                switch (opcion)
                {
                    case "1"->
                    {
                        nombre = JOptionPane.showInputDialog(null, "Nombre del producto: ");
                        precio = JOptionPane.showInputDialog(null, "Precio del producto: ");
                        cantidad = JOptionPane.showInputDialog(null, "Cantidad del producto: ");
                        productos.agregarProductos(nombre, Double.parseDouble(precio), Integer.parseInt(cantidad));

                    }

                    case "2" ->
                    {


                       JOptionPane.showMessageDialog(null, productos.getFactura());

                    }

                    case "3" ->
                    {
                        JOptionPane.showMessageDialog(null, "Gracias por su compra");
                    }

                    default ->
                    {
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                    }


                }

            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, menu);
            }

        }while(!opcion.equals("3"));



    }
}
