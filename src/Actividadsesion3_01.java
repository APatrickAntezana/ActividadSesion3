import java.util.Scanner;

public class Actividadsesion3_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Condicional simple: verificar si el número es positivo
        if (numero > 0) {
            System.out.println("El número es positivo.");
        }

        scanner.close();
    }
}
