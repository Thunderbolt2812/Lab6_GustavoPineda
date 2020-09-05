/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_gustavopineda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Admin {
    private ArrayList<Canciones> ac = new ArrayList();
    private File archivo = null;

    public Admin(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Canciones> getAc() {
        return ac;
    }

    public void setAc(ArrayList<Canciones> ac) {
        this.ac = ac;
    }
    

    @Override
    public String toString() {
        return "Lista de Carros=" + ac;
    }
    public void setPersona(Canciones c) {
        this.ac.add(c);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (Canciones c : ac) {
                bw.write(c.getTitulo() + "|");
                bw.write(c.getPuntuacion() + "|");
                bw.write(c.getAño() + "|");
                bw.write(c.getArtista() + "|");
                bw.write(c.getAlbum() + "|");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        ac = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {
                    ac.add(new Canciones(sc.next(),sc.nextInt(),sc.nextInt(),sc.next(),sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
