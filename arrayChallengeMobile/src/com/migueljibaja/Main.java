package com.migueljibaja;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Celular miCelular = new Celular(987574616);
    public static void main(String[] args) {
        boolean quit = false;

        encenderCelular();
        mostrarOpciones();
        while (!quit) {
            //System.out.println("Ingrese una opción : ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0 :
                    System.out.println(" Apagando....");
                    quit = true;
                    break;
                case 1 :
                    miCelular.printListaContactos();
                    break;
                case 2 :
                     agregaNuevoContacto();
                     break;
                case 3 :
                    modificaContacto();
                    break;
                case 4 :
                    eliminaContacto();
                    break;
                case 5 :
                    buscarUnContacto();
                    break;
                case 6 :
                    mostrarOpciones();
                    break;




            }
        }


    }

    private static void encenderCelular() {
        System.out.println("Iniciando el celular.....");
    }
    private static void mostrarOpciones() {
        //System.out.println("\nIngrese una opción: \n");
        System.out.println("0 - Apagar celular");
        System.out.println("1 - Mostrar contactos");
        System.out.println("2 - Agregar contacto");
        System.out.println("3 - Actualizar contacto");
        System.out.println("4 - Eliminar contacto");
        System.out.println("5 - Buscar un contacto");
        System.out.println("6 - Lista de opciones");
        System.out.println("Elige una opción: ");
    }

    private static void eliminaContacto(){
        System.out.println("Ingrese el nombre del contacto a eliminar :");
        String nombre = scanner.nextLine();
        Contacto contactoExistente = miCelular.consultaContacto(nombre);
        if (contactoExistente == null) {
            System.out.println( "Contacto no encontrado\n");
            return;
        }
        miCelular.borrarContacto(contactoExistente);


    }

    private static void buscarUnContacto(){
        System.out.println("Ingrese el nombre del contacto a buscar :");
        String nombre = scanner.nextLine();
        Contacto contactoExistente = miCelular.consultaContacto(nombre);
        if (contactoExistente == null) {
            System.out.println( "Contacto no encontrado\n");
            return;
        }
        System.out.println("Contacto encontrado\n");
        System.out.println(contactoExistente.getNombreContacto() + "-->" + contactoExistente.getNrotelefono());

    }

    private static void agregaNuevoContacto() {
        System.out.println("Ingrese el nombre del contacto : ");
        String name = scanner.nextLine();
        System.out.println("Ingrese el nro de celular : ");
        long nroCel = scanner.nextLong();
        Contacto nuevoContacto = new Contacto(name,nroCel);
        if (miCelular.agregarContacto(nuevoContacto)) {
            System.out.println("Nuevo contacto agregado: " + nuevoContacto.getNombreContacto() + "--> " + nuevoContacto.getNrotelefono());
        } else {
            System.out.println("No se pudo agregar el contacto, ya existe");
        }
    }

    private static void modificaContacto() {
        System.out.println("Ingrese el nombre del contacto a cambiar :");
        String nombre = scanner.nextLine();
        Contacto contactoExistente = miCelular.consultaContacto(nombre);
        if (contactoExistente == null) {
            System.out.println( "Contacto no encontrado\n");
            return;
        }

        System.out.println("Ingrese el nombre del nuevo contacto :");
        String nuevoNombre = scanner.nextLine();
        System.out.println("Ingrese el nuevo número ");
        long nuevoCelu = scanner.nextLong();
        Contacto contactoNuevo = new Contacto(nuevoNombre,nuevoCelu);
        if (miCelular.actualizaContacto(contactoExistente,contactoNuevo)){
            System.out.println("Se actualizo correctamente..");
        }else {
            System.out.println("No se pudo actualizar");
        }




    }
}
