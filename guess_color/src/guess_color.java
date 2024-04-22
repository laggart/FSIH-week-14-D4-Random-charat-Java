import java.util.Scanner;

public class guess_color {
    public static void main(String[] args) throws Exception {
        String color = "rojo";

        Scanner teclado = new Scanner(System.in);
        boolean match = false;

        System.out.println("Adivina el color (Pista solo primarios y secundarios)");
        while (!match) {
            String colorUser = teclado.nextLine();
            if (colorUser.equalsIgnoreCase(color)) {
                System.out.println("Lo has conseguido!!!");
                match = true;
            } else {
                System.out.println("Ese no es el color! Intenta de nuevo");
            }
        }
        teclado.close();
    }
}
