package ud5.rol;

import java.util.Arrays;
import java.util.Scanner;

import ud5.rol.Personaje.Raza;

public class AppCreaPersonaje {
    public static void main(String[] args) throws Exception {
        System.out.println("JUEGO DE ROL: Creación de Personaje");

        Personaje p = Util.importarJson();
        if (p != null) {
            System.out.println("Personaje cargado actualmente:");
            p.mostrar();
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Cómo quieres crear el personaje? ");
        System.out.println("1.- Indicar sólo el nombre");
        System.out.println("2.- Indicar el nombre y la raza");
        System.out.println("3.- Indicar el nombre, la raza y los atributos físicos");
        System.out.println("4.- Indicar todos los atributos");
        int opcion = sc.nextInt();
        sc.nextLine(); // captura el [ENTER] de la entrada anterior

        Personaje personaje = null;
        int puntosVida = -1;

        switch (opcion) {
            case 4:
                System.out.print("Nivel: ");
                int nivel = sc.nextInt();
                System.out.print("Experiencia: ");
                int exp = sc.nextInt();
                System.out.print("Puntos de vida: ");
                puntosVida = sc.nextInt();
            case 3:
                System.out.print("Fuerza: ");
                int fuerza = sc.nextInt();
                System.out.print("Agilidad: ");
                int agilidad = sc.nextInt();
                System.out.print("Constitución: ");
                int constitucion = sc.nextInt();
                if (puntosVida == -1) {
                    puntosVida = constitucion + Personaje.PUNTOS_VIDA_BASE;
                }
            case 2:
                try {
                    System.out.println("Raza: ");
                    Raza raza = Raza.valueOf(sc.nextLine().toUpperCase());

                } catch (Exception e) {
                    System.out.println(
                            "Error!! La raza debe ser una de las siguientes: " + Arrays.toString(Raza.values()));
                }
            case 1: /* .. */
                System.out.println("Nombre: ");
                String nombre = sc.nextLine();
                break;
        }
        // Mostrar el personaje
        personaje.mostrar();
        System.out.println(personaje);
        Util.exportarJson(personaje);
        // Opcional: guardar en fichero de texto JSON.

        // Personaje aragorn = new Personaje("Aragorn", "fassadad", 98, 87, 67,15,
        // 15785, 150);

    }
}
