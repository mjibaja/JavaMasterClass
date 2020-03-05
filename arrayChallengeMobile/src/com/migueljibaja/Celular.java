package com.migueljibaja;

import java.util.ArrayList;

public class Celular {
    private long miNroTelefono;
    private ArrayList<Contacto> listaContactos;

    public Celular(long miNroTelefono) {
        this.miNroTelefono = miNroTelefono;
        this.listaContactos = new ArrayList<>();

    }

    public boolean agregarContacto(Contacto contacto) {
        if (buscarContacto(contacto.getNombreContacto())>=0) {
            System.out.println("Contacto ya existe");
            return false;
        }
        listaContactos.add(contacto);
        return true;
    }

    private int buscarContacto(Contacto contacto) {
        return this.listaContactos.indexOf(contacto);
    }



    private int buscarContacto(String nombreContacto) {
        for (int i = 0; i < this.listaContactos.size() ; i++) {
            Contacto contacto = this.listaContactos.get(i);
            if (contacto.getNombreContacto().equals(nombreContacto) ) {
                return i;
            }
        }
        return -1;
    }

    public boolean borrarContacto(Contacto contacto) {
        int posContacto = buscarContacto(contacto);
        if (posContacto<0) {
            System.out.println("El contacto " + contacto.getNombreContacto() + " no fue encontrado");
            return false;
        }
        this.listaContactos.remove(posContacto);
        System.out.println("Se eliminó el contacto " + contacto.getNombreContacto());
        return true;
    }

    public boolean actualizaContacto(Contacto contactoViejo, Contacto contactoNuevo) {
        int posViejo = buscarContacto(contactoViejo);
        if (posViejo < 0) {
            System.out.println(contactoViejo.getNombreContacto() + " no está en la lista de contactos");
            return false;
        }
        this.listaContactos.set(posViejo,contactoNuevo);
        System.out.println("El contacto anterior " + contactoViejo.getNombreContacto() +" fue reemplazado por " + contactoNuevo.getNombreContacto() );
        return true;
    }
    public ArrayList<Contacto> getListaContactos(){
        return listaContactos;
    }

    public void printListaContactos() {
        System.out.println("Tu tienes " + listaContactos.size() + " contactos en tu celular");
        for (int i = 0; i < listaContactos.size(); i++) {
            System.out.println((i+1) + ". " + listaContactos.get(i).getNombreContacto()
                    + " --> " + listaContactos.get(i).getNrotelefono());
        }
    }

    public void modificaContacto(int posicion, Contacto contacto){
        listaContactos.set(posicion,contacto);
        System.out.println("El contacto nro. " + posicion+1 + " ha sido modificado" );
    }

    public Contacto consultaContacto(String nombre) {
        int posi = buscarContacto(nombre);
        if (posi >= 0) {
            return this.listaContactos.get(posi);
        }
        return null;
    }



}
