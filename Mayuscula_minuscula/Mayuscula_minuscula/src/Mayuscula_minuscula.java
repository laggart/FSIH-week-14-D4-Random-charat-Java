import java.util.Scanner;

public class Mayuscula_minuscula {
    public static void main(String[] args) throws Exception {

       Scanner teclado = new Scanner(System.in);
        
        // Solicitamos al usuario que ingrese un texto
        System.out.println("Ingresa un texto cualquiera:");
        String texto = teclado.nextLine();
        
        // Variables auxiliares para verificar el tipo de texto
        boolean todasMayusculas = true;
        boolean todasMinusculas = true;
        
        // Verificar si el texto está compuesto solo de minúsculas o solo de mayúsculas
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            
            if (Character.isUpperCase(caracter)) {
                todasMinusculas = false;
            } else if (Character.isLowerCase(caracter)) {
                todasMayusculas = false;
            }
        }
        
        // Determinar el tipo de texto
        if (todasMayusculas) {
            System.out.println("El texto tiene solo de mayúsculas.");
        } else if (todasMinusculas) {
            System.out.println("El texto tiene solo de minúsculas.");
        } else {
            System.out.println("El texto tiene mayúsculas y minúsculas.");
        }
        
        teclado.close();
        
    }
}
