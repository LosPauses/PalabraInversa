package paraulainversa;

public class ParaulaInversa {

    LT entr = new LT();
    char palabra[];

    public void inicio() {
        System.out.println("Escribe una palabra: ");
        String s = entr.llegirLinia();
        palabra = s.toCharArray();
        System.out.println("\n" + "Palabra inversa: ");
        for (int i = 3; i >= 0; i--) {
            System.out.print(palabra[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new ParaulaInversa().inicio();
    }

}
