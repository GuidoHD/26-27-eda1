import java.util.ArrayList;

public class ArraySimulado {

    private ArrayList<Integer> elementos;
    private int tamaño;

    public ArraySimulado(int tamaño) {
        if (tamaño < 0) {
            tamaño = 0;
        }

        this.tamaño = tamaño;
        elementos = new ArrayList<>();

        for (int i = 0; i < tamaño; i++) {
            elementos.add(0);
        }
    }

    public void set(int indice, int valor) {
        comprobarIndice(indice);
        elementos.set(indice, valor);
    }

    public int get(int indice) {
        if (indice < 0 || indice >= tamaño) {
            System.out.println("Índice no válido");
            return -1;
        }

        return elementos.get(indice);
    }

    // Consultar el tamaño
    public int length() {
        return tamaño;
    }

}

