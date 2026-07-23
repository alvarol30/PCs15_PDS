package iterator;
import model.Producto;

public class MenuCafeteria implements Agregado{
    private Nodo head;
    private Nodo tail;

    public MenuCafeteria(){
    }

    public void addProducto(Producto producto){
        Nodo nuevo = new Nodo(producto);
        if (head==null){
            head= nuevo;
            tail= nuevo;
        }
        else{
            tail.setSiguiente(nuevo);
            tail= nuevo;
        }
    }

    @Override
    public Iterator createIterator(){
        return new LinkedIterator(head);
    }
}
