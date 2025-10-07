package pilasenteros;
import java.util.Stack;

public class Pila {
    private Stack<Integer> pila;

    public Pila (){
        pila = new Stack<Integer>();
    }

    public Stack<Integer> getPila() {
        return pila;
    }
    public void setPila(Stack<Integer> pila) {
        this.pila = pila;
    }

    public void push(Integer dato){
        pila.push(dato);
    }

    public Integer pop() throws Exception {
        if (pila.isEmpty())
            throw new Exception("La pila no tiene elementos");
        return pila.pop();
    }

    public Integer peek() throws Exception{
        if (pila.isEmpty())
            throw new Exception("La pila no tiene elementos");
        return pila.peek();
    }

    public int search(Integer i) throws Exception{
        if (pila.isEmpty())
            throw new Exception("Pila vacia");
        return pila.search(i);
    }

    @Override
    public String toString() {
        String mensaje = "Elementos de la pila:\n";
        for (int i = pila.size() - 1; i >= 0; i--) {
            mensaje += pila.get(i) + "\n";
        }
        return mensaje;
    }
}