/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Resti
 */
public class Ramen extends Menu {
   public Ramen(String nama_ramen, double harga){
        setNamaMenu(nama_ramen);
        setHarga(harga);
        setKategori("Ramen");
    }
}