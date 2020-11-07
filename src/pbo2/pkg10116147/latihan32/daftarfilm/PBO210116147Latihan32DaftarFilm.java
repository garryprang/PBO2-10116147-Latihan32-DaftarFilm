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

public class PBO210116147Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Film flm = new Film();

        System.out.println("======= Daftar Film Yang Sedang Tayang =======\n");

        flm.filmName = "Venom";
        flm.filmGenre = "Aksi, Petualangan, Fiksi Ilmiah";
        flm.filmRating = 8.5;
        flm.filmDuration = 120;
    
        flm.FilmSedangTayang();
       
        flm.filmName = "Smallfoot";
        flm.filmGenre = "Animasi, Petualangan, Komedi";
        flm.filmRating = 9.0;
        flm.filmDuration = 96;
        
        flm.FilmSedangTayang();
        
        flm.filmName = "Crazy Rich Asian";
        flm.filmGenre = "Komedi, Drama, Romansa";
        flm.filmRating = 7.8;
        flm.filmDuration = 119;
      
        flm.FilmSedangTayang();

        flm.filmName = "Asih";
        flm.filmGenre = "Horor";
        flm.filmRating = 6.0;
        flm.filmDuration = 100;

        flm.FilmSedangTayang();

    }

    

}