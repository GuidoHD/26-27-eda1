public class Main {
    public static void main(String[] args) {

        ArraySimulado numeros = new ArraySimulado(3);

        numeros.set(0, 10);
        numeros.set(1, 20);
        numeros.set(2, 30);

        for (int i = 0; i < numeros.length(); i++) {
            System.out.println(numeros.get(i));
        }

        System.out.println("Tamaño: " + numeros.length());
    }
}