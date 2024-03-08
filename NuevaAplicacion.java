import java.util.Scanner;

/**
 *
 * @author Paolo
 */
public class ReplaceScanner {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String cadena = entrada.nextLine();

        String subcadena = "Daniela";
        String NuevaCadena = cadena.replaceAll(subcadena, "Esther");
        System.out.printf("La nueva frase reemplazada es: %s", NuevaCadena);

    }
}
