package gestion_aeropuertos;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class GestionAeropuertos {

    /*
    Llegamos al ejercicio final de esta sección
    Crearemos un menú con las siguientes opciones:
       - Añadir Aeropuerto: nos pedira los datos de un aeropuerto. 
        También si es privado o publico, pidiendo los datos concretos de cada uno.
       - Añadir Avion: pide los datos para añadir un avion. 
        Pide a que aeropuerto que pertence
       - Mostrar info de Aeropuerto: pide un aeropuerto y muestra su info.
       - Mostrar años que lleva abierto un aeropuerto: pide un aeropuerto 
        y muestra los años que lleva abierto
       - Mostrar ganancias de un aeropuerto: pide un aeropuerto y una cantidad 
        y muestra sus ganancias finales.
       - Salir: Sale del programa
     */
    public static void main(String[] args) {

        final int MAX_AEROPUERTOS = 20;

        final int TIPO_PUBLICO = 1;
        final int TIPO_PRIVADO = 2;

        final int AVION_ACTIVO = 1;
        final int AVION_NO_ACTIVO = 2;

        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        sc.useLocale(Locale.US);

        Aeropuerto aeropuertos[] = new Aeropuerto[MAX_AEROPUERTOS];
        int numeroAeropuertos = 0;

        Aeropuerto aeropuertoAux;
        Direccion dAux;
        Avion avionAux;
        boolean salir = false;
        int opcion, numero, anioInauguracion, capacidad, eleccionTipo, eleccionActivo, numTrabajadoresDisc, numSocios, numAsientos, idAeropuerto;
        String nombre, pais, calle, ciudad;

        double financiacion, velMax, ganancia;

        while (!salir) {

            System.out.println("1. Añadir Aeropuerto");
            System.out.println("2. Añadir Avion");
            System.out.println("3. Mostrar info de Aeropuerto");
            System.out.println("4. Mostrar años que lleva abierto un aeropuerto");
            System.out.println("5. Mostrar ganancias de un aeropuerto");
            System.out.println("6. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:

                        if (numeroAeropuertos > MAX_AEROPUERTOS) {
                            System.out.println("No se pueden meter mas aeropuertos");
                        } else {

                            System.out.print("Escribe el nombre del aeropuerto: ");
                            nombre = sc.next();

                            System.out.print("Escribe el pais del aeropuerto: ");
                            pais = sc.next();

                            System.out.print("Escribe el calle del aeropuerto: ");
                            calle = sc.next();

                            System.out.print("Escribe el numero del aeropuerto: ");
                            numero = validaNumero(0, Integer.MAX_VALUE);

                            System.out.print("Escribe el ciudad del aeropuerto: ");
                            ciudad = sc.next();

                            System.out.print("Escribe el año de inauguracion del aeropuerto: ");
                            anioInauguracion = validaNumero(0, Integer.MAX_VALUE);

                            System.out.print("Escribe el capacidad del aeropuerto: ");
                            capacidad = validaNumero(0, Integer.MAX_VALUE);

                            System.out.print("¿Aeropuerto público o privado? (1=público, 2=privado)");
                            eleccionTipo = validaNumero(1, 2);

                            dAux = new Direccion(pais, calle, numero, ciudad);

                            if (eleccionTipo == TIPO_PUBLICO) {

                                System.out.println("Escribe la financiacion del aeropuerto");
                                financiacion = sc.nextDouble();

                                System.out.println("Escribe el numero de trabajadores discapacitados del aeropuerto");
                                numTrabajadoresDisc = validaNumero(0, Integer.MAX_VALUE);

                                aeropuertoAux = new AeropuertoPublico(financiacion, numTrabajadoresDisc, nombre, dAux, anioInauguracion, capacidad);

                            } else {

                                System.out.println("Escribe el numero de socios del aeropuerto");
                                numSocios = validaNumero(0, Integer.MAX_VALUE);

                                aeropuertoAux = new AeropuertoPrivado(numSocios, nombre, dAux, anioInauguracion, capacidad);

                            }

                            aeropuertos[numeroAeropuertos] = aeropuertoAux;
                            numeroAeropuertos++;

                        }

                        break;
                    case 2:

                        if (numeroAeropuertos == 0) {
                            System.out.println("No hay aeropuertos, debes añadir alguno");
                        } else {

                            System.out.println("Escribe el modelo del avion");
                            nombre = sc.next();

                            System.out.println("Escribe el numero de asientos del avion");
                            numAsientos = validaNumero(1, Integer.MAX_VALUE);

                            System.out.println("Escribe la velocidad maxima del avion");
                            velMax = sc.nextDouble();

                            System.out.println("¿Activo o no activo? (1=activo, 2=no activo)");
                            eleccionActivo = validaNumero(1, 2);

                            avionAux = new Avion(nombre, numAsientos, velMax);

                            if (eleccionActivo == AVION_ACTIVO) {
                                avionAux.setActivado(true);
                            }

                            System.out.println("Elige un aeropuerto");
                            mostrarAeropuertos(aeropuertos, numeroAeropuertos);

                            System.out.println("Elige un aeropuerto");
                            idAeropuerto = sc.nextInt();

                            aeropuertoAux = seleccionarAeropuerto(aeropuertos, numeroAeropuertos, idAeropuerto);

                            if (aeropuertoAux != null) {
                                aeropuertoAux.aniadirAvion(avionAux);
                            } else {
                                System.out.println("No existe el aeropuerto. El avion es desechado");
                            }

                        }

                        break;
                    case 3:
                        System.out.println("Elige un aeropuerto");
                        mostrarAeropuertos(aeropuertos, numeroAeropuertos);

                        System.out.println("Elige un aeropuerto");
                        idAeropuerto = sc.nextInt();

                        aeropuertoAux = seleccionarAeropuerto(aeropuertos, numeroAeropuertos, idAeropuerto);

                        if (aeropuertoAux != null) {
                            System.out.println(aeropuertoAux);
                        } else {
                            System.out.println("No existe el aeropuerto");
                        }

                        break;
                    case 4:
                        System.out.println("Elige un aeropuerto");
                        mostrarAeropuertos(aeropuertos, numeroAeropuertos);

                        System.out.println("Elige un aeropuerto");
                        idAeropuerto = sc.nextInt();

                        aeropuertoAux = seleccionarAeropuerto(aeropuertos, numeroAeropuertos, idAeropuerto);

                        if (aeropuertoAux != null) {
                            System.out.println("Lleva " + aeropuertoAux.aniosAbierto() + " años abierto");
                        } else {
                            System.out.println("No existe el aeropuerto");
                        }
                        break;
                    case 5:

                        System.out.println("Elige un aeropuerto");
                        mostrarAeropuertos(aeropuertos, numeroAeropuertos);

                        System.out.println("Elige un aeropuerto");
                        idAeropuerto = sc.nextInt();

                        aeropuertoAux = seleccionarAeropuerto(aeropuertos, numeroAeropuertos, idAeropuerto);

                        if (aeropuertoAux != null) {

                            System.out.println("Escribe la ganacia del aeropuerto");
                            ganancia = sc.nextDouble();

                            aeropuertoAux.gananciasTotales(ganancia);
                        } else {
                            System.out.println("No existe el aeropuerto");
                        }

                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
            }
        }

    }

    public static int validaNumero(int minimo, int maximo) {

        Scanner sc = new Scanner(System.in);

        if (minimo > maximo) {
            int aux = minimo;
            minimo = maximo;
            maximo = aux;
        }

        int numero;
        do {

            System.out.println("Escribe un numero");
            numero = sc.nextInt();

            if (!(numero >= minimo && numero <= maximo)) {
                System.out.println("Debes escribir un numero entre " + minimo + " y " + maximo);
            }

        } while (!(numero >= minimo && numero <= maximo));

        return numero;

    }

    public static void mostrarAeropuertos(Aeropuerto[] aeropuertos, int numeroAeropuertos) {

        for (int i = 0; i < numeroAeropuertos; i++) {
            if (aeropuertos[i] instanceof AeropuertoPrivado) {
                System.out.println("Id: " + aeropuertos[i].getId() + " Nombre: " + aeropuertos[i].getNombre() + "(privado)");
            } else {
                System.out.println("Id: " + aeropuertos[i].getId() + " Nombre: " + aeropuertos[i].getNombre() + "(publico)");
            }

        }

    }

    public static Aeropuerto seleccionarAeropuerto(Aeropuerto[] aeropuertos, int numeroAeropuertos, int idAeropuerto) {

        for (int i = 0; i < numeroAeropuertos; i++) {
            if (aeropuertos[i].getId() == idAeropuerto) {
                return aeropuertos[i];
            }
        }

        return null;

    }

}
