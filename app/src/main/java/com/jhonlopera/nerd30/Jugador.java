package com.jhonlopera.nerd30;

/**
 * Created by Jhon on 30/10/2017.
 */

public class Jugador {
    private String id, correo, nombre;
    private long puntaje;

    public Jugador() {
    }

    public Jugador(String id, String correo, String nombre,long puntaje) {
        this.id = id;
        this.correo = correo;
        this.nombre = nombre;
        this.puntaje=puntaje;
    }

    public long getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(long puntaje) {
        this.puntaje = puntaje;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
