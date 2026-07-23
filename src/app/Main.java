package app;
import iterator.*;
import model.Producto;

public class Main{
    public static void main(String[] args) {
        MenuCafeteria menu= new MenuCafeteria();
        menu.addProducto(new Producto("Espresso", "Cafes", 6.5));
        menu.addProducto(new Producto("Cappuccino", "Cafes", 8.0));
        menu.addProducto(new Producto("Latte", "Cafes", 8.5));
        menu.addProducto(new Producto("Te verde", "Tes", 5.0));
        menu.addProducto(new Producto("Alfajor", "Postres", 4.5));
        menu.addProducto(new Producto("Cheesecake", "Postres", 9.0));

        Iterator iterador= menu.createIterator();
        System.out.println("****** MENÚ CAFETERÍA *****");
        while (iterador.hasNext()){
            Producto producto = (Producto) iterador.next();
            System.out.println(producto);
        }
    }
}