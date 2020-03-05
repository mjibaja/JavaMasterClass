package com.migueljibaja;

public class Contacto {
    public String nombreContacto;
    public long nrotelefono;

    public Contacto(String nombreContacto, long nrotelefono) {
        this.nombreContacto = nombreContacto;
        this.nrotelefono = nrotelefono;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }


    public long getNrotelefono() {
        return nrotelefono;
    }


}
