/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_gustavopineda;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Canciones {
    private String titulo;
    private int puntuacion;
    private int año;
    private String artista;
    private String album;

    public Canciones() {
    }

    public Canciones(String titulo, int puntuacion, int año, String artista, String album) {
        this.titulo = titulo;
        this.puntuacion = puntuacion;
        this.año = año;
        this.artista = artista;
        this.album = album;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public String toString() {
        return "Titulo: "+titulo+"-"+"Artista: "+artista;
    }
    
    
}
