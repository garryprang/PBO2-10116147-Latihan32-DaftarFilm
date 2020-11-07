/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan32.daftarfilm;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk menampilkan daftar film.
 */

public class Film {
    String filmName;
    String filmGenre;
    Double filmRating;
    int filmDuration;
       
    public void FilmSedangTayang() {
    
    System.out.println("Judul\t: " + filmName);
    System.out.println("Genre\t: " + filmGenre);
    System.out.println("Rating\t: " + filmRating );
    System.out.println("Durasi\t: " + filmDuration + " menit");
    System.out.println();
}
}
