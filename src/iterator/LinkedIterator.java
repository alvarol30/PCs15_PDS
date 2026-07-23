package iterator;

public class LinkedIterator implements Iterator{
    private Nodo current;

    public LinkedIterator(Nodo head){
        this.current = head;
    }

    @Override
    public boolean hasNext(){
        return current != null;
    }

    @Override
    public Object next(){
        Object producto= current.getProducto();
        current= current.getSiguiente();
        return producto;
    }
}
