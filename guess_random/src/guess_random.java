import java.util.Scanner;

public class guess_random {
    public static void main(String[] args) throws Exception {
        // generamos el número aleatorio
        int numAleatorio = (int)(Math.random() * 5 +1);
        Scanner teclado = new Scanner(System.in);
        int numIntentos = 0;
        int intentoUser;

        System.out.println("Adivina el número del 1 al 5");
        do {
            System.out.println("Intento numero:" + (numIntentos +1) + " : ");
            intentoUser = teclado.nextInt();
            numIntentos++;

            if (intentoUser == numAleatorio) {
                System.out.println("Wow eres legeremante? lo has conseguido en " + numIntentos + " intentos");
            } else { System.out.println("Ese no es el número intenta de nuevo con el Legeremens"); }

        } while (intentoUser !=  numAleatorio);
        teclado.close();
    }
}
