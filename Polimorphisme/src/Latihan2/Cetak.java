/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan2;

/**
 *
 * @author LENOVO
 */
public class Cetak {
    public static void main(String[] args) {
    Line dora = new Line(1, -3, 5, 5);
        Line masha = new Line(6, 6, -1, 3);
        
        System.out.println("Panjang garis dora : " + dora.getLength());
        System.out.println("Panjang garis masha : " + masha.getLength());
        
        if(masha.isGreater(masha, dora)){
            System.out.println("garis masha lebih panjang dari dora");
        }else if(masha.isLess(masha, dora)){
            System.out.println("garis masha lebih pendek dari dora");
        }else{
            System.out.println("garis masha sama panjang dengan dora");
        }
    }
}
