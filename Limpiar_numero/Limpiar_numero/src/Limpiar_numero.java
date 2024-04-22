import java.util.Scanner;

public class Limpiar_numero {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el número de teléfono:");
        String numeroUsuario = teclado.nextLine();

        String numeroLimpio = numeroUsuario.replace(" ", "").replace("-", "").replace(".","");

        System.out.println("El numero que voy a pasar para la DB es: " +numeroLimpio);

        teclado.close();
        
    }
}
