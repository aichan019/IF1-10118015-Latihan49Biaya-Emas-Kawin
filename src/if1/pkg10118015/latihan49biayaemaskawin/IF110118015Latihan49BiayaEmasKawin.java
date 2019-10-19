/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan49biayaemaskawin;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program yang menampilkan perhitungan
 *                        harga emas sesuai berat pergramnya.
 */
public class IF110118015Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Format Curency Indonesia
        DecimalFormat ind = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp.");
        formatRp.setMonetaryDecimalSeparator('.');
        formatRp.setGroupingSeparator('.');
        ind.setDecimalFormatSymbols(formatRp);
        
        Emas emas = new Emas();
        Scanner input = new Scanner(System.in);
        emas.setBeratEmas(15.7);
        emas.setHargaEmas(570000);
        
        System.out.println("##### Program Emas #####");
        System.out.println("Berat Emas : "+ emas.getBeratEmas());
        System.out.println("Harga Emas per-gram : "+ind.format(emas.getHargaEmas()));
        System.out.println("");
        System.out.println("Harga Emas adalah = " + ind.format(emas.totalBayar(emas.getBeratEmas(), emas.getHargaEmas())));
    }
    
}
