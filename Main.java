public class Main {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        // Appel de la méthode multiplication de la classe Operation
        int resultat = Operation.multiplication(a, b);

        // Affichage du résultat
        System.out.println(a + " * " + b + " = " + resultat);
    }
}

