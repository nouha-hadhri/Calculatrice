public class Main {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
// Affichage du message de bienvenue
        System.out.println("Bienvenue");
        int mult = Operation.multiplication(a, b);
        int sous = Operation.soustraction(a, b);
        int add = Operation.addition(a, b);
        double div = Operation.division(a, b);

        System.out.println(a + " * " + b + " = " + mult);
        System.out.println(a + " - " + b + " = " + sous);
        System.out.println(a + " + " + b + " = " + add);
        System.out.println(a + " / " + b + " = " + div);
    }
}



