import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Operations operations = new Operations();
        int opcion=0;
        do{

        Scanner entrada = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Añadir Cliente Nuevo");
        System.out.println("2. Borrar un Cliente");
        System.out.println("3. Buscar un Cliente");
        System.out.println("4. Mostrar Los Clientes");
        System.out.println("5. Salir");
        System.out.println("Por favor selecciona una opcion: ");

        opcion = entrada.nextInt();
        System.out.println("Seleccionaste la opcion #" + opcion);

        switch (opcion){
            case 1:
                operations.opcionA();
                break;
            case 2:
                operations.opcionB();
                break;
            case 3:
                operations.opcionC();
                break;
            case 4:
                operations.opcionD();
                break;
            default:
                break;
        }
        } while(opcion < 5 && opcion > 0);
    }
}