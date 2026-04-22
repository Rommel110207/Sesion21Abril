package ni.edu.uam;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main()
    {
        List<Producto> productos = new ArrayList<>();

        double monto =0 , total=0;

        Producto cafe = new Producto("cafe",2,200);

        Producto pan = new Producto("pan",2,200);

        productos.add(cafe);
        productos.add(pan);

        for (Producto producto : productos) {
            System.out.println(producto);
            total = total + producto.getCantidad();
            monto += total;
        }
        System.out.println("Monto total: " + monto);


    }
}
