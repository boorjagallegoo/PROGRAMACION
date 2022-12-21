public class Lista {
    private Nodo cabecera;
    private Nodo fin;
    int size;

    public void add(String dato) {
        Nodo nuevo = new Nodo(dato);

        if (listaVacia()) {
            cabecera = nuevo;
            fin = nuevo;
        } else {
            Nodo aux = cabecera;
            cabecera = nuevo;
            nuevo.setSiguiente(aux);
        }
        ++size;
    }

    public void appendv2 (String dato) {
        if (listaVacia()) {
            add(dato);
        } else {
            Nodo nuevo = new Nodo(dato);
            fin.setSiguiente(nuevo);
           fin = fin.getSiguiente();
        }

    public void append(String dato) {
        if (listaVacia()) {
            add(dato); // Si esta vacia utilizamos el add dato.
        } else {
            Nodo nuevo = new Nodo(dato);

            Nodo actual = cabecera;

            while (!actual.esFinal()) {
                actual = actual.getSiguiente();
            }

            actual.setSiguiente(nuevo);
        }

    }

    public boolean listaVacia() {
        return cabecera == null;
    }

    public String toString() {
        String resultado = "[";

        if (!listaVacia()) {
            Nodo actual = cabecera;
            resultado += actual.getDato();

            while (!actual.esFinal()) {
                actual = actual.getSiguiente();
                resultado += "," + actual.getDato();

            }
        }
        resultado += "]";
        return resultado;

    }

}