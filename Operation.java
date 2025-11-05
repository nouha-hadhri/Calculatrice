public class Operation {

    // Multiplication
    public static int multiplication(int x, int y) {
        System.out.println("Bonjour");
        return x * y;
    }

    // Addition
    public static int addition(int a, int b) {
        return a + b;
    }

    // Soustraction
    public static int soustraction(int a, int b) {
        return a - b;
    }

    // ➕ Nouvelle méthode : Division
    public static double division(int a, int b) {
    if (b != 0) {
        return (double) a / b;
    } else {
        System.out.println("Erreur : Division par 0 !");
        return 0;
    }
}

}

