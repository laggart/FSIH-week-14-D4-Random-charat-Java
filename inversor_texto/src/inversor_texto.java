import java.util.Scanner;

public class inversor_texto {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        //Introducimos la frase
        System.out.println("Introduce una frase");
        String fraseUsuario = teclado.nextLine();

        for (int i = fraseUsuario.length() -1; i >= 0; i--) {
            System.out.print(fraseUsuario.charAt(i) + "");
        }
        System.out.println(" ");
        teclado.close();
    }
}
