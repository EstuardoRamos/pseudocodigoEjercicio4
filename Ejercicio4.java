import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        int edad, edadMayor = 0, edadMenor = 0, edadM = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese una edad: ");
            edad = scanner.nextInt();
            if (edad > edadMayor) {
                edadMayor = edad;
            } else {
                edad = edadM;
                if (edad < edadM) {
                    edadMenor = edad;
                }
            }
        }
        System.out.println("La edad mayor es " + edadMayor);
        System.out.println("La edad menor es " + edadMenor);
    }

}