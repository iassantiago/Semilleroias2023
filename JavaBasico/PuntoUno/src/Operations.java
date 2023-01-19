import java.util.Scanner;
public class Operations {
    Client[] clientes = new Client[4];
    public void opcionA() { // Cliente nuevo

        Scanner nom = new Scanner(System.in);
        Scanner ced = new Scanner(System.in);

        System.out.println("Hola, ingresa nombre: ");
        String nombre = nom.nextLine();
        System.out.println("ingresar cedula: ");
        int cedula = ced.nextInt();

        boolean agregado = false;

        if(validarArrayClientes()){

            Client client = new Client(nombre, cedula);
            for (int i=0; i < clientes.length; i++){
                if(clientes[i] == null){
                    clientes[i] = client;
                    agregado = true;
                    break;
                }
            }

            if(agregado){
                System.out.println("Se agrego correctamente el cliente ");
            } else {
                System.out.println("No se pudo agregar el cliente ");
            }
        } else {
            System.out.println("La DB de 10 posiciones se encuentra llena ");
        }
    }

    public boolean validarArrayClientes(){
        for (int i=0; i < clientes.length; i++){
            if(clientes[i] == null){
                return true;
            }
        }

        if(clientes.length == 4){
            Client[] clientesAux = new Client[10];
            for (int i=0; i < clientes.length; i++){
                clientesAux[i] = clientes[i];
            }
            clientes = clientesAux;
            return true;
        }
        return false;
    }

    public void opcionB() { // Borrar Cliente
        Client[] clientesAux = new Client[clientes.length];
        Scanner pos = new Scanner(System.in);
        System.out.println("Cual es la posicion del cliente que desea borrar: ");
        int posicion = pos.nextInt();

        int j = 0;
        for(int i = 0; i < clientes.length; i++){
            if(i != posicion){
                clientesAux[j] = clientes[i];
                j+=1;
            }
        }
        clientes = clientesAux;
    }

    public void opcionC() { // Buscar Cliente
        Scanner scn = new Scanner(System.in);
        System.out.println("Numero de cedula del cliente a buscar: ");
        int cedula = scn.nextInt();

        boolean encontrado = false;

        for(int i = 0; i < clientes.length; i++){
            if(clientes[i].getCedula() == cedula){
                System.out.println("El cliente que se busca está en la posición "+i+", El cliente se llama "+clientes[i].getNombre()+" y su cédula es "+cedula);
                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.println("No existe el usuario con cédula es "+cedula);
        }
    }

    public boolean opcionCejemplo() { // Buscar Cliente
        Scanner scn = new Scanner(System.in);
        System.out.println("Numero de cedula del cliente a buscar: ");
        int cedula = scn.nextInt();

        boolean encontrado = false;

        for(int i = 0; i < clientes.length; i++){
            if(clientes[i].getCedula() == cedula){
                System.out.println("El cliente que se busca está en la posición "+i+", El cliente se llama "+clientes[i].getNombre()+" y su cédula es "+cedula);
                encontrado = true;
                break;
            }
        }

        if(!encontrado){
            System.out.println("No existe el usuario con cédula es "+cedula);
        }
        return encontrado;
    }

    public void opcionD() { // Mostrar Clientes
        for(int i = 0; i < clientes.length; i++){
        if(clientes[i] != null) {
            System.out.println("Cliente " + i + ": El cliente se llama " + clientes[i].getNombre() + " y su cédula es " + clientes[i].getCedula());
        }
        }
    }
}