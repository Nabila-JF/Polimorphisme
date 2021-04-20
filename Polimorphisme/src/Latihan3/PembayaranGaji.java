/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author LENOVO
 */
public class PembayaranGaji {
    public int hitungGaji(Pegawai peg){
    int uang=peg.gaji();
    if(peg instanceof Direktur)
        uang+=((Direktur)peg).tunjangan();
    if(peg instanceof Staf)
        uang+=((Staf)peg).Bonus();
        return uang;
    }
    public static void main(String[] args) {
        PembayaranGaji pg=new PembayaranGaji();
        Staf ali=new Staf();
        Direktur tony=new Direktur();
        System.out.println("Gaji yang dibayarkan untuk Staf = "+pg.hitungGaji(ali));
        System.out.println("Gaji yang dibayarkan kepada Direktur = "+pg.hitungGaji(tony));
    }

    private void tunjangan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Bonus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
